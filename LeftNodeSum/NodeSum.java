package LeftNodeSum;

public class NodeSum {

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

    public static int sumOfLeftLeaves(Node root) {

        if (root == null) {
            return 0;
        }
        int leftNode = sumOfLeftLeaves(root.left);
        return leftNode;

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(1);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right = new Node(8);
        root.right.left = new Node(9);
        root.right.right = new Node(10);

        System.out.println(sumOfLeftLeaves(root));

    }

}
