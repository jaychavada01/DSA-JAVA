package Trees;

import java.util.*;

public class Binary_Tree {
    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null; // here leaf node is created
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // rootnode -> leftnode -> rightnode
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // leftnode -> rootnode -> rightnode
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    // leftnode -> rightnode -> rootnode
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // null node value is for new line traversing

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.value + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        // count left nodes + right nodes + 1 = total nodes of tree
        if (root == null)
            return 0;

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null)
            return 0;

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.value;
    }

    // Height of Tree : Distance between root to leaf node
    public static int getHeight(Node root) {
        if (root == null)
            return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    /*
     * Diameter of Tree : Number of nodes in the longest path between any 2 nodes
     * Diameter = Max(Left sub tree height + Right sub tree height + (left nodes
     * height + right nodes height + 1))
     */

    // O(n^2) time complexity
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = getHeight(root.left) + getHeight(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    };

    // O(n) time complexity

    static class Treeinfo{
        int height;
        int diameter;

        Treeinfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    /*
     * left subtree height and diameter then right subtree height and diameter
     * then max of left subtree height and right subtree height
     * then left sub tree diameter and then right sub tree diameter and count max diameter from that
     */
    public static Treeinfo diameter2(Node root){

        if (root == null){
            return new Treeinfo(0, 0);
        }

        Treeinfo left = diameter2(root.left);
        Treeinfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int mydiameter = Math.max(diam3, Math.max(diam1, diam2));

        Treeinfo myInfo = new Treeinfo(myHeight, mydiameter);
        return myInfo;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println("Preorder Traversal: ");
        preOrder(root);
        System.out.println();

        System.out.println("Inorder Traversal: ");
        inOrder(root);
        System.out.println();

        System.out.println("Postorder Traversal: ");
        postOrder(root);
        System.out.println();

        System.out.println("Levelorder Traversal or BFS Traversal: ");
        levelOrder(root);

        System.out.println("No. of Nodes Tree have: " + countOfNodes(root));

        System.out.println("Sum of all nodes is: " + sumOfNodes(root));

        System.out.println("Height of Tree: " + getHeight(root));

        System.out.println("Diameter of Tree with Time complexity of O(n^2): " + diameter(root));

        System.out.println("Diameter of Tree with Time complexity of O(n): " + diameter2(root).diameter);
    }
}
