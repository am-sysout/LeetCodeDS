package d5feb;

import java.util.HashMap;

public class DSolutions {
	
	public static void main(String[] args) {
		int[] nums = {9,12,5,10,14,3,10};
		int pivot = 10; 
		DSolutions.pivotArray(nums, pivot);
	}
	
	
	  public int romanToInt(String s) {
	        
	        if(s.isEmpty()) return -1;
	        
	        
	        int curr=0,sum=0,prev=0;
	        
	        
	        HashMap<Character , Integer> map = new HashMap<>();
	        map.put('I' , 1);
	        map.put('V' , 5);
	        map.put('X' , 10);
	        map.put('L' , 50);
	        map.put('C' , 100);
	        map.put('D' , 500);
	        map.put('M' , 1000);
	        
	        for(int i=0;i<s.length();i++){
	            curr= map.get(s.charAt(i));
	            if(prev <curr){
	                sum +=curr-2*prev;
	            }else{
	                sum +=curr;
	            }
	            
	            prev =curr;
	        }
	        
	        
	       return sum; 
	        
	    }

	public static int[] pivotArray(int[] nums, int pivot) {

		// partition
		int i = 0, j = nums.length - 1;
		while (i < j) {
			while (nums[i] < pivot)
				i++;
			while (nums[j] > pivot)
				j--;
			if (i < j) {
				swap(nums, i, j);
				i++;
				j--;
			}
		}

		return nums;
	}

	static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;

	}
}
