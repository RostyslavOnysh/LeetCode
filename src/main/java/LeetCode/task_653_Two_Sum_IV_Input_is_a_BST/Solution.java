package LeetCode.task_653_Two_Sum_IV_Input_is_a_BST;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> vis = new HashSet<>();
    private int k;

    public boolean findTarget(TreeNode root, int k) {
        this.k = k;
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return false;
        }
        if (vis.contains(k - root.val)) {
            return true;
        }
        vis.add(root.val);
        return dfs(root.left) || dfs(root.right);
    }
}