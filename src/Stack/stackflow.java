package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class stackflow {
    static class ArrayStack {
        int[] arr;
        int capacity;
        int top;

        // Constructor
        public ArrayStack(int size) {
            capacity = size;
            arr = new int[capacity];
            top = -1;
        }

        // Insert an element
        public void push(int x) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            arr[++top] = x;
        }

        // Remove an element
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return arr[top--];
        }

        // View the top element
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[top];
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }
        // Get stack size
        public int size() {
            return top + 1;
        }
        public void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]+ ",");
            }
        }
    }
    static void main(String[] args) {
        Deque<Integer> st=new ArrayDeque<>();
        ArrayStack p1 = new ArrayStack(5);

        p1.push(10);
        p1.push(20);
        p1.push(30);

//        System.out.println("Top element: " + p1.peek());
//        System.out.println("Removed: " + p1.pop());
//        System.out.println("Removed: " + p1.pop());
//        System.out.println("Top element: " + p1.peek());
        p1.printStack();

/*

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

*/
    }
}
