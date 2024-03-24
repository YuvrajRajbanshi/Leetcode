package LinkedListCyle2;

public class Solve {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode head;

    public boolean isCyle() {

        ListNode slow = head;
        ListNode fast = head;

        boolean cycle = false;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                return true;
            }
            if (cycle == false) {
                return false;
            }

            slow = head;
            ListNode prev = null;

            while (slow != head) {

                prev = fast;
                slow = slow.next;
                fast = fast.next;

            }

            prev.next = null;

        }

        return false;
    }

    public static void main(String[] args) {

    }

}
