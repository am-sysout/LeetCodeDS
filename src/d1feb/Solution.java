package d1feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		//Solution.increasingTriplet(new int[]{1,2,3,4,5});
		
	//	Solution.pivotIndex(new int[]{1,7,3,6,5,6});
		
		System.out.println(Solution.newIPAdd("100.020.003.400"));
		
	}
	
	
	
	
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		
		Set<String> uniqueWordList = new HashSet<>(wordList);
		if (!uniqueWordList.contains(endWord))
			return 0;
		Set<String> aSet = new HashSet<>();
		Queue<String> hQue = new LinkedList<>();
		hQue.add(beginWord);
		aSet.add(beginWord);

		int step = 0;
		while (!hQue.isEmpty()) {
			step++;
			int size = hQue.size();

			for (int i = 0; i < size; i++) {
				String word = hQue.poll();
				for (int j = 0; j < beginWord.length(); j++) {

					char[] ch = word.toCharArray();
					for (int k = 'a'; k <= 'z'; k++) {
						ch[j] = (char) k;

						String formedWord = new String(ch);
						if (formedWord.equals(endWord))
							return step++;

						if (!uniqueWordList.contains(formedWord))
							continue;

						if (!aSet.contains(formedWord)) {
							hQue.add(formedWord);
							aSet.add(formedWord);
						}

					}

				}

			}

		}

		return step;

	}
	
	//S = "100.020.003.400"
	
	
	public static String newIPAdd(String S) {
		String out = "";
		if (S != null && !S.isBlank()) {
			String[] arr = S.split("\\.");
			for (String s : arr)
				out += removeFirstZero(s) + "."; // System.out.println(Arrays.toString(arr));
		}

		return out.substring(0,out.length()-1);

		// your code here
	}
	
	
	
	static String removeFirstZero(String st) {
		String out ="";
		boolean flag = false;
		for(int i=0;i<st.length();i++) {
			
			if(st.charAt(i)=='0' && flag==false ) {
				continue ;
			}else {
				flag= true;
				out +=st.charAt(i);
			}
		}
		
		return out;
	  
		
	}
	
	 public static int pivotIndex(int[] nums) {
	        
	        int rSum = 0,lSum=0;
	        
	        
	        for(int n:nums){
	            rSum +=n;            
	        }
	        
	        
	        for(int i =0 ;i<nums.length;i++){
	            if(rSum-lSum-nums[i]==lSum){
	                return i;
	            }
	            lSum +=nums[i]; 
	        }
	        
	        return -1;
	    }
	 
	
	public static boolean increasingTriplet(int[] nums) {

		boolean flag = false;

		int n = nums.length;
		int[] leftMin = new int[n];
		int[] rightmax = new int[n];

		leftMin[0] = nums[0];
		for (int i = 1; i < n; i++) {
			leftMin[i] = Math.min(nums[i], leftMin[i - 1]);
		}
		rightmax[n - 1] = nums[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightmax[i] = Math.max(nums[i], rightmax[i + 1]);
		}

		for (int i = 0; i < n; i++) {
			if (leftMin[i] < nums[i] && nums[i] < rightmax[i])
				return true;

		}

		return false;
		// System.out.println(Arrays.toString(leftMin));
		// System.out.println(Arrays.toString(rightmax));

		/*
		 * 
		 * for (int i = 0; i < nums.length-2; i++) { if(nums[i] < nums[i+1] && nums[i+1]
		 * < nums[i+2]) { flag = true ; break; }
		 * 
		 * }
		 */
		//return flag;
	}
	

	public static List<Integer> getRow(int numRows) {
        List<List<Integer>>  result = new ArrayList<>();
		  List<Integer>  emptyRes = new ArrayList<>();
		 
		 if(numRows<0)
		return emptyRes; 
		 
		 for(int i=0;i<=numRows;i++) {
			 List<Integer>  res = new ArrayList<>();
			 for(int j=0; j<=i;j++) {
				 if(j==0 || j==i) {
					 res.add(1);
				 }else {
					 res.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
				 }
				 
			 }
			 result.add(res);
            if(i==numRows)
                return res;
			 
			 
		 }
		return emptyRes;
		 
   }
	
	
	
	
	 public List<List<Integer>> generate(int numRows) {
		 
		 List<List<Integer>>  result = new ArrayList<>();
		 
		 
		 if(numRows<0)
		return result; 
		 
		 for(int i=0;i<numRows;i++) {
			 List<Integer>  res = new ArrayList<>();
			 for(int j=0; j<=i;j++) {
				 if(j==0 || j==i) {
					 res.add(1);
				 }else {
					 res.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
				 }
				 
			 }
			 result.add(res);
			 
			 
		 }
		return result;
		 
		 
		 
		 
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
