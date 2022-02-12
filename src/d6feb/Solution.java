package d6feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Solution {

	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,3};
		Solution.removeDuplicates(arr);
		
	}

	
	public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<3)
            return n;
        
        int slow=2; int fast = 2;
        while(fast<n){
            if(nums[fast] != nums[slow-2]) 
              nums[slow++]= nums[fast]; 
            fast++;
        }
        return slow;
    }
	
	
	
	
	public int[] sortEvenOdd(int[] nums) {

		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0)
				evenList.add(nums[i]);
			else
				oddList.add(nums[i]);
		}

		Collections.sort(oddList, Collections.reverseOrder());
		Collections.sort(evenList);
		int k = 0;
		for (int i = 0; i < evenList.size(); i++) {
			nums[k] = evenList.get(i);
			k = k + 2;
		}
		k = 1;
		for (int i = 0; i < oddList.size(); i++) {
			nums[k] = oddList.get(i);
			k = k + 2;
		}

		return nums;

	}

	
	
}
