class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class HareAndTortoise {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;  // Tortoise (moves 1 step)
        ListNode fast = head;  // Hare (moves 2 steps)

        while (fast != null && fast.next != null) {
            slow = slow.next;               // Move tortoise by 1 step
            fast = fast.next.next;         // Move hare by 2 steps

            if (slow == fast) {            // Cycle detected
                return true;
            }
        }

        return false;  // No cycle
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creating a cycle

        boolean result = hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result);
    }
}
