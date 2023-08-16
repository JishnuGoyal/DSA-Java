package com.leetcode.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        List<List<Integer>> bigList = new ArrayList<>();
        findPath(path, root.val, root, targetSum, bigList);
        return bigList;

    }

    public static void findPath(List<Integer> path, int currentSum, TreeNode root, int targetSum, List<List<Integer>> bigList) {

        if(root.left == null && root.right == null && currentSum == targetSum){
            bigList.add(new ArrayList<>(path));
            return;
        }

        if(currentSum > targetSum) return;

        if(root.left != null) {
            path.add(root.left.val);
            findPath(path, currentSum + root.left.val, root.left, targetSum, bigList);
            path.remove(path.size() - 1);
        }

        if(root.right != null) {
            path.add(root.right.val);
            findPath(path, currentSum + root.right.val, root.right, targetSum, bigList);
            path.remove(path.size() - 1);
        }
    }


//    public static void findPath(List<Integer> path, int currentSum, TreeNode root, int targetSum, List<List<Integer>> bigList) {
//        if (root == null && currentSum == targetSum) {
//            bigList.add(path);
//            return;
//        }
//
//        if(root == null) {
//            return;
//        }
//        if(currentSum > targetSum) {
//            return;
//        }
//
//        path.add(root.val);
//        findPath(path, currentSum + root.val, root.left, targetSum, bigList);
//        path.remove(path.size() - 1);
//
//        path.add(root.val);
//        findPath(path, currentSum + root.val, root.right, targetSum, bigList);
//        path.remove(path.size() - 1);
//    }


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
