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
    public ListNode deleteDuplicates(ListNode head) {
        //null
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        //>1node
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            if(curr.val!=prev.val){
                curr=curr.next;
                prev=prev.next;
            }
            else{
                prev.next=curr.next;
                curr=curr.next;
            }
        }
        return head;
    }
}