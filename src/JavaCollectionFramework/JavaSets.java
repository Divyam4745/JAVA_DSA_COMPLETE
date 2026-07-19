package JavaCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSets {
    static void main() {
        Set<Integer> M=new HashSet<>();
        Set<Integer> N=new HashSet<>();
        M.add(10);
        M.add(20);
        M.add(10);
        M.add(10);
        M.add(20);
        M.add(30);
        System.out.println(M);

        N.add(20);
        N.add(30);
        N.add(10);
        N.add(70);
        System.out.println(N);

        M.retainAll(N);
        System.out.println(M);   //Interaction wala print krega
        System.out.println(M.contains(N));

        Set<Integer> list=new LinkedHashSet<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(50);
        list.add(46);

        System.out.println(list);
        //TreeHashSet
        Set<Integer> list1=new TreeSet<>();
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(50);
        list1.add(46);
        System.out.println(list1);
    }
}
