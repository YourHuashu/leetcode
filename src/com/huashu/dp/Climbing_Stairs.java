package com.huashu.dp;

/*
70. Climbing Stairs
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.
*/
public class Climbing_Stairs {

	public int climbStairs(int n) {
		int stepone = 1;
		int steptwo = 2;
		int sum = 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		for (int i = 3; i <= n; i++) {
			sum = stepone + steptwo;
			stepone = steptwo;
			steptwo = sum;

		}

		return sum;
	}
}
