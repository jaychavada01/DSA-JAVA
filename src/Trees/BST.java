package Trees;

/*
 * Binary Search Tree: left sub tree -> root -> right sub tree
 * left sub tree is smaller than root 
 * right sub tree is greater than root
 * Search Time complexity of BST is O(H), H = Height
 */

import java.util.ArrayList;

public class BST {
    static class Node {
        int value;
        Node leftNode;
        Node rightNode;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node insert(Node rootNode, int data) {
        if (rootNode == null) {
            return rootNode = new Node(data);
        }

        if (rootNode.value > data) {
            rootNode.leftNode = insert(rootNode.leftNode, data);
        } else {
            rootNode.rightNode = insert(rootNode.rightNode, data);
        }
        return rootNode;
    }

    public static void inOrder(Node rootNode) {
        if (rootNode == null)
            return;

        inOrder(rootNode.leftNode);
        System.out.print(rootNode.value + " ");
        inOrder(rootNode.rightNode);
    }

    public static boolean Search(Node rootNode, int key) {

        if (rootNode == null)
            return false;

        if (rootNode.value > key) { // left subtree
            return Search(rootNode.leftNode, key);
        }

        else if (rootNode.value < key) { // right subtree
            return Search(rootNode.rightNode, key);
        }

        else { // rootNode.value == key
            return true;
        }
    }

    public static Node delete(Node rootNode, int val) {
        if (rootNode.value > val) {
            rootNode.leftNode = delete(rootNode.leftNode, val);
        } else if (rootNode.value < val) {
            rootNode.rightNode = delete(rootNode.rightNode, val);
        } else { // rootNode.value == val
                 // case 1: delete value from root node no children
            if (rootNode.leftNode == null && rootNode.rightNode == null) {
                return null;
            }

            // case 2 : one child to root
            if (rootNode.leftNode == null) {
                return rootNode.rightNode;
            } else if (rootNode.rightNode == null) {
                return rootNode.leftNode;
            }

            // case 3 : two children to root
            Node IS = inOrderSuccessor(rootNode.rightNode);
            rootNode.value = IS.value;
            rootNode.rightNode = delete(rootNode.rightNode, IS.value);
        }
        return rootNode;
    }

    public static Node inOrderSuccessor(Node rootNode) {
        while (rootNode.leftNode != null) {
            rootNode = rootNode.leftNode;
        }
        return rootNode;
    }

    public static void printInRange(Node rootNode, int x, int y) {
        if (rootNode == null)
            return;

        if (rootNode.value >= x && rootNode.value <= y) {
            printInRange(rootNode.leftNode, x, y);
            System.out.print(rootNode.value + " ");
            printInRange(rootNode.rightNode, x, y);
        }

        else if (rootNode.value >= y) {
            printInRange(rootNode.leftNode, x, y);
        } else {
            printInRange(rootNode.rightNode, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("END");
    }

    public static void printRootToLeaf(Node rootNode, ArrayList<Integer> path) {
        if (rootNode == null)
            return;

        path.add(rootNode.value);

        // leaf node
        if (rootNode.leftNode == null && rootNode.rightNode == null) {
            printPath(path);
        } else {
            // non leaf node
            printRootToLeaf(rootNode.leftNode, path);
            printRootToLeaf(rootNode.rightNode, path);
        }

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14, 12, 13 };

        Node rooNode = null;

        for (int i = 0; i < values.length; i++) {
            rooNode = insert(rooNode, values[i]);
        }

        System.out.println("Inorder Traversal: ");
        inOrder(rooNode);
        System.out.println();

        int key = 5;
        if (Search(rooNode, key)) {
            System.out.println("Key " + key + " Found");
        } else
            System.out.println("Key " + key + " not Found");

        int val = 5;

        System.out.println("Before deletion: ");
        inOrder(rooNode);
        System.out.println();

        delete(rooNode, val);

        System.out.println("After deletion of node with " + val + " value: ");
        inOrder(rooNode);

        System.out.println();

        int x = 3;
        int y = 10;

        System.out.println("Print in range of " + x + " and " + y + " is: ");
        printInRange(rooNode, x, y);

        System.out.println();
        System.out.println("Paths from root to leaf node : ");
        printRootToLeaf(rooNode, new ArrayList<Integer>());
    }
}