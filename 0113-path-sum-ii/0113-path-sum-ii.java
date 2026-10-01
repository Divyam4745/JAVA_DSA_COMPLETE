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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        
        dfs(root, targetSum, currentPath, result);
        
        return result;
    }
    
    private void dfs(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> result) {
        // Base case: if the node is null, just return
        if (node == null) {
            return;
        }
        
        // 1. Add the current node's value to our path
        currentPath.add(node.val);
        
        // 2. Check if we are at a leaf node AND if the remaining targetSum equals the node's value
        if (node.left == null && node.right == null && targetSum == node.val) {
            // We found a valid path! Add a *copy* of the current path to the result.
            // (We must make a copy because we reuse the currentPath list).
            result.add(new ArrayList<>(currentPath));
        } else {
            // 3. If it's not a valid leaf, continue searching down the left and right subtrees
            // We subtract the current node's value from the targetSum for the next level
            dfs(node.left, targetSum - node.val, currentPath, result);
            dfs(node.right, targetSum - node.val, currentPath, result);
        }
        
        // 4. Backtrack: remove the current node from the path before we go back up the tree
        // This ensures the currentPath list is accurate for the other branches.
        currentPath.remove(currentPath.size() - 1);
    }
}