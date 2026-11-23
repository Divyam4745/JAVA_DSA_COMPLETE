package Stack;

import java.util.Deque;
import java.util.Stack;
                             ////////////  SORTED STACK   ////////////
public class Question_5 {
    public boolean issorted(Stack<Integer> st)
    {
        //best case
        if (st.size()<=1){
            return true;
        }
        // 1 cae hmm solve krege baaki recursion samal lega
        int prevElement= st.peek();
        st.pop();
        int currElement=st.peek();

        boolean ekCasekaAns= (prevElement<=currElement);
        // baaki recursion samal lega
        boolean recursionkaAns=issorted(st);
        // ab hmeee push krna pdegga phle jaisa
        st.push(prevElement);
        boolean finalAns= (ekCasekaAns&& recursionkaAns);
        return finalAns;
    }
}
