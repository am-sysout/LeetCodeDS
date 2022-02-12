package d9feb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,1,4,1,5};
		int k=2;
		System.out.println(Solutions.findPairs(arr, k));
	}
	
	
	public static int findPairs(int[] nums, int k) {
		Map<Integer, Integer> hMap = new HashMap<>();
		for (int n : nums) {
			hMap.put(n, hMap.getOrDefault(n, 0) + 1);
		}

		int ans = 0;
		for (Map.Entry<Integer, Integer> sMap : hMap.entrySet()) {
			int mapKey = sMap.getKey();
			int reqKey =  mapKey-k;
			if (hMap.containsKey(reqKey)) {
				if (mapKey == reqKey)
					ans += hMap.get(mapKey) > 1 ? 1 : 0;
				else
					ans++;

			}

		}
		return ans;
	}


}
