package com.huashu.array;

/*
Add to List
27. Remove Element
DescriptionHintsSubmissionsDiscussSolution
Discuss Pick One
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
*/
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int i = 0, k = 0;
		while (i < nums.length) {
			if (nums[i] != val)
				nums[k++] = nums[i];
			i++;
		}
		return k;
	}
}
