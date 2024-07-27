package LinkedList;
/*
 * Que. Find and Delete the nth node from the end of Linkedlist
 */

public class NthNodeOperation {
    // head is first node in the list
    private Node head;

    public static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // deletion from last index
    public void removeNthFromEnd(Node head, int n) {
        if (head.next == null) {
            return;
        }

        // Counting size of list
        int size = 0;
        Node currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        if (n == size) {
            return;
        }

        // finding one node before last node
        int indexToSearch = size - n;
        Node prevNode = head;

        int i = 1;
        while (i < indexToSearch) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
    }

    public int findNthFromLast(int N)
    {
        int length = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        // check if value of N is not more than length of
        // the linked list
        if (length < N) {
            return -1;
        }
        temp = head;

        // 2) get the (length-N+1)th node from the beginning
        for (int i = 1; i < length - N + 1; i++)
            temp = temp.next;

        return temp.value;
    }

    public static void main(String[] args) {
        NthNodeOperation list = new NthNodeOperation();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);

        System.out.println("Linked list before deletion of nth last node:");
        list.display();
        
        System.out.println("Linked list After deletion of nth last node:");
        list.removeNthFromEnd(list.head, 4);
        list.display();

        System.out.println("Linked list node at nth index: "+ list.findNthFromLast(4));
    }
}
