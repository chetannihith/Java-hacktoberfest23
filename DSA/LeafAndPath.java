package DSA;

public class LeafAndPath {
    /*
     * Leaf And Path
     * You are given a binary tree of 'N' nodes.
     * Your task is to check if there exists any root to leaf path with the same representation as the leaf traversal of the tree.
     * Both, the root to leaf path and the leaf traversal, are obtained by concatenating the data of the nodes in the path.
     */

    // Link: https://www.codingninjas.com/studio/problems/leaf-andpath_764386
}

/************************************************************
 Following is the Tree node structure
 ************************************************************/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


class Solution {

    // Function to find the leaf traversal of the binary tree.
    public static void findLeafTraversal(TreeNode root, StringBuffer leafTraversal) {

        if (root == null) {
            return;
        }

        // Add the value of the node to the leaf traversal if it is a leaf node.
        if (root.left == null && root.right == null) {
            leafTraversal.append(root.val);
        }

        findLeafTraversal(root.left, leafTraversal);
        findLeafTraversal(root.right, leafTraversal);
    }

    // Function to check if a path with the same representation as leaf traversal.
    // exists or not
    public static boolean doesReqdPathExistHelper(TreeNode root, StringBuffer leafTraversal, int idx) {
        if (root == null) {
            return false;
        }

        String valString = Integer.toString(root.val);

        int valLen = valString.length();

        // Check if path does not satisfy the requirement, return false.
        if (idx + valLen > leafTraversal.length()) {
            return false;
        }
        for (int i = 0; i < valLen; i++) {
            if (valString.charAt(i) != leafTraversal.charAt(idx + i)) {
                return false;
            }
        }

        if (idx + valLen == leafTraversal.length()) {
            if (root.left == null && root.right == null) {
                return true;
            } else {
                return false;
            }
        }

        return doesReqdPathExistHelper(root.left, leafTraversal, idx + valLen)
            || doesReqdPathExistHelper(root.right, leafTraversal, idx + valLen);
    }

    public static boolean doesReqdPathExist(TreeNode root) {
        if (root == null) {
            return true;
        }

        StringBuffer leafTraversal = new StringBuffer("");

        findLeafTraversal(root, leafTraversal);

        return doesReqdPathExistHelper(root, leafTraversal, 0);
    }
}