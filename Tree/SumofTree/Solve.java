package Tree.SumofTree;

public class Solve {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sumOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = sumOfTree(root.left);
        int rightChild = sumOfTree(root.right);

        // Calculate the maximum path sum considering either left, right, or both
        // children
        int maxSinglePath = Math.max(Math.max(leftChild, rightChild) + root.data, root.data);

        // Calculate the maximum path sum considering the path through the root node
        int maxPathThroughRoot = Math.max(maxSinglePath, leftChild + rightChild + root.data);

        return maxPathThroughRoot;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(4);
        root.right.left = new Node(11);
        root.right.right = new Node(21);

        int maxSum = sumOfTree(root);

        System.out.println("Maximum Path Sum: " + maxSum);
    }
}
