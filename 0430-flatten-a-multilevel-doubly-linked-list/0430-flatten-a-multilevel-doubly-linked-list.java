
class Solution {
    public Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        Node p = head;

        while (p != null) {

            if (p.child == null) {
                p = p.next;
            } 
            else {
                // Store the child node
                Node temp = p.child;

                // Find the last node of the child list
                while (temp.next != null) {
                    temp = temp.next;
                }

                // Connect child list with next node
                temp.next = p.next;

                if (p.next != null) {
                    p.next.prev = temp;
                }

                // Connect current node with child
                p.next = p.child;
                p.child.prev = p;

                // Remove child pointer
                p.child = null;
            }
        }

        return head;
    }
}
