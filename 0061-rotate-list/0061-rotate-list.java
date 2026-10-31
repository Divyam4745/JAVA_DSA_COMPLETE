class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        temp.next=head;

        k=k % len;

        temp=head;
        for(int i=0;i< len-k-1;i++){
            temp=temp.next;
        }
        ListNode forword=temp.next;
        temp.next=null;
        return forword;
    }
}