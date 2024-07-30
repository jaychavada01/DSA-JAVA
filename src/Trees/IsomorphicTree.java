package Trees;

class Node {
    int value;
    Node leftNode, rightNode;

    Node(int item) {
        value = item;
        leftNode = rightNode = null; // Initialize leftNode and rightNode to null
    }
}

public class IsomorphicTree {
    Node root1, root2;

    boolean isIsomorphic(Node n1, Node n2) {
        // if both trees are null, trees are isomorphic
        if (n1 == null && n2 == null)
            return true;

        // if one of the n1 or n2 is null, then tree is not isomorphic
        if (n1 == null || n2 == null)
            return false;

        // if values of n1 and n2 do not match, trees are not isomorphic
        if (n1.value != n2.value)
            return false;

        /*
         * For proving tree isomorphic there are two cases:
         * 1) root of subtree is swapped
         * 2) root of subtree is not swapped
         */
        return (isIsomorphic(n1.leftNode, n2.leftNode) && isIsomorphic(n1.rightNode, n2.rightNode))
                || (isIsomorphic(n1.leftNode, n2.rightNode) && isIsomorphic(n1.rightNode, n2.leftNode));
    }

    public static void main(String[] args) {
        IsomorphicTree tree = new IsomorphicTree();

        // Let us create trees shown in above diagram
        tree.root1 = new Node(1);
        tree.root1.leftNode = new Node(2);
        tree.root1.rightNode = new Node(3);
        tree.root1.leftNode.leftNode = new Node(4);
        tree.root1.leftNode.rightNode = new Node(5);
        tree.root1.rightNode.leftNode = new Node(6);
        tree.root1.leftNode.rightNode.leftNode = new Node(7);
        tree.root1.leftNode.rightNode.rightNode = new Node(8);

        tree.root2 = new Node(1);
        tree.root2.leftNode = new Node(3);
        tree.root2.rightNode = new Node(2);
        tree.root2.rightNode.leftNode = new Node(4);
        tree.root2.rightNode.rightNode = new Node(5);
        tree.root2.leftNode.rightNode = new Node(6);
        tree.root2.rightNode.rightNode.leftNode = new Node(8);
        tree.root2.rightNode.rightNode.rightNode = new Node(7);

        if (tree.isIsomorphic(tree.root1, tree.root2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}