class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //using queues to implement bfs like pattern
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;
        //add the root node to our q
        q.add(root);
        while(!q.isEmpty()){
            //the size of the queue is all the nodes at that level
            int level = q.size();
            List<Integer> in = new ArrayList<>();
            //we will go though all the levels of the tree and check the left and right of each node
            for(int i = 0; i<level; i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                //we add level amount of elements form the bottom of our queue to our list which is basically all the elements in that particular level
                in.add(q.remove().val);
            }//adding the innerlist to our list of lists
            res.add(in);
        }
        return res;
    }
}
