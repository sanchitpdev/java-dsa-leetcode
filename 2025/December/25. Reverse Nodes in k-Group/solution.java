class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count < k) return head;

        curr = head;
        ListNode prev = null;
        ListNode next = null;
        count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr, k);
        return prev;
    }
}
