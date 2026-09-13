/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode visit(TreeNode root){
                TreeNode temp=root.left;
                root.left=root.right;
                root.right=temp;
 
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        //define visit operation as swap
        
        if(root==null){
            return null;
        }

            visit(root);
            invertTree(root.right);
            invertTree(root.left);
     
        return root;
    }
}
