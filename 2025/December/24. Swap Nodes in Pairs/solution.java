class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = prev.next;
            prev.next = second;

            prev = first;
        }  

        return dummy.next;
        
    }
}
