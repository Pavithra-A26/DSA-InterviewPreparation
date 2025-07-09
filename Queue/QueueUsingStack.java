import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.enqueue(6);
        q.peek();
        q.dequeue();
        q.enqueue(6);
        q.peek();
    }
}

class Queue{
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Queue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int x){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack2.push(x);

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        System.out.println(x +" enqued successfully");
    }

    public void dequeue(){
        if(stack1.isEmpty()){
            System.out.println("queue is Empty");
        }  
        int num = stack1.peek();
        stack1.pop();
        System.out.println(num + " is dequed from queue");
    }

    public void peek(){
        if(stack1.isEmpty()){
            System.out.println("queue is Empty");
        }  
        int num = stack1.peek();
        System.out.println(num + " is peek element in queue");
    }
}
