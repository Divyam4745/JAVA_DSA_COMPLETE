
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] ans = new ListNode[k];

        // Step 1: Find the length
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: Calculate base size and extra nodes
        int baseSize = len / k;
        int extraSize = len % k;

        ListNode curr = head;

        // Step 3: Split the linked list
        for (int part = 0; part < k; part++) {

            // Store the starting node
            ans[part] = curr;

            // Calculate current part size
            int width = baseSize + (extraSize > 0 ? 1 : 0);

            if (extraSize > 0) {
                extraSize--;
            }

            // Move to the last node of current part
            for (int i = 1; i < width; i++) {
                curr = curr.next;
            }

            // Disconnect the current part
            if (curr != null) {
                ListNode nextPart = curr.next;
                curr.next = null;
                curr = nextPart;
            }
        }

        return ans;
    }
}
