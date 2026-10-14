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

    //Insert At the exact position
    public void InsertAtposition(int position,int data){
        if (position<1 || position>size+1){
            System.out.println("Invaild position not possible to insert ");
        }
        if (position==1){
            insertAtHead(data);
            return;
        }
        if (position==size+1){
            insertAtTail(data);
            return;
        }

        // insert at the exact position
        Node temp=head;
        for (int i=0;i<position-2;i++){
            temp=temp.next;
        }
        //ab mera pura node prevNode pr aa chuka hai
        Node prevNode=temp;
        Node nextNode=prevNode.next;
        Node currNode=new Node(data);

        //ab change links
        currNode.Prev=prevNode;
        prevNode.next=currNode;
        currNode.next=nextNode;
        nextNode=currNode;
        size++;
    }

    //Traversal the singly linked list....
    public void printlist(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println();
    }

    static void main(String[] args) {
        DoublyLinkedList myList=new DoublyLinkedList();

        myList.insertAtHead(100);
        myList.printlist();

    }
}
