package com.huashu.string;

/*12. Integer to Roman
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.*/
public class IntegertoRoman {

	public String intToRoman(int num) {
		String ans = "";
		int[] aArray = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] rArray = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < aArray.length; i++) {
			while (num >= aArray[i]) {
				ans += rArray[i];
				num -= aArray[i];
			}
		}
		return ans;
	}
}
