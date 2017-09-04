package com.huashu.string;

/*67. Add Binary
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".*/
public class Add_Binary {

	public String addBinary(String a, String b) {
		if (a == null || b == null || a.length() == 0 || b.length() == 0)
			return null;
		int aLen = a.length();
		int bLen = b.length();
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int i = 0;
		for (; i < aLen && i < bLen; i++) {
			int sum = (a.charAt(aLen - 1 - i) - '0') + (b.charAt(bLen - 1 - i) - '0') + carry;
			sb.insert(0, sum % 2);
			carry = sum / 2;
		}
		while (i < aLen) {
			int sum = (a.charAt(aLen - 1 - i) - '0') + carry;
			sb.insert(0, sum % 2);
			carry = sum / 2;
			i++;
		}
		while (i < bLen) {
			int sum = (b.charAt(bLen - 1 - i) - '0') + carry;
			sb.insert(0, sum % 2);
			carry = sum / 2;
			i++;
		}
		if (carry != 0)
			sb.insert(0, carry);
		return sb.toString();
	}
}
