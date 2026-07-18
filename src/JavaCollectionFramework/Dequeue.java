package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Dequeue {
    static void main(String[] args) {
        Deque<Integer> p=new ArrayDeque<>();
        p.add(45);
        System.out.println(p);

        p.offerFirst(56);
        System.out.println(p);

        p.offerLast(67);
        p.pollLast();
        System.out.println(p);
        p.pollFirst();
        System.out.println(p);

        System.out.println(p.size());

        p.peekFirst();
        System.out.println(p);
        p.peekLast();
        System.out.println(p);
    }
}
