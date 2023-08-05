package LeetCode.uniqueBinarySearchTree2.DynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();

        if (start > end) {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftSubtrees = generateTrees(start, i - 1);
            List<TreeNode> rightSubtrees = generateTrees(i + 1, end);

            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }

        return result;
    }

    // Function to print the tree (optional, for displaying the structure of the tree).
    public void printTree(TreeNode root, int level) {
        if (root != null) {
            printTree(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(root.val);
            printTree(root.left, level + 1);
        }
    }

    public static void main(String[] args) {
        Solution bstGenerator = new Solution();
        List<TreeNode> uniqueBSTs = bstGenerator.generateTrees(3);

        for (TreeNode root : uniqueBSTs) {
            bstGenerator.printTree(root, 0);
            System.out.println("------------------------");
        }
    }
}