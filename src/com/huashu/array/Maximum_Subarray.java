package com.huashu.array;

/*
53. Maximum Subarray
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

click to show more practice.

*/
public class Maximum_Subarray {

	public int maxSubArray(int[] nums) {
		int res = Integer.MIN_VALUE, curSum = 0;
		for (int num : nums) {
			curSum = Math.max(curSum + num, num);
			res = Math.max(res, curSum);
		}
		return res;
	}
}
