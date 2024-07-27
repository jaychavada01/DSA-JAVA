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

    public Node reverse(Node head){
        Node prevNode = null;
        Node currNode = head;

        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    private Node findMiddle(Node head) {
        Node hare = head; // jumps two nodes
        Node turtle = head; // jumps one node

        while (hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }

        // Divide the list into two parts and find the middle of the list and second half part will be reverse
        Node middle = findMiddle(head); // 1st half's end
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while (secondHalfStart != null){
            if(firstHalfStart.value != secondHalfStart.value){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
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

        System.out.println("Checking if the linked list is a palindrome:");
        boolean result = list.isPalindrome(list.head);
        System.out.println("Is palindrome? " + result);
    }
}
