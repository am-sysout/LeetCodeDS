
public class Solution {

	static int[] arr = new int[26]; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution.checkInclusion("ab", "eidbaooo");
		
		
		
	}
	public static boolean checkInclusion(String s1, String s2) {   
		if(s1.length()>s2.length()) return false;
		for(char ch :s1.toCharArray()) {
			arr[ch-'a']++;
		}
		
		
		for(int i=0;i<s2.length();i++) {
			arr[s2.charAt(i)-'a']--;
			
			if(i-s1.length()>=0) {
				
				arr[s2.charAt(i-s1.length())-'a']++;
				System.out.println(s2.charAt(i-1));
			}
			if(isAllZero()==true)
				return true;
				
			
		}
		return false;
	}
	
	
	static boolean isAllZero() {
		for(int i : arr)
			if(i==1) return false;
		return true;
	}
	
	
}
