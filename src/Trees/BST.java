package Trees;

/*
 Element which are left side of the root node are smaller and Element which are right side of the root node are greater.
 */

public class BST {
    public class BinaryTree {

        class Node {
            int data;
            Node leftNode;
            Node rightNode;

            public Node(int data) {
                this.data = data;
            }
        }

        Node rootNode;

        public void insert(int data) {
            rootNode = insertWithRecursion(rootNode, data);
        }

        public Node insertWithRecursion(Node rootNode, int data) {
            if (rootNode == null) {
                rootNode = new Node(data);
            } else if (data < rootNode.data) {
                rootNode.leftNode = insertWithRecursion(rootNode.leftNode, data);
            } else if (data > rootNode.data) {
                rootNode.rightNode = insertWithRecursion(rootNode.rightNode, data);
            }
            return rootNode;
        }

        // leftnode -> rootnode -> rightnode
        public void inorder() {
            System.out.print("Inorder Traversal: ");
            inorderRec(rootNode);
            System.out.println();
        }

        public void inorderRec(Node rootNode) {
            if (rootNode != null) {
                inorderRec(rootNode.leftNode);
                System.out.print(rootNode.data + " ");
                inorderRec(rootNode.rightNode);
            }
        }

        // leftnode -> rightnode -> rootnode
        public void postorder() {
            System.out.print("Postorder Traversal: ");
            postorderRec(rootNode);
            System.out.println();
        }

        public void postorderRec(Node rootNode) {
            if (rootNode != null) {
                inorderRec(rootNode.leftNode);
                inorderRec(rootNode.rightNode);
                System.out.print(rootNode.data + " ");
            }
        }

        // rootnode -> leftnode -> rightnode
        public void preorder() {
            System.out.print("Preorder Traversal: ");
            preorderRec(rootNode);
            System.out.println();
        }

        public void preorderRec(Node rootNode) {
            if (rootNode != null) {
                System.out.print(rootNode.data + " ");
                inorderRec(rootNode.leftNode);
                inorderRec(rootNode.rightNode);
            }
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        BinaryTree tree = bst.new BinaryTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.inorder();
        tree.postorder();
        tree.preorder();
    }
}