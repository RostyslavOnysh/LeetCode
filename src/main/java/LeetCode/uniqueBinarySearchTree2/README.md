# Task
Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of unique values from 1 to n.
Return the answer in any order.
## Example 1:

Input: n = 3
Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]

## Example 2:

Input: n = 1
Output: [[1]]

Constraints:

1 <= n <= 8


# RECURSION ! 
```java 
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
            List<TreeNode> leftSubTree = generateTrees(start, i - 1);
            List<TreeNode> rightSubTree = generateTrees(i + 1, end);

            for (TreeNode left : leftSubTree) {
                for (TreeNode right : rightSubTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        return result;
    }
}

```

# Explanation of the Code:

The public method generateTrees(int n) is the entry point for the solution. It checks if n is less than or equal to 0, in which case it returns an empty ArrayList as there are no valid BSTs possible for non-positive n.
If n is positive, it calls the private recursive method generateTrees(int start, int end) to generate all the unique BSTs with nodes in the range from start to end.
The private recursive method generateTrees(int start, int end) takes two parameters, start and end, which represent the range of node values for which it needs to generate the BSTs.
It initializes an ArrayList called result to store the generated BSTs.
The base case of the recursion is when start > end. In this case, there is no valid node value in the range, so it adds null to the result list, representing an empty subtree.
Otherwise, the method iterates through each value i in the range from start to end.
For each value i, it recursively calls generateTrees(start, i - 1) to generate all possible left subtrees, and generateTrees(i + 1, end) to generate all possible right subtrees.
It then combines each left subtree with each right subtree to form all possible BSTs with root node value i.
For each combination of left and right subtrees, it creates a new TreeNode with value i, sets its left and right children to the left and right subtrees, and adds the root to the result list.
Finally, the method returns the result list, which contains all the structurally unique BSTs with nodes in the range from start to end.
Example:

For n = 3, the method generateTrees(3) will generate all the unique BSTs with nodes having values 1, 2, and 3.

## The possible BSTs are:

1. [1, null, 2, null, 3]
2. [1, null, 3, 2]
3. [2, 1, 3]
4. [3, 1, null, null, 2]
5. [3, 2, null, 1]
These BSTs represent different combinations of the binary search trees with exactly three nodes and unique values from 1 to 3.

For n = 1, the method generateTrees(1) will generate the only structurally unique BST with a single node having value 1:

[1]
The code takes care of generating all possible combinations of unique BSTs within the given constraints, and the resulting lists of BSTs are returned as output for each input n.

# Algorithm Explanation:

The given algorithm is an optimized recursive approach for generating all structurally unique binary search trees (BSTs) with exactly n nodes, where the nodes have unique integer values from 1 to n. It uses a divide-and-conquer strategy to generate all possible combinations of left and right subtrees for each node in the range [1, n].

The algorithm starts with the public method generateTrees(int n), which acts as an entry point for the solution. It checks if n is non-positive (less than or equal to 0) and returns an empty list in such cases.
For positive n, it calls the private recursive method generateTrees(1, n). This recursive method generates all structurally unique BSTs with nodes in the range from start to end, where start is initially 1 and end is initially n.
The private recursive method generateTrees(int start, int end) takes two parameters: start and end, representing the range of node values for which it needs to generate the BSTs.
The method uses a divide-and-conquer approach to generate all possible combinations of left and right subtrees for each value i in the range from start to end.
It recursively calls itself with smaller ranges (start to i-1 for left subtrees and i+1 to end for right subtrees) to generate all possible left and right subtrees for each value i.
For each combination of left and right subtrees, it creates a new TreeNode with value i, sets its left and right children to the left and right subtrees, and adds the root to the result list.
The method continues this process for all values in the range [start, end], effectively generating all structurally unique BSTs with nodes in the range from start to end.
Time Complexity:
# The time complexity : 
of the given algorithm is O(4^n / n^(3/2)), which can be derived from the nth Catalan number. The reason for this is that the algorithm generates all possible combinations of BSTs with n nodes, and the number of structurally unique BSTs with n nodes follows the nth Catalan number.

The nth Catalan number, C(n), is given by the formula C(n) = (2n)! / ((n+1)! * n!). For large values of n, the nth Catalan number grows exponentially. As the algorithm generates all possible combinations of BSTs with n nodes, the time complexity is dominated by the number of unique BSTs.

The recursive approach generates all unique BSTs by considering all possible root nodes (values 1 to n) and all possible left and right subtrees for each root. This results in multiple recursive calls and overlapping subproblems, which can be improved by using dynamic programming, as mentioned earlier.

# Why This Method is Good for the Task:

The recursive approach is intuitive and straightforward to understand. It leverages the divide-and-conquer strategy, where the problem is broken down into smaller subproblems and solved recursively.
It can generate all possible combinations of BSTs with n nodes using a simple algorithm, making it suitable for smaller values of n (up to 8) within a reasonable time frame.
The code is concise and easy to implement. The solution mainly revolves around two recursive functions, one acting as an entry point and the other doing the actual generation of BSTs.
It is useful for educational purposes and understanding the concept of generating unique BSTs using a divide-and-conquer approach.
However, for larger values of n, the algorithm's time complexity becomes a concern as it grows exponentially. In such cases, dynamic programming or other optimized techniques can be employed to reduce the number of redundant calculations and improve the efficiency of generating unique BSTs.

# Pros and Cons of Recursive Method vs. Dynamic Programming:

* Recursive Method:

### Pros:
Intuitive and straightforward to understand.
Easy to implement and code is concise.
Suitable for smaller values of n (up to 8) and educational purposes.
Cons:
Time complexity is exponential, O(4^n / n^(3/2)), which can be inefficient for larger n.
Redundant calculations in the recursive approach can lead to increased memory usage and longer execution times.
Dynamic Programming Method:

### Pros:
Optimized approach with reduced time complexity by avoiding redundant calculations.
More memory-efficient due to storing intermediate results in a table (array or list).
Efficient for larger values of n and can handle cases where recursive approach becomes impractical.
Cons:
Slightly more complex implementation compared to the recursive approach.
The table used to store intermediate results consumes memory proportional to n, but it is manageable for small to moderate n values.
## When to Use Each Method:

* Use the Recursive Method (original code) when:

n is relatively small (up to 8).
A simpler implementation and understanding of the algorithm are desired.
The time complexity is not a major concern for the given range of n.
Use the Dynamic Programming Method when:

n is moderate to large.
Time complexity becomes a concern for larger n values.
Memory efficiency is desired, and redundant calculations need to be avoided.
Efficiently handling larger values of n becomes a priority.
Conclusion:

Both methods have their merits, and the choice of method depends on the specific requirements of the problem, the size of n, and the constraints of the environment in which the algorithm will be executed. For small n, the recursive approach is simple and sufficient, but for larger n, the dynamic programming approach provides significant performance improvements.




