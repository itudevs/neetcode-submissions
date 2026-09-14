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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==null || q==null) return null;
       //handle case of root being LCA

        if(Math.max(p.val,q.val)<root.val ){
             return lowestCommonAncestor(root.left,p,q);
        }
       //handle LCA in right subtree
       else if(Math.min( p.val,q.val)>root.val ){
            return lowestCommonAncestor(root.right,p,q);
        }
       //handle LCA in left subtree 
       else{
            return root;
        }
        

    }
}
