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
    public int solve(TreeNode root,int ans){
        if(root==null)return 0;
        
       int lefty= solve(root.left,ans+1);
       int righty= solve(root.right,ans+1);
        return 1+Math.max(lefty,righty);
    }
    public int maxDepth(TreeNode root) {
        int ans=0;
        return solve(root,ans);
        //return ans;

    }
}
