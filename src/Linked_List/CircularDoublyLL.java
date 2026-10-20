package Linked_List;

public class CircularDoublyLL {
    static class Node{
        int data;
        Node Prev;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
            this.next=null;
            this.Prev=null;

        }
    }
    //data member
    private Node head;
    private Node tail;
    private int size;

    public  CircularDoublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // insert At Head
    public void insertAthead(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;

            tail.next=head;
            head.Prev=tail;
        }else{
            newNode.next=head;
            newNode.Prev=tail;
            head.Prev=newNode;
            tail.next=newNode;
            head=newNode;
            size++;
        }
    }
    // Traversal of circular linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }






    static void main(String[] args) {
        CircularDoublyLL mylist=new CircularDoublyLL();

        mylist.insertAthead(1);
       mylist.insertAthead(2);
        mylist.insertAthead(3);
        mylist.insertAthead(4);
        mylist.insertAthead(5);
        mylist.printList();



    }
}
