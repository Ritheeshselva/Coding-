// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);
        st.pop();
        int n= st.size();
       int a= st.peek();
        System.out.println(st);
        System.out.println(a);
        System.out.println(n);
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(50);
        
        System.out.println(q);
    }
}