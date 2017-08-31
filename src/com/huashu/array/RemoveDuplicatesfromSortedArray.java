package com.huashu.array;

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
