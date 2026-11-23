/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len<k){
            return head;
        }
        //muchhe first len group ko reverse krns hai 
        ListNode prev=null;
        ListNode curr= head;
        for (int i=1;i<=k;i++){
            ListNode forword= curr.next;
            curr.next= prev;
            prev=curr;
            curr=forword;

        }
        // remaning list ko recursion se solve kra liya
        ListNode recursionKAnsKaHead = reverseKGroup (curr,k);
        // join both list
        head.next= recursionKAnsKaHead;

        // LL is reverse 
        return prev;
    }
}