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
    public boolean isBalanced(TreeNode root) {
        // If the tree is balanced, checkHeight returns the actual height.
        // If it's unbalanced, it returns -1.
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) {
            return 0; // Height of an empty tree is 0
        }

        // Recursively check the left subtree
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1; // Left subtree is unbalanced, propagate -1 up
        }

        // Recursively check the right subtree
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1; // Right subtree is unbalanced, propagate -1 up
        }

        // Check if the current node is unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // If balanced, return the height of the tree rooted at this node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}