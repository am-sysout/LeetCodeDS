package d6feb;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

public class TreeDemo {
	
	public List<String> binaryTreePaths(TreeNode root) { 
		if(root==null)
			return null;
        List<String> aList= new ArrayList<>();
        Deque<Integer> pq = new LinkedList<>();
       
		return aList;
        
       
        
    }
    
    boolean isLeaf(TreeNode root){        
        return (root.left==null && root.right==null);
        
    }
    
   void printRootToLeaf(TreeNode root, Deque<Integer> pq,List<String> aList) {
    	if(root==null) return ;
    	
    	pq.add(root.val);
    	
    	printRootToLeaf(root.left,pq,aList);
    	if(isLeaf(root)) {
    		String out ="";
    		for(int p:pq) {
    			out +=p+"->";
    		}
    		aList.add(out.substring(0,out.length()-1));
    	}
    	printRootToLeaf(root.right,pq,aList);
    	
		pq.removeLast();
    	
    }
	
	
	
	public static void main(String[] args) {
		
	}

}
