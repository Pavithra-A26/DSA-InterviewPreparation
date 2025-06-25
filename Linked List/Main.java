class Node{
    int data;
    Node next ;

    public  Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    // Add a node at the end
    public void insert(int data){
        Node newnode = new Node(data);

        if(head==null){
            head = newnode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newnode;
    }

    // Delete the first node with the given data

    public void delete(int data){

        if(head==null){
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        }
    }

    public void display() {
        Node current = head;

        while(current != null){
            System.out.print(current.data + " -> " );
            current= current.next;
        }
        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert(1);
        ll.insert(2);
        ll.insert(5);
        ll.insert(8);
        ll.delete(2);
        ll.delete(8);
        ll.display();
    }
}