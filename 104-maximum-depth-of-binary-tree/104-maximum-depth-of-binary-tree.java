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
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int level = 0;
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int n = q.size();
            level++;
            while(n-- > 0) {
                TreeNode curr = q.poll();
                
                if(curr.left != null) {
                    q.offer(curr.left);
                }
                
                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }
        }
        
        return level;
    }
}