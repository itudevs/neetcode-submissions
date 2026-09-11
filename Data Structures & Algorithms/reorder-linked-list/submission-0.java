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
    public int size(ListNode head){
        int count=0;
        ListNode current=head;
        while(head!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        //splits list into two parts
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;      
        }
        //once list is split
        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=slow.next;
        //reversing second list 
        while(second!=null){
            ListNode temp=second.next; 
            second.next=prev; //sets next pointer to null
            prev=second; //2
            second=temp; //3
        }
        //merge lists together 
        second=prev;
        ListNode first=head;
        while(second!=null){
            ListNode temp=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp;
            first=temp;
            second=temp2;
        }
    }
}
