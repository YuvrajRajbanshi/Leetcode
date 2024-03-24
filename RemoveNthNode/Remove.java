package RemoveNthNode;

public class Remove {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        // for (int i = 1; i <= 5; i++) {
        // ll.addTail(i);
        // }

        ll.addFirst(1);
        ll.printLinkedList();
        ll.deleteNthNode(2);

        ll.printLinkedList();

    }

}

class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        if (head == null) {

            head = tail = newNode;
            return;

        }

        newNode.next = head;
        head = newNode;

    }

    public void addTail(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void printLinkedList() {

        Node cur;

        cur = head;

        while (cur != null) {

            System.out.print(cur.data + "  ");
            cur = cur.next;
        }

        System.out.println();

    }

    public Node deleteNthNode(int n) {

        Node cur, prev, del;
        prev = head;
        int size = 0;

        cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        if (size == n) {

            head = head.next;
            return null;
        }
        int indx = size - n;
        int j = 1;
        while (j < indx) {
            prev = prev.next;
            j++;

        }

        del = prev.next = prev.next.next;

        return del;
    }

}