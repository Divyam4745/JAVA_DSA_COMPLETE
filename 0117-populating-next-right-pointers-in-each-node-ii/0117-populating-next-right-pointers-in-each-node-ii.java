class Solution {
    public Node connect(Node root) {
        Node current = root;
        
        while (current != null) {
            // Dummy node to track the head of the next level
            Node dummy = new Node(0); 
            Node prev = dummy;
            
            // Traverse the current level
            while (current != null) {
                if (current.left != null) {
                    prev.next = current.left;
                    prev = prev.next;
                }
                if (current.right != null) {
                    prev.next = current.right;
                    prev = prev.next;
                }
                // Move to the next node on the current level
                current = current.next;
            }
            
            // Move down to the next level
            current = dummy.next;
        }
        
        return root;
    }
}