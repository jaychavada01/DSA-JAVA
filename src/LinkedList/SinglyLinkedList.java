package LinkedList;

public class SinglyLinkedList {

    private Node head; // head is first node in the list
    private Node tail; // tail is last node in the list

    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertAtIndex(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head; // it is at index = 0
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    
    public Node findNode(int value) {
        Node node = head;
        while (node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }

        Node prevNode = get(index - 1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;

        return val;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(48);
        list.insertFirst(98);

        list.insertLast(2);
        list.insertLast(1);

        list.insertAtIndex(38, 2);

        list.display();
        System.out.println("Deleted Node from First: " + list.deleteFirst());
        list.display();

        System.out.println("Deleted Node from last: " + list.deleteLast());
        list.display();
        
        System.out.println("Deleted Node value from Index: " + list.deleteAtIndex(3));
        list.display();
    }
}