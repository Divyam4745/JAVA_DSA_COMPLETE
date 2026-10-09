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
            tail.next = newNode;  // Link current tail to new node
            tail = newNode;       // Update tail
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
         // Search operation in singly linked list
    public int findPosition(int target) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == target) {
                return position;
            } else {
                temp = temp.next;
                position++;
            }
        }
            return -1;
    }
    // Replaced the position in the singly linked list
    public int updaatedposition(int position, int newData){
        if (position<1 && position>size+1){
            System.out.println("Invaild position");
            return-1;
        }
        Node temp=head;
        for (int  i=1;i<position-1;i++){
            temp=temp.next;
        }
        // ab mera data correct position pr hai to mai ab newData ko raplace kr dunga
        temp.data=newData;
        return -1;
    }

    public boolean updateValue(int oldvalue, int newValue){
        //TODO
        return false;
    }

    //Traversal the singly linked list....
    public void printlist(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println();
    }

    // UTILITY FUNCTION.....
    public  int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head ==null;
    }
    public int gethead(){
        if (head ==null){
            return -1;
        }else {
            return head.data;
        }
    }
    public int gettail(){
        if (tail == null){
            return -1;
        }else{
            return tail.data;
        }
    }

   public static  void main(String[] args) {
       SinglyLinked_List mylist;
       mylist = new SinglyLinked_List();
       if (mylist.isEmpty()){
            System.out.println("List is empty");
        }
        System.out.println("Size of LL: "  + mylist.getSize());
       mylist.insertathead(10);
       mylist.printlist();

       mylist.insertathead(20);
       mylist.printlist();

       mylist.insertathead(30);
       mylist.printlist();

       mylist.insertattail(100);
       mylist.printlist();

       mylist.insertattail(110);
       mylist.printlist();

       mylist.insertatmiddle(1,22);
       mylist.printlist();

       mylist.insertatmiddle(5,201);
       mylist.printlist();

       System.out.println("head data: "+mylist.gethead());
       System.out.println("tail data: "+mylist.gettail());

       System.out.println("Position of  200 is " + mylist.findPosition(100));

       mylist.updaatedposition(4,50);
       mylist.printlist();

    }

}
