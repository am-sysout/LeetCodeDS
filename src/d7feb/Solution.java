package d7feb;

public class Solution {
	
	public static void main(String[] args) {
		Solution.mySqrt(1);
	}
	
	public static int mySqrt(int x) {
		if (x == 0)
			return x;

		int start = 1, end = x, ans = 0;

		while (start <= end) {

			int m = start + (end - start) / 2;
			if (m <= x / m) {
				ans = m;
				start= m + 1;
			} else {
				end = m - 1;
			}

		}

		return ans;

	}
}
