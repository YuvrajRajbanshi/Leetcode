package ReverseLL;

public class ReverseLinkedList {

    public static void main(String[] args) {

        linnkedList ll = new linnkedList();
        for (int i = 1; i <= 5; i++) {
            ll.addLast(i);

        }

        ll.printLL();

        ll.reverse();
        ll.printLL();

    }
}

/**
 * linnkedList
 */
class linnkedList {

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

    public void addLast(int data) {

        Node newNode = new Node(data);
        // Node;

        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;

    }

    public void printLL() {

        Node cur;
        cur = head;
        if (head == null) {
            System.out.println("The LL is empty so don't worry ");
            return;
        }

        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;

        }

        System.out.println("Null");
    }

    public void reverse() {

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = prev;
    }
}
