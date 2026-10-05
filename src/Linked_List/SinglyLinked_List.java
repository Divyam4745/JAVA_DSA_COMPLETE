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
    // INSERTATION AT THE END.........

    public void insertattail(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = tail;
            tail = newNode;
        }
        //increase the size by 1
        size++;
    }

    //INSERTION AT THE MIDDLE .......
    public void insertatmiddle(int position,int data ){
        if (position<1 || position>size+1){
            //insertion is not possible at this time
            System.out.println("insertion is not possible at this possition");
            return;
        }
        if (position==1 ){
            insertathead(data);
            return;
        }
        if (position==size+1){
            insertattail(data);
            return;
        }
        // middle me kahi insert krna ho tb....
        Node prevNode=head;
        //move prevNode (position - 2) to reach at the exact position ....
        for (int i=0;i<position-2;i++){
            prevNode=prevNode.next;
        }
        Node newNode = new Node(data);
        //update the value of this node
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        //increase the size
        size++;
    }

}
