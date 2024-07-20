package Stack;

import java.util.Stack;

public class QueueUsingTwoStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void insert(int item){
        stack1.push(item);
    }

    public int remove(){
        // remove from stack1 and put it into stack2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int removed = stack2.pop();
        
        // remove from stack2 and put it into stack1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return removed;
    }

    public int peek(){
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int peeked = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return peeked;
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public void printQueue() {
        Stack<Integer> temp = new Stack<>();
        while (!stack1.isEmpty()) {
            temp.push(stack1.pop());
            System.out.print(temp.peek() + " ");
        }
        while (!temp.isEmpty()) {
            stack1.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingTwoStack queue = new QueueUsingTwoStack();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        System.out.print("Queue: ");
        queue.printQueue();

        System.out.println();
        
        System.out.println("Removed : "+queue.remove());
        System.out.println("Removed : "+queue.remove());

        System.out.print("Queue: ");
        queue.printQueue();
    }
}