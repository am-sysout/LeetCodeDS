package d3feb;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		
	}
	
	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int cnt = 0;
		Map<Integer, Integer> hMap = new HashMap<>();
		for (int c : nums3) {
			for (int d : nums4) {
				hMap.put(d + c, hMap.getOrDefault(d + c, 0) + 1);
			}
		}
		for (int a : nums1) {
			for (int b : nums2) {
				cnt = hMap.getOrDefault(-(a + b), 0);
			}
		}
		return cnt;
	}
	
}
