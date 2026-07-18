package JavaCollectionFramework;

import java.util.LinkedList;

public class Queue {
    static void main(String[] args) {
         java.util.Deque<Integer> p=new LinkedList<>();
         p.add(45);
         p.add(67);
         p.add(46);
        System.out.println(p);
        //Offer
        p.offer(10);
        p.offer(56);
        p.offer(90);
        System.out.println(p);
        //element
        p.element();
        System.out.println(p);
        //peek
        p.peek();
        System.out.println(p);
        //remove
        p.remove();
        System.out.println(p);
        //Poll
        p.poll();
        System.out.println(p );


    }
}
