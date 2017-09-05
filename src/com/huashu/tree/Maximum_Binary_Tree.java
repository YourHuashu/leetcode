package com.huashu.tree;

/*
654. Maximum Binary Tree
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
Note:
The size of the given array will be in the range [1,1000].
*/

//  Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Maximum_Binary_Tree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		if (nums == null)
			return null;
		return construct(nums, 0, nums.length - 1);
	}

	private TreeNode construct(int[] nums, int left, int right) {
		if (left > right)
			return null;
		int index = max(nums, left, right);
		TreeNode node = new TreeNode(nums[index]);
		node.left = construct(nums, left, index - 1);
		node.right = construct(nums, index + 1, right);
		return node;
	}

	private int max(int[] nums, int left, int right) {
		int max = Integer.MIN_VALUE, index = 0;
		for (int i = left; i <= right; i++) {
			if (max < nums[i]) {
				index = i;
				max = nums[i];
			}
		}
		return index;
	}
}