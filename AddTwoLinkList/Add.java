package AddTwoLinkList;

public class Add {

    // public static int addLL(CustomLinkedList ll1, CustomLinkedList ll2) {

    // CustomLinkedList dummyHead = new CustomLinkedList(0);
    // CustomLinkedList curr = dummyHead;
    // int carry = 0;

    // while (ll1 != null || ll2 != null) {
    // int x = (ll1 != null) ? ll1.val : 0;
    // int y = (ll2 != null) ? ll2.val : 0;
    // int sum = x + y + carry;

    // carry = sum / 10;
    // curr.next = new CustomLinkedList(sum % 10);
    // curr = curr.next;

    // if (ll1 != null)
    // ll1 = ll1.next;
    // if (ll2 != null)
    // ll2 = ll2.next;
    // }

    // if (carry > 0) {
    // curr.next = new CustomLinkedList(carry);
    // }

    // return dummyHead.next;
    // }

    public static void main(String args[]) {

        CustomLinkedList ll1 = new CustomLinkedList();
        CustomLinkedList ll2 = new CustomLinkedList();

        ll1.addLast(2);
        ll1.addLast(4);
        ll1.addLast(3);
        ll1.printLL();
        System.out.println();

        System.out.println("First list of the linked list");

        ll2.addLast(5);
        ll2.addLast(6);
        ll2.addLast(4);
        ll2.printLL();

    }
}

class CustomLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        Node cur = head;

        if (head == null) {
            System.out.println("The linked List is empty ");
            return;
        }

        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
    }
}
