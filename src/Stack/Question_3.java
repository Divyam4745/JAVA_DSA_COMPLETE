package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question_3 {
    public void insertAtBottom(Deque<Integer>st, int value){
        if (st.isEmpty()){
            st.push(value);
            return;
        }
        int topValue=st.peek();
        st.pop();
        // baaki recursion smala lega
        insertAtBottom(st,value);
        st.push(topValue);
    }
    public void reverseStack(Deque<Integer> st)
    {
        if (st.isEmpty()){
            return;
        }
        //1 case hmm solve krenge baaki recursion samal lga
        int topValue= st.peek();
        st.pop();

        // called the recursion
        reverseStack(st);

        // recursion ke wapas aane pr koiii kamm krna hai to
        insertAtBottom(st, topValue);

    }

    static void main(String[] args) {
        Deque<Integer> st= new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        //output of the stack
        Question_3 obj = new Question_3();
        System.out.println("Original Stack: " + st);
        obj.reverseStack(st);
        System.out.println("Reversed Stack: " + st);



    }
}
