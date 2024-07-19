package StackQueue;

public class Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int endptr = 0;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return endptr == data.length; // pointer is at last index
    }

    public boolean isEmpty() {
        return endptr == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[endptr++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }
        int removed = data[0];

        // shift elements to left
        for (int i = 1; i < endptr; i++) {
            data[i-1] = data[i];
        }
        endptr--;
        
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < endptr; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("End of queue...");
    }

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(5);

        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        queue.display();
        
        System.out.println("Removed item: "+ queue.remove());
        queue.display();
    }
}
