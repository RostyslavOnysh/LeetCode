package LeetCode.task_101_Symmetric_Tree;

public class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode(){}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode right, TreeNode left) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
