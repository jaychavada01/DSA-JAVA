package LinkedList;

public class DoublyLinkedList {

    private Node head;

    public class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        newNode.prev = null;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        Node last = head;

        newNode.next = null;

        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    

    public Node findNode(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAtIndex(int after, int value) {
        Node prevNode = findNode(after);

        if(prevNode == null){
            System.out.println("Previous node does not exist!");
            return;
        }

        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Printing in reverse: ");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(48);
        list.insertFirst(98);

        list.insertLast(2);
        list.insertLast(1);

        list.insertAtIndex(5, 66);
        list.display();
    }
}