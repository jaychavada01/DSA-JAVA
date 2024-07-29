package Trees;

import java.util.*;

public class MirrorTree {

    static class Node {
        int value;
        Node left;
        Node right;
    }

    // creation of tree with left and right nodes
    static Node newNode(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.left = newNode.right = null;
        return newNode;
    }

    static void mirror(Node root){
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        // here BFS operations which means swapping of left and right subtrees
        while (q.size() > 0) {
            // pop top node from queue
            Node currNode = q.peek();
            q.poll();

            // swap left and right children
            Node tempNode = currNode.left;
            currNode.left = currNode.right;
            currNode.right = tempNode;

            // push left and right children
            if(currNode.left != null){
                q.offer(currNode.left);
            }
            if(currNode.right != null){
                q.offer(currNode.right);
            }
        } 
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }
    
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        System.out.println("Inorder traversal of the constructed tree is: ");
        inOrder(root);

        /* Convert tree to its mirror */
        mirror(root);

        /* Print inorder traversal of the mirror tree */
        System.out.println("\nInorder traversal of the mirror tree is: ");
        inOrder(root);
    }
}
