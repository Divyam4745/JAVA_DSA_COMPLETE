
package Linked_List;

public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insertion at head
    public void insertionAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size++;
    }
    // INSERT AT THE TAIL
    public void insertAttail(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
            // update tail circular
            tail.next=head;
        }
        else {
            tail.next=newNode;
            tail=newNode;
            //update Node Circular
            tail.next=head;
        }
        size++;
    }
    // INSERT AT THE POSITION
    public void insertatposition(int position,int data){
        if (position<1 || position>size+1){
            System.out.println("Invalid position no need to insert");
            return;
        }
        if (position==1){
            insertionAtHead(data);
            return;
        }
        if (position==size+1){
            insertAttail(data);
            return;
        }
        Node newNode=new Node(data);
        Node prevNode=head;
        for (int i=0;i<position-2;i++){
            prevNode=prevNode.next;
        }
        Node currNode=newNode;
        Node nextNode=prevNode.next;

        prevNode.next=currNode;
        currNode.next=nextNode;

        size++;

    }

    public boolean searching(int target){
        if (head==null){
            return false;
        }
        Node temp=head;
        do {
            if (temp.data==target){
                return true;
            }
            temp=temp.next;
        }while(temp!=head);
        return false;
    }
    public void deleteatHead(){
        if (head== null){
            System.out.println("no need to delete it is not possible");
            return;
        }
        //if it has single node
        if (head == tail) {
            head=null;
            tail=null;
            size=0;
            return;
        }
        Node temp=head;
        head=head.next;
        //maintain circular connection
        tail.next=head;
        //Discount deleted node
        temp.next=null;
        size--;
        }
        public void deleteAtTail(){
        // for null node
            if (head==null){
                System.out.println("not possible");
            }
            if (head==tail){
                head=null;
                tail=null;
                size=0;
                return;
            }
            Node prevNode=head;
            for (int i=0;i<=size-2;i++){
                prevNode=prevNode.next;
            }
            prevNode.next=head;
            tail.next=null;
            tail=prevNode;
            size--;
        }

        //Delete st the exsct position
    public void deleteAtExactPOsition(int position){
        if (head==null){
            System.out.println("INvalid position ");
            return;
        }
        if (position == 1)
        {
            deleteatHead();
            return;
        }
        if (position==size){
            deleteAtTail();
            return;
        }
        // in between position
        Node prevNode= head;
        for (int i=0;i<=size-2;i++){
            prevNode=prevNode.next;
        }
        Node currNode=prevNode.next;
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

    public static void main(String[] args) {
            CircularLinkedList myList =
                    new CircularLinkedList();
            // INSERT AT HEAD
        myList.insertionAtHead(4);
        myList.insertionAtHead(3);
        myList.insertionAtHead(2);
        myList.insertionAtHead(1);
        myList.printList();

//        INSERT AT TAIL
        myList.insertAttail(5);
        myList.insertAttail(6);
        myList.insertAttail(7);
        myList.printList();

        // INSERT AT ANY POSITION
        myList.insertatposition(2,10);
        myList.printList();

        //SEARCHING TARGET
        myList.searching(3);

        // delete the node
        myList.deleteatHead();
        myList.printList();

    }
}
