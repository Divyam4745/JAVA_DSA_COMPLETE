package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linklisted {

     static void main(String[] args) {
         LinkedHashSet<Integer> link1=new LinkedHashSet<>();
         link1.add(112);
         link1.add(346);
         link1.add(347);
         link1.add(567);
         link1.add(789);
         System.out.println(link1);

         //remove
         link1.remove(3);
         System.out.println(link1);

         LinkedList<Integer> list2=new LinkedList<>();
         list2.add(21);
         list2.add(22);
         list2.add(23);
         list2.add(24);

         list2.clear();
         //ALL THE FUNCTION ARE RUNNING SUCCESSFULLY


//         Queue listed

         LinkedList<Integer> new1=new LinkedList<>();
         new1.add(10);
         System.out.println(new1);
         new1.addFirst(1);
         System.out.println(new1);   //
         new1.addLast(112);
         System.out.println(new1);   //Last me add krega

         System.out.println(new1.peek());   //removes the first element from linked list

         System.out.println(new1.poll());   //return and removes the first element from the linked list

         System.out.println(new1.offer(4));    //add the specified element at the end of the linked list
    }
}