package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class stackflow {
    static void main(String[] args) {
        Deque<Integer> st=new ArrayDeque<>();
        //push
        st.push(10);
        st.push(20);
        st.push(30);

        // print stack
        System.out.println(st);

        //POP
        st.pop();

        //print stack
        System.out.println(st);

        //size stack
        System.out.println(st.size());

        //top element print
        System.out.println(st.peek());

        //is empty or not

        System.out.println(st.isEmpty());


    }
}
