package StackQueue;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }

        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can not pop from an empty stack");
        }
        // int removed = data[pointer];
        // pointer--;
        // return removed;

        return data[pointer--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can not peek from an empty stack");
        }
        return data[pointer];
    }

    public boolean isFull() {
        return pointer == data.length - 1; // pointer is at last index
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack is: ");
        for (int i = 0; i <= pointer; i++) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) throws Exception {
        // Stack stack = new Stack(5);
        DynamicStack stack = new DynamicStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack);

        System.out.println("Popped item is: " + stack.pop());
        System.out.println("Popped item is: " + stack.pop());
        System.out.println("Popped item is: " + stack.pop());
        System.out.println(stack);
    }
}