#BFS
* The maxDepth method uses a queue to perform a level-order traversal of the binary tree.
* The base case checks if the root is null, in which case the depth is 0.
* The queue is initialized with the root node, and then a loop is used to process each level of the tree.
* For each node in the current level, its left and right children (if any) are added to the queue for processing the next level.
* The depth variable is incremented after processing each level.
* The final depth is returned.