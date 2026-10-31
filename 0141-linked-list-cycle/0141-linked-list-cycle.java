public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // Check both fast and fast.next to safely jump two nodes
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Moves 1 step
            fast = fast.next.next;    // Moves 2 steps
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
}