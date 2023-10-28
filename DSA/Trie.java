class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data){
        this.data=data;
        isTerminating=false;
        children=new TrieNode[26];
        childCount=0;
    }
}

//implementation of the trie class
public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    public void add(TrieNode root, String word) {
        //actual add function, first check whether the root contains that character as child or not, if not then create a node and recursively call for the next character, if already a child, then simply recursively call for the next character

        if(word.length()==0) {
            root.isTerminating=true;
            return;
        }
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null){
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
            root.childCount++;
        }

        add(child,word.substring(1));
    }

    public void add(String word) {
        //add function to pass the root and word, since we start traversing from the root node
        add(root, word);
    }

    public boolean search(String word){
        return search(root,word);
    }

    public boolean search(TrieNode root, String word){
        if(word.length()==0)
            return root.isTerminating;
        int index=word.charAt(0)-'a';
        TrieNode child=root.children[index];
        if(child==null)
            return false;
        return search(child,word.substring(1));
    }

    public void delete(String word){
        delete(root,word);
    }

    public void delete(TrieNode root,String word){
        if(word.length()==0) {
            root.isTerminating=false;
            return;
        }
        int index=word.charAt(0)-'a';
        TrieNode child=root.children[index];
        if(child==null)
            return;
        delete(child,word.substring(1));
        // we can delete the child only if it is terminating and and it has only one child
        if(!child.isTerminating && child.childCount==0){
            root.children[index]=null;
            root.childCount--;
            child=null;
        }
    }

    public boolean startsWith(String prefix) {
        return startsWith(root,prefix);
    }

    public boolean startsWith(TrieNode root,String prefix) {
        if(prefix.length()==0)
            return true;

        int index=prefix.charAt(0)-'a';
        TrieNode child=root.children[index];
        if(child==null)
            return false;
        return startsWith(child,prefix.substring(1));
    }

    public static void main(String[] args) {
        Trie obj=new Trie();
        obj.add("note");
        obj.add("lipbalm");
        obj.add("sushi");
        obj.add("lipstick");
        obj.add("sunny");
        System.out.println(obj.search("not"));
        obj.delete("lipbalm");
        System.out.println(obj.search("lipbalm"));
        System.out.println(obj.startsWith("sus"));
    }
}
