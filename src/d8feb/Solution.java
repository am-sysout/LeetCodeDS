package d8feb;

public class Solution {

	public static void main(String[] args) {
		
		//int a=97;
	    //char b=(char)a;

	    //System.out.println(b);//it will return ascii value of 68

	    //output- D
		
		System.out.println(Solution.reverse(1534236469));
		
		
	}
	
	
	public static int reverse(int x) {
		
		System.out.println(Integer.MAX_VALUE+"======"+Integer.MIN_VALUE);
		
      
        long num=0;
        int res=0;
        boolean flag=true;
        if(x<0){
            x =-x;
          flag=false;
        }
        
        while(x>0){
            num = num*10+x%10;
            x =x/10;
            
            if(num>Integer.MAX_VALUE)
                return 0;
        }
        
        res = (int)num;
        return (flag==false)?-res:res;
        
    }
	
	
	
	
	 public static int addDigits(int num) {
        int sum =0;		 
		 while(num>0) {
			 sum = sum*10 +num%10;
			 num = num/10;
		
		 }
		 System.out.println(sum);
		 
		 
		return sum;
	        
	    }
	 public static char findTheDifference(String s, String t) {
	        char[] ts = t.toCharArray();
	        int[] tA= new int[26];
	        for(char sa:ts){
	            tA[sa-'a']++;
	        }
	        
	        for(int i =0;i<s.length();i++){
	            tA[s.charAt(i)-'a']--;
	        }
	        
	        
	        for(int i=0;i<26;i++) {
	        	if(tA[i]==1) {
	        		return (char)(i + 97);
	        	}
	        }
			return 0;
	        
	    }
}
