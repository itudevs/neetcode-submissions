/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode start=head;
        ListNode output=new ListNode();
        ListNode nextNode=null;
        ListNode prevNode=null;
         while(start!=null){
            //store next 
            nextNode=start.next;
            //define new link
             start.next=prevNode;
            //remove next for current
           
            prevNode=start;
            start=nextNode; 
        }
      return prevNode;   
    }
}
