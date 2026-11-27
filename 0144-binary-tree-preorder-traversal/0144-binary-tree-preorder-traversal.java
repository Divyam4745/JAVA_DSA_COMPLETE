
import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        return ans;
    }

    public void preorder(TreeNode root, List<Integer> ans) {

        // Base condition
        if (root == null) {
            return;
        }

        // 1. Root
        ans.add(root.val);

        // 2. Left subtree
        preorder(root.left, ans);

        // 3. Right subtree
        preorder(root.right, ans);
    }
}
