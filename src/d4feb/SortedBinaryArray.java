package d4feb;

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


public class SortedBinaryArray {

	public static void main(String[] args) {
		sortedArrayToBST(new int[] {-10,-3,0,5,9});
	}
	  public static TreeNode sortedArrayToBST(int[] nums) {
	        TreeNode head ;
	          head= constructBst(nums,0,nums.length-1);
	        return head;
	    }
	    
	   static TreeNode constructBst(int[] nums, int i , int j) {
			 if(i>j)
				 return null;
			 int mid = i+(j-i)/2;
			 TreeNode left = constructBst(nums,i,mid-1);
			 TreeNode right = constructBst(nums,mid+1,j);

			 TreeNode node =new TreeNode(nums[mid],left,right);
			 return node;
			 
		 }
}
