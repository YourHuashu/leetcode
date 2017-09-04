package com.huashu.math;

/*69. Sqrt(x)
Implement int sqrt(int x).*/
Compute and return the square root of x.
public class MySqrt {

	public int mySqrt(int x) {

		double begin = 0;
		double end = x;
		double result = 1;
		double mid = 1;
		while (Math.abs(result - x) > 0.000001) {
			mid = (begin + end) / 2;
			result = mid * mid;
			if (result > x) // 二分的范围
				end = mid;
			else
				begin = mid;
		}
		return (int) mid;

	}
}
