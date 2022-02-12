package d5feb;

import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 */
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
    if(lists.length==0)
        return new ListNode();
        
     PriorityQueue<Integer> pq = new PriorityQueue<>();  
        for(ListNode list:lists){
            MergeSortedLists(list,pq);
        }
        
       return  makeSortedLists(pq);
    }
    
    
    void MergeSortedLists(ListNode listNode, PriorityQueue<Integer> pq){
        ListNode tmp = listNode;
        while(tmp !=null){            
            pq.add(tmp.val);
            tmp = tmp.next;
        }
        
    }
    
    ListNode makeSortedLists(PriorityQueue<Integer> pq) {
    	ListNode head=new ListNode(-1) ;
    	ListNode tmp = head;	
    	
    	while(!pq.isEmpty()) {
    		ListNode tmpNewNode = new ListNode(pq.poll());	
    		tmp.next=tmpNewNode;
    		tmp =tmp.next;
    	}
    	return head.next;
    	
    }
}