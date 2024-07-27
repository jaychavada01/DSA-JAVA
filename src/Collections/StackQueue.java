import java.util.ArrayDeque;
// import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);

        System.out.println("Stack is : " + stack);

        stack.pop();
        System.out.println("Popped Stack is : " + stack);

        System.out.println("Top value from stack is :" + stack.peek());

        // Queue
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.offer(20);
        queue.offer(25);
        queue.add(30);

        /*
         * Que. Why we use offer and poll methods to add and remove elements in the
         * queue?
         * => In queue we can throw an exception so if we try to add/remove with add and
         * remove method it will throw an exception and we have to handle that exception
         * but in offer and poll method, it will return true if value added otherwise it
         * will return false and same goes for poll.
         */

        System.out.println("Queue is : " + queue);
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue is : " + queue);
        System.out.println("Queue peeked: " + queue.peek());

        // ArrayDeque
        Deque<Integer> adq = new ArrayDeque<>();

        adq.offer(10);
        adq.offer(20);
        adq.offerLast(30);
        adq.offerFirst(60);

        System.out.println("ArrayDeque: " + adq);
        adq.poll();
        System.out.println("ArrayDeque after poll: " + adq);
        adq.pollFirst();
        System.out.println("ArrayDeque after poll: " + adq);
        adq.pollLast();
        System.out.println("ArrayDeque after poll: " + adq);

        // priority queue - gives minimum value priority at top of heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        /*
         * Below line is for giving priority to highest value
         * PriorityQueue<Integer> priorityQueue = new
         * PriorityQueue<Integer>(Comparator.reverseOrder());
         */

        priorityQueue.add(20);
        priorityQueue.offer(21);
        priorityQueue.add(22);
        priorityQueue.add(50);

        System.out.println("PriorityQueue " + priorityQueue);
        System.out.println("PriorityQueue " + priorityQueue.peek());
        System.out.println("PriorityQueue " + priorityQueue.remove());
        System.out.println("PriorityQueue " + priorityQueue.peek());
    }
}
