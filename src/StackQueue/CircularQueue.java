package StackQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int endptr = 0;
    protected int frontptr = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; // pointer is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return false;
        }
        data[endptr++] = item;
        endptr = endptr % data.length;
        size++;
        return true;
    }
    
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }
        int removed = data[frontptr++];

        frontptr = frontptr % data.length;
        size--;

        return removed;
    }
    
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }
        return data[frontptr];
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
        int i = frontptr;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i%= data.length;
        }while(i != endptr);

        System.out.println("End of queue...");
    }
    
    public static void main(String[] args) throws Exception {
        // CircularQueue queue = new CircularQueue(5);
        DynamicQueue queue = new DynamicQueue(5);

        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        
        queue.display();
        
        System.out.println(queue.remove());
        queue.insert(7);
        queue.display();
        
        System.out.println(queue.remove());
        queue.insert(8);
        queue.display();
        
        System.out.println(queue.remove());
        queue.insert(9);
        queue.display();
    }
}
