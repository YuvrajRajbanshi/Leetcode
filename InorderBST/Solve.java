package InorderBST;

/**
 * Solve
 */
public class Solve {

    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {

            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {

        static int indx = -1;

        public static Node buildTree(int nodes[]) {
            indx++;
            if (nodes[indx] == -1) {

                return null;

            }

            Node newNode = new Node(nodes[indx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        int nodes[] = { 1, -1, 2, 3 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println("Inorder traversal of the BST:");
        inorder(root);
    }
}