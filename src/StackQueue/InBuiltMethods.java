package StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltMethods {
    public static void main(String[] args) {

        // **** STACK ****
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Stack is: "+stack);
        
        System.out.println("Popped item is: " + stack.pop());
        System.out.println("Stack is: "+stack);
        
        // **** QUEUE ****
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        // peek() Retrieves, but does not remove
        System.out.println("Queue is: "+queue);

        System.out.println("Peeked item is: "+queue.peek());

        System.out.println("Removed item from Queue: " + queue.remove());
        System.out.println("Removed item from Queue: " + queue.remove());
        
        System.out.println("Queue is: "+queue);

        // **** D-QUEUE(Insert and Remove from both side front and rear/back)  ****

        // ArrayDeque:Resizable-array implementation
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        System.out.println("DQueue is: "+deque);
        deque.addLast(78);
        
        deque.removeFirst();
        System.out.println("DQueue is: "+deque);
    }
}
