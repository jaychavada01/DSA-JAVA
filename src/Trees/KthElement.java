package Trees;

public class KthElement {
    static class Node {
        int value;
        Node left;
        Node right;
    }

    // creation of tree with left and right nodes
    static Node newNode(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.left = newNode.right = null;
        return newNode;
    }

    static int counter;
    static int ans;

    public static int KthLargest(Node root, int k) {
        counter = 1;
        ans = -1;

        largest(root, k);
        return ans;
    }

    public static void largest(Node root, int k) {
        if (root == null) {
            return;
        }
        largest(root.right, k);
        if (counter == k) {
            ans = root.value;
            counter++;
            return;
        } else {
            counter++;
        }
        largest(root.left, k);
    }

    public static int KthSmallest(Node root, int s) {
        counter = 1;
        ans = -1;

        smallest(root, s);
        return ans;
    }

    public static void smallest(Node root, int s){
        if (root == null) {
            return;
        }
        smallest(root.left, s);
        if (counter == s) {
            ans = root.value;
            counter++;
            return;
        } else {
            counter++;
        }
        smallest(root.right, s);
    }

    public static void main(String[] args) {
        Node root = newNode(5);
        root.left = newNode(3);
        root.right = newNode(7);
        root.left.left = newNode(2);
        root.left.right = newNode(4);
        root.right.left = newNode(6);
        root.right.right = newNode(8);

        int k = 2;
        int s = 3;
        /*
         *    5
         *   / \
         *  3   7
         * / \ / \
         * 2 4 6 8
         * 
         */
        System.out.println("The " + k + "th largest element is: " + KthLargest(root, k));
        System.out.println("The " + s + "th smallest element is: " + KthSmallest(root, s));
    }
}
