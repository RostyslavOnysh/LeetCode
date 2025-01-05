package LeetCode.task_222_Count_Complete_Tree_Nodes;

public class Solution {
    int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }

    public int countNodes(TreeNode root) {
        int nodes = 0, height = height(root);
        while (root != null) {
            if (height(root.right) == height - 1) {
                nodes += 1 << height;
                root = root.right;
            } else {
                nodes += 1 << height - 1;
                root = root.left;
            }
            height--;
        }
        return nodes;
    }
}
