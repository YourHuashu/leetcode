package com.huashu.array;

/*
 * 26. Remove Duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
It doesn't matter what you leave beyond the new length.
*/
public class RemoveDuplicatesfromSortedArray {

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int duplicate = nums[0];
		int res = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != duplicate) {
				nums[res] = nums[i];
				duplicate = nums[i];
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4 };
		int res = removeDuplicates(nums);
		System.out.println(res);
	}
}