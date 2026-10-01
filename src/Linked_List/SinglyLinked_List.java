package Linked_List;

public class SinglyLinked_List {
    static class Node {
        int data;
        Node next;

        //constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //constructor
    public SinglyLinked_List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

   //INSERTATION .........

   // INSERTATION AT THE BEGINING

   public void insertathead(int data) {
       Node newNode = new Node(data);
       if (head == null && tail == null) {
           head = newNode;
           tail = newNode;
       } else {
           newNode.next = head;
           head = newNode;
       }
       //increase the size by 1
       size++;
   }

}
