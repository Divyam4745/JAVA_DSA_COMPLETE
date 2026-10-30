class Solution {

    public ListNode partition(ListNode head, int x) {

        // Dummy nodes
        ListNode smallDummy = new ListNode(0);
        ListNode bigDummy = new ListNode(0);

        // Pointers to build the two lists
        ListNode small = smallDummy;
        ListNode big = bigDummy;

        // Traverse original list
        while (head != null) {

            if (head.val < x) {

                // Put node in small list
                small.next = head;
                small = small.next;

            } else {



                // Put node in big list
                big.next = head;
                big = big.next;
            }

            head = head.next;
        }

        // Important!
        // End the big list
        big.next = null;

        // Connect small list to big list
        small.next = bigDummy.next;

        return smallDummy.next;
    }
}