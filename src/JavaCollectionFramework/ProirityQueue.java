package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProirityQueue {
    static void main() {
        //priority behaviour -> vlaue is less -> High pro=iority
        Queue<Integer> l=new PriorityQueue<>();
        //priority behaviour->Integer->Vlaue high->High Priority
        Queue<Integer> l1=new PriorityQueue<>((a,b)->b-a);
        l.offer(50);
        l.offer(30);
        l.offer(70);
        l.offer(40);
        System.out.println(l);


        System.out.println(l.poll());
        System.out.println(l);
        System.out.println( l.poll());
        System.out.println(l);
    }
}
