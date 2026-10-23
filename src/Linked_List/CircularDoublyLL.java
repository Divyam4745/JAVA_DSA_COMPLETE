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

    // INSERT AT TAIL
    public void insertattail(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;

            tail.next=head;
            head.Prev=tail;
        }
        else {
            newNode.Prev=tail;
            newNode.next=head;
            tail.next=newNode;
            head.Prev=newNode;
            tail=newNode;
            size++;
        }
    }
    //insert at the position
    public void insertatposition(int position,int data){
        if (position<1||position>size+1){
            System.out.println("not possible to insert");
            return;
        }
        // if position is 1
        if (position== 1){
            insertAthead(data);
            return;
        }
        if (position==size+1){
            insertattail(data);
            return;
        }
        Node newNode=new Node(data);
        Node prevNode=head;
        for (int i=0;i<position-2;i++){
            prevNode=prevNode.next;
        }
        Node currNode=new Node(data);
        Node nextNode=prevNode.next;
        prevNode.next=currNode;
        currNode.Prev=prevNode;
        nextNode.Prev=currNode;
        currNode.next=nextNode;
        size++;
    }
    //DELETE AT THE HEAD
    public void deleteathead(){
        if (head==null){
            System.out.println("no need to delete");
            return;
        }
        if (head==tail){
            head=null;
            tail=null;
            size=0;
        }else {
            Node temp=head;
            head=head.next;
            temp.next=null;
            temp.Prev=null;
            head.Prev=tail;
            tail.next=head;
            size--;
        }
    }

    //DELETE FROM THE TAIL
    public void deleteatrail(){
        if (head==null){
            System.out.println("no need to delete");
            return;
        }
        if (head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }else {
            Node prevNode=tail.Prev;
            tail.Prev=null;
            tail.next=null;
            head.Prev=prevNode;
            prevNode.next=head;
            size--;
        }
    }

    //DELETE FROM POSITION
    public void deleteatposition(int position){
        if (position<1 || position>size+1){
            System.out.println("not possible to delete");
            return;
        }
        if (position==1){
            deleteathead();
            return;
        }
        if (position==size){
            deleteatrail();
            return;
        }
        Node prevNode=head;
        for (int i=0;i<position-2;i++){
            prevNode=prevNode.next;
        }
        Node currNode= prevNode.next;
        Node nextNode=currNode.next;
        prevNode.next=nextNode;
        currNode.next=null;
        size--;

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
         //insert at head
        mylist.insertAthead(1);
       mylist.insertAthead(2);
        mylist.insertAthead(3);
        mylist.insertAthead(4);
        mylist.insertAthead(5);
        mylist.printList();

//        insert at tail
        mylist.insertattail(6);
        mylist.insertattail(7);
        mylist.insertattail(8);
        mylist.printList();

        // insert at position
        mylist.insertatposition(3,10);
        mylist.printList();

        //delete at the head
        mylist.deleteathead();
        mylist.printList();

//      DELETE FROM TAIL
        mylist.deleteatrail();
        mylist.printList();

        // DELETE AT THE EXACT POSITION
        mylist.deleteatposition(2);
        mylist.printList();

    }
}
