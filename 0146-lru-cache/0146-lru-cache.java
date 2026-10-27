import java.util.HashMap;
import java.util.Map;

class LRUCache {
    
    // Doubly Linked List Node
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
        
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private Map<Integer, Node> cache;
    private int capacity;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        
        // Dummy head and tail to avoid edge cases
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        
        Node node = cache.get(key);
        // Move the accessed node to the front (most recently used)
        remove(node);
        insert(node);
        
        return node.val;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            // Update value and move to front
            Node node = cache.get(key);
            node.val = value;
            remove(node);
            insert(node);
        } else {
            // If at capacity, remove the LRU node (node right before tail)
            if (cache.size() == capacity) {
                Node lru = tail.prev;
                cache.remove(lru.key);
                remove(lru);
            }
            
            // Create new node, add to map and insert at front
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            insert(newNode);
        }
    }
    
    // Helper function to remove a node from the linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    // Helper function to insert a node right after the head
    private void insert(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}