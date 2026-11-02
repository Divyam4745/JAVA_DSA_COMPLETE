package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question_1{
   static void printmiddleElement(Deque<Integer> st, int count,int size){
        if (count==size/2){
            int middleElement=st.peek();
            System.out.println("Middle Element of Stack: " + middleElement);
            return;
        }
        st.pop();
        count++;
        //baakki recursion samal lega
        printmiddleElement(st, count,size);
    }
    static void main(String[] args) {
        Deque<Integer> st=new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int count =0;
        int size=st.size();

        printmiddleElement(st,count,size);
    }
}
