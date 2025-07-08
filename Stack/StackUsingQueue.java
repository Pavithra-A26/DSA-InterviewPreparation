//implement stack using single queue

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        Stack st = new Stack();

        
        st.push(0);
        st.push(1);
        st.push(2);
        st.size();
        st.top();
        st.pop();
        st.top();
        st.size();
    }
}

class Stack{
    Queue<Integer> queue = new LinkedList<>();

    public void push(int num){
        queue.add(num);

        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }

        System.out.println(num + " pushed into the stack");
    }

    public void pop(){
        queue.remove();
        System.out.println("element poped from the stack");
    }

    public void top(){
        System.out.println(queue.peek() +" is the top of the stack");
    }

    public void size(){
        System.out.println(queue.size() + " is the size of the stack");
    }
}
