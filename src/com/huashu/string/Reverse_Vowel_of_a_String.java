package com.huashu.string;

import java.util.HashSet;
import java.util.Set;

/*345. Reverse Vowels of a String
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".*/
public class Reverse_Vowel_of_a_String {

	public String reverseVowels(String s) {
		Set<Character> set = new HashSet<Character>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		char[] c = s.toCharArray();

		int i = 0, j = s.length() - 1;
		while (i < j) {
			while (i < j && !set.contains(c[i])) {
				i++;
			}
			while (i < j && !set.contains(c[j])) {
				j--;
			}
			char tmp = c[i];
			c[i] = c[j];
			c[j] = tmp;
			i++;
			j--;
		}
		return String.valueOf(c);
	}
}
