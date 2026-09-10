class Solution {

    int count = 0;

    // returns {sum, number of nodes}
    int[] solve(TreeNode root) {

        // base case
        if (root == null) {
            return new int[]{0, 0};
        }

        // solve left subtree
        int[] left = solve(root.left);

        // solve right subtree
        int[] right = solve(root.right);

        // current subtree sum
        int sum = root.val + left[0] + right[0];

        // current subtree node count
        int nodes = 1 + left[1] + right[1];

        // floor average
        int average = sum / nodes;

        // check current node
        if (root.val == average) {
            count++;
        }

        return new int[]{sum, nodes};
    }

    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return count;
    }
}