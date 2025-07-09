public class QueueUsingArray{
    public static void main(String args[]){
        Queue q = new Queue(5);
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
    int[] arr;
    int capasity;
    int front;
    int rear;
    int count;

    public Queue(int size){
        arr = new int[size];
        capasity = size;
        front =0;
        rear = -1;
        count =0;
    }

    public void enqueue(int num){
        if(count == capasity){
            System.out.println("Queue is full");
            return;
        }

        rear = (rear+1) % capasity;
        arr[rear] = num;
        count++;

        System.out.println(num +" enqueued successfully");
    }

    public void dequeue(){
        if(count == 0){
            System.out.println("Queue is empty");
            return;
        }

        int removed = arr[front];
        front = (front +1) % capasity;
        count --;
        System.out.println(removed +" element is removed from queue");
    }

    public void peek(){
        if(count ==0){
            System.out.println("queue is empty");
            return;
        }
        int num = arr[front];
        System.out.println(num +" is the peek element");
    }
}