import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution32 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null) {
            if (set.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}