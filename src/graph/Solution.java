package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		//int[][] s= {{1,2},{2,3},{4,2}};
		//System.out.println(Solution.findCenter(s));
		
		//System.out.println(Solution.countOperations(10, 10));
		
		
	//	int[] nums = {0,1,0,3,12};
		
		Solution.reverseStr("abcdefg",2);
	}
	
	
	
	





	public static String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();
		int n =s.length();
		int j =1;
		for(int i=0;i<s.length();i=i+k) {
		   if(j%2==0) {
			   j++;
			   continue;
		   }
		   
			if(i+1<n) {
				char tmp =ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=tmp;
			}
			
			j++;
			
			
		}
		System.out.println(new String(ch));
		
		
		return new String(ch);
		
		
		
		
        
    }
	
	public static String reverseVowels(String s) {
		char[] ch = s.toCharArray();
		if(ch.length<=1) return s;
		int l = 0;
		int r = ch.length - 1;
		Set<Character> vSet = new HashSet<>();
		vSet.add('a');
		vSet.add('e');
		vSet.add('i');
		vSet.add('o');
		vSet.add('u');
		vSet.add('A');
		vSet.add('E');
		vSet.add('I');
		vSet.add('O');
		vSet.add('U');
		while (l < r) {

			while (l < r && !vSet.contains(ch[l]))
				l++;
			while (l < r && !vSet.contains(ch[r]))
				r--;
			if (l < r) {
				char tmp = ch[l];
				ch[l] = ch[r];
				ch[r] = tmp;
			}
			l++;
			r--;
		}

		System.out.println(new String(ch));
		return new String(ch);
	}
	
	//[0,1,0,3,12]
	  public static void moveZeroes(int[] nums) {
		  int j=0;
		  int n = nums.length;
		  for(int i =0;i<n;i++) {
			  if(nums[i]==0)
				  continue;
			  else {
				  int tmp =nums[i];
				  nums[i]=nums[j];
				  nums[j++]=tmp;
				  
			  }
		  }
		  System.out.println(Arrays.toString(nums));
	  }
	public static List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();

		result.add(new ArrayList<Integer>());
		for (int i = 0; i < nums.length; i++) {
		    int n=	result.size();
			for(int j = 0;j<n;j++) {
				List<Integer> aList= new ArrayList<>(result.get(j));
				aList.add(nums[i]);
				result.add(aList);
				
			}

		}

		return result;

	}
	
	public static int minimumOperations(int[] nums) {

		int step = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (i - 2 > 0) {
				if (nums[i - 2] != nums[i] || nums[i - 1] == nums[i])
					step++;
			}
		}

		return step;

	}
	
	
public  static int countOperations(int num1, int num2) {
	int step = 0;
	while(num1>0 && num2>0) {
		if(num2>num1) {
			num2 = num2-num1;
		}else {
			num1 = num1-num2;
		}
		step++;
	}
	return step;
        
    }
	public static int findCenter(int[][] edges) {
		int n = edges.length;
		Map<Integer, Integer> hMap = new HashMap<>();
		for (int i = 0; i < edges.length; i++) {
			int frist = edges[i][0];
			int second = edges[i][1];
			hMap.put(frist, hMap.getOrDefault(frist, 0) + 1);
			hMap.put(second, hMap.getOrDefault(second, 0) + 1);

		}

		for (Entry<Integer, Integer> gMap : hMap.entrySet()) {
			if (gMap.getValue() == n)
				return gMap.getKey();
		}
		return -1;

	}
}
