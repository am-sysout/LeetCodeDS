package d1feb;

import java.util.Arrays;

public class Solution {
	
	
	public static void main(String[] args) {
		
	}
	
	 public int earliestAcq(int[][] logs, int n) {
		 
		 Arrays.sort(logs,(a,b)->Integer.compare(a[0], b[0]));
		 
		 int count =n;
		 int groupCount = n;
		return groupCount;
	        
	        
	    }
	
	
	 public static int maxProfit(int[] prices) {
		 
		 int min = Integer.MAX_VALUE,max= Integer.MIN_VALUE;
		 for(int price:prices) {
			 min = Math.min(min, price);
			 max = Math.max(max, price-min);
		 }
		return  max;
		 
	 }

}
