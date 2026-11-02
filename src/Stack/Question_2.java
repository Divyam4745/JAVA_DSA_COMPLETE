package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question_2 {
    static void insertAtBottom(Deque<Integer> st, int value) {
        if (st.isEmpty()) {
            st.push(value);
            return;
        }

        int topValue = st.peek();
        st.pop();

        insertAtBottom(st, value);
        st.push(topValue);
    }

    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        int value = 50;
        insertAtBottom(st, value);

        System.out.print("Stack after inserting at bottom:");
        while (!st.isEmpty()) {
            System.out.print(st.pop()+" ");
        }
    }
}
