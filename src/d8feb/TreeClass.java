package d8feb;

/* Definition for a binary tree node.*/
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class TreeClass {
	
	public static void main(String[] args) {
		
		System.out.println(TreeClass.strStr("abc","abc"));
		
	}
	
	 public static int strStr(String haystack, String needle) {
	
	        
		if(haystack.isEmpty() || needle.length()>haystack.length())	        
	        return -1;
		
		if(needle.isEmpty())
			return 0;
		
		for(int i=0;i<=haystack.length()-needle.length();i++) {
			int j;
			for(j=0;j<needle.length();j++) {
				if(haystack.charAt(i+j) !=needle.charAt(j))
					break;
			}
			
			if(j==needle.length())
				return i;
			
		}
	        
     return -1;
 
	        
	    }
	
	
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null) return true;
		if (p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}
}
