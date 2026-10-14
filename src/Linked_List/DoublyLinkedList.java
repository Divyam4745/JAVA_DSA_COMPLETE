package Linked_List;

public class DoublyLinkedList {
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

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
          // INSERT AT HEAD
    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if (head==null && tail==null){
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head.Prev=newNode;
            head=newNode;
        }
        size++;
    }
//    // INSERT AT TAIL
    public void insertAtTail(int data){
        Node newNode=new Node(data);
        if (head==null&&tail==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.Prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size++;

    }

    static void main(String[] args) {

    }
}
