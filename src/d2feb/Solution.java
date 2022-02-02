package d2feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		Solution.findAnagrams("cbaebabacd", "abc");
	}
	
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> aList= new ArrayList<>();
		int pLen = p.length();
		for (int i = 0; i <= s.length() - pLen; i++) {
			String subStr= s.substring(i, i + pLen);
			if(isAnagrams(subStr,p)) {
				aList.add(i);
				
			}
		}
		return aList;

	}
	
	static boolean isAnagrams(String s, String p) {
		if(s.isEmpty() || p.isEmpty()) return false;
		int[] arr= new int[26];
		
		for(char ch :s.toCharArray()) {
			arr[ch-'a']++;
		}
		
		for(char ch :p.toCharArray()) {
			arr[ch-'a']--;
		}
		
		
		for(int a:arr) {
			if(a!=0) return false;
			
		}
		return true;
			
		
		
		
	}
	 
	 
	 

}
