package com.company.binaryTrees;


import java.util.ArrayList;
import java.util.List;

public class SameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isSameTree(TreeNode treeOne, TreeNode treeTwo) {

        if(treeOne == null && treeTwo == null) {
            return true;
        }

        if (treeOne == null || treeTwo == null) {
            return false;
        }

        if(treeOne.val != treeTwo.val) {
            return false;
        }
        return isSameTree(treeOne.left, treeTwo.left) && isSameTree(treeOne.right, treeTwo.right);
    }

    private static void bfs(TreeNode node, List<Integer> resultList) {
        if(node == null) {
            return;
        } else {
            resultList.add(node.val);
            resultList.add(node.left.val);
            resultList.add(node.right.val);
            bfs(node.left, resultList);
        }

    }

    public static void main(String[] args) {
        TreeNode treeOneLeft = new TreeNode(2);
        TreeNode treeOneRight = new TreeNode(3);

        TreeNode treeOneRoot = new TreeNode(1, treeOneLeft, treeOneRight);

        TreeNode treeTwoLeft = new TreeNode(2);
        TreeNode treeTwoRight = new TreeNode(3);

        TreeNode treeTwoRoot = new TreeNode(1, treeTwoLeft, treeTwoRight);

        System.out.println("Is same tree? " + isSameTree(treeOneRoot, treeTwoRoot));
    }
}
