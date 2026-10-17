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
    public void insertAtposition(int position,int data){
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

    // if I want to print reverse value
    public void reverseprint(){
        Node temp=tail;
        while (temp!=null){
            System.out.print("<-" + temp.data );
            temp=temp.Prev;
        }
        System.out.println();
    }

    public boolean searchInLL(int target){
        if (head==null){
            System.out.println("invalid search it is not possible");
            return false;
        }
        Node temp= head;
        while(temp!=null){
            if (temp.data==target){
                return true;
            }else {
                temp=temp.next;
            }
        }
        return false;
    }

    //DELETE IN LL

    public void deleteAtHead(){
        if (head==null){
            System.out.println("No Need To Delete");
            return;
        }
        //single node
        if (head==tail){
            head=null;
            tail=null;
            size =0;
            return;
        }
        //if ll is more than one
        head=head.next;
        head.Prev=null;
        //size uodate
        size--;
    }

    //DELETE FROM TAIL
    public void deleteAtTail(){
        if (head==null){
            System.out.println("No Need To Delete");
            return;
        }
        //single node
        if (head==tail){
            head=null;
            tail=null;
            size =0;
            return;
        }
        //LL have more than 1 node
        Node currNode=tail;
        Node prevNode=tail.Prev;
        prevNode.next=tail;

        //Link Change
            prevNode.next=null;
            currNode.Prev=null;
            //tail update
            tail=prevNode;

        // size update
        size--;
    }

    static void main(String[] args) {
        DoublyLinkedList myList=new DoublyLinkedList();

        myList.insertAtHead(100);
        myList.printlist();

        myList.insertAtHead(200);
        myList.printlist();

        myList.insertAtTail(300);
        myList.printlist();

        myList.insertAtTail(400);
        myList.printlist();

        myList.insertAtTail(500);
        myList.printlist();

        myList.insertAtposition(3,45);
        myList.printlist();

//        myList.reverseprint();
//
//        System.out.println("Found or not: " + myList.searchInLL( 55));

        // .........DELETE THE NODE...........
        myList.deleteAtHead();
        myList.printlist();
        // ............AGAIN DELETE..............
        myList.deleteAtHead();
        myList.printlist();

        myList.deleteAtTail();
        myList.printlist();
        myList.deleteAtTail();
        myList.printlist();

    }
}
