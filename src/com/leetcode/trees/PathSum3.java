package com.leetcode.trees;

public class PathSum3 {
    public int pathSum(TreeNode root, int targetSum) {
        findPath(root, 0, targetSum);
        return count;
    }

    public static int count = 0;

    public static int findPath(TreeNode root, int currentSum, int targetSum) {

        if (root == null) {
            return 0;
        }

        int leftTreeSum = findPath(root.left, currentSum + root.left.val, targetSum);
        if (root.val + leftTreeSum == targetSum) {
            count++;
        }
        int rightTreeSum = findPath(root.right, currentSum + root.right.val, targetSum);

        return root.val;
    }

    // Definition for a binary tree node.
    //      Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
