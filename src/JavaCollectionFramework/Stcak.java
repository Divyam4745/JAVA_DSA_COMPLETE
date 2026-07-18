package JavaCollectionFramework;

import java.util.*;

public class Stcak {
    static void main() {
    //List or Collection->interface
    //Array ->concrete class
    Stack<Integer> list = new Stack<>();

    //add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

    //remove
        list.remove(0);
        list.remove(2);
        System.out.println(list);

    //aAll
    Stack<Integer> list1 = new Stack<>();
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
    Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext())

    {
        System.out.println("Element :" + iterator.next());
    }

    Stack<Integer> list3 = new Stack<>();
        list3.add(10);
        list3.add(11);
        list3.add(12);
        list3.add(13);
        System.out.println("The array is : "+list3);
        System.out.println(list3.get(2));
        list3.set(3,115);
        System.out.println(list3);

    //contains
        System.out.println(list3.contains(11234));

    Collection<Integer> collection = new Stack<>();
        collection.add(45);
        collection.add(57);
        collection.add(23);
        collection.add(78);
        System.out.println("The collestion is"+collection);

    //Sort
        Collections.sort(list3);
        System.out.println(list3);

    //clone
    ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println(newList);


    //ensueCopy
    Stack<Integer> newArr = new Stack<Integer>();
        newArr.ensureCapacity(100);

        //push
        //pop
        //peek
        //search
        //empty



}

    }

