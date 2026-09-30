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
    public void flatten(TreeNode root) {
        TreeNode current = root;
        
        while (current != null) {
            // If the node has a left child, we need to wire it into the right side
            if (current.left != null) {
                // 1. Find the rightmost node in the left subtree
                TreeNode rightmost = current.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }
                
                // 2. Connect the original right subtree to this rightmost node
                rightmost.right = current.right;
                
                // 3. Move the entire left subtree to the right, and null out the left
                current.right = current.left;
                current.left = null;
            }
            
            // Move down to the next node on the right
            current = current.right;
        }
    }
}