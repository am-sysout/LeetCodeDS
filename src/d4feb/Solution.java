package d4feb;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	
	public static void main(String[] args) {
		System.out.println(8%7);
		
		//int[] arr= {1,-1,5,-2,3};
		//int k =3;
	//System.out.println(Solution.maxSubArrayLen(arr,k));
	}
	
	
	
	
	public static int maxSubArrayLen(int[] nums, int k) {
		if (nums.length <= 0)
			return -1;

		int curr = 0, max = 0;

		Map<Integer, Integer> hMap = new HashMap<>();
		// hMap.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			curr += nums[i];

			if (curr == k) {
				max = Math.max(max, i + 1);
			}
			if (hMap.containsKey(curr - k)) {
				int lastIndex = hMap.get(curr - k);
				max = Math.max(max, i - lastIndex);
			}

			if (!hMap.containsKey(curr)) {
				hMap.put(curr, i);
			}
		}
		return max;
	} 
	 
	 
	public static int findMaxLength(int[] nums) {

		if (nums.length <= 0)
			return -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = -1;
			}
		}
		int curr = 0, max = 0;
		Map<Integer, Integer> hMap = new HashMap<>();
		hMap.put(0, -1);

		for (int i = 0; i < nums.length; i++) {
			curr += nums[i];

			if (hMap.containsKey(curr)) {
				int lastIndex = hMap.get(curr);
				max = Math.max(max, i - lastIndex);

			} else {
				hMap.put(curr,i);
			}
		}

		return max;
	}
}
