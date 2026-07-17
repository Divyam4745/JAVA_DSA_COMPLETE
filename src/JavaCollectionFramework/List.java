package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class List {
    static void main() {
      //List or Collection->interface

        //Array ->concrete class
        ArrayList<Integer>  list = new ArrayList<>();

        //add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        //remove
//        list.remove(0);
//        list.remove(2);
//        System.out.println(list);

        //aAll
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(21);
        list1.add(22);
        list1.add(23);
        list1.add(24);

        list.addAll(list1);
        System.out.println(list);
        System.out.println(list1);

        System.out.println(list1.size());

        //clear
        list1.clear();
        System.out.println(list1);

        //i want totraverse list using iterator
        Iterator<Integer> iterator=list.iterator();

        while (iterator.hasNext()){
            System.out.println("Element :"+ iterator.next());
        }
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(11);
        list3.add(12);
        list3.add(13);
        System.out.println("The array is : " + list3);
        System.out.println(list3.get(2));
        list3.set(3,115);
        System.out.println(list3);

        //contains
        System.out.println(list3.contains(11234));

        Collection<Integer> collection=new ArrayList<>();
        collection.add(45);
        collection.add(57);
        collection.add(23);
        collection.add(78);
        System.out.println("The collestion is" + collection);

        //Sort
        Collections.sort(list3);
        System.out.println(list3);

        //clone
        ArrayList<Integer> newList= (ArrayList<Integer>)list.clone();
        System.out.println(newList);


        //ensueCopy
        ArrayList<Integer> newArr= new ArrayList<Integer>();
        newArr.ensureCapacity(100);



    }

}
