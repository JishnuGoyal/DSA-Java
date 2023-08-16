package com.leetcode.trees;

public class PAthSumThree {
    public static void main(String[] args) {

    }
    public static int count = 0;

    public static void findPaths(TreeNode root, int target) {
        if(root == null){
            return;
        }

        findSum(root, 0, target);

        findPaths(root.left, target);
        findPaths(root.right, target);
    }

    public static void findSum(TreeNode root, long sum, int target) {
        if(root == null) {
            return;
        }
        if(sum == target) {
            count++;
        }
        findSum(root.left, sum + root.val, target);
        findSum(root.right, sum + root.val, target);
    }

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
