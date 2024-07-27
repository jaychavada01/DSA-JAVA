package LinkedList;

public class QueueUsingLinkedList {
    private Node front = null;
    private Node rear = null;
    private int size = 0;

    public static class Node {
        int value;
        Node next;

        Node(int data) {
            value = data;
            next = null;
        }
    }

    boolean Empty() {
        return front == null;
    }

    int peek() {
        if (Empty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return front.value;
        }
    }

    void Enqueue(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = newNode;
            //  rear = newNode; here when we insert element for first time the same element will be front and rear
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        System.out.println(value + " Inserted into Queue");
        size++;
    }

    void DeQueue() {
        if (front == null) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println(front.value + " Dequeued from Queue");
            front = front.next;
            size--;
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.Enqueue(10);
        q.Enqueue(11);
        q.Enqueue(12);
        q.Enqueue(13);
        q.Enqueue(14);
        q.DeQueue();
        System.out.println("The size of the queue is " + q.size);
        System.out.println("Peeked element from the queue is " + q.peek());
    }
}
