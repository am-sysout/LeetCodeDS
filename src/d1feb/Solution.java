package d1feb;


public class Solution {

	public static void main(String[] args) {
		System.out.println(Solution.longestPalindrome("babad"));
	}

	public static String longestPalindrome(String s) {
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expendFromCenter(s, i, i + 1);
			int len2 = expendFromCenter(s, i, i);
			int len = Math.max(len1, len2);
			if (end - start < len) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end+1);
	}

	static int expendFromCenter(String s, int i, int j) {
		while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;

		}
		return j - i - 1;

	}

	public static int maxProfit(int[] prices) {

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int price : prices) {
			min = Math.min(min, price);
			max = Math.max(max, price - min);
		}
		return max;

	}

}
