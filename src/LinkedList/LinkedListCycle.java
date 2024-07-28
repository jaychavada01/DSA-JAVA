package LinkedList;

public class LinkedListCycle {

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

    public boolean hasCycle(Node head){
        if(head == null){
            return false;
        }
        Node hare = head; // fast pointer
        Node turtle = head; // slow pointer

        while (hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true; // cycle detected
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);

        System.out.println("Linked list is: ");
        list.display();

        // Creating a cycle
        list.head.next.next.next.next = list.head.next;

        boolean result = list.hasCycle(list.head);
        System.out.println("Has Cycle? " + result);
    }
}
