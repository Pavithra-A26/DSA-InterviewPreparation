public class StackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(0);
        st.push(1);
        st.push(2);
        st.size();
        st.peek();
        st.pop();
        st.peek();
        st.size();
    }
}

class Stack{
    int size = 1000;
    int[] arr = new int[size];

    int top = -1;

    public void push(int num){
        top++;
        arr[top] = num;
        System.out.println(num + " pushed into thw stack");
    }

    public void pop(){
        int element = arr[top];
        top--;
        System.out.println(element + " poped from the stack");
    }

    public void peek(){
        int element = arr[top];
        System.out.println(element + " is the top element");
    }

    public void size(){
        System.out.println(top + 1);
    }
}
