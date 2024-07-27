package LinkedList;

public class PalindromeListCheck {
    // head is first node in the list
    private Node head;

    public static class Node {
        private final int value;
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
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public boolean isPalindrome(){
        return true;
    }
    
    public static void main(String[] args) {
        PalindromeListCheck list = new PalindromeListCheck();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();

        System.out.println("Checking the linked list is palindrome or not?");
    }
}
