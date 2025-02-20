class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;

        ListNode mid = head, temp = head, prev = null;

        while(temp != null && temp.next != null){
            prev = mid;
            mid = mid.next;
            temp = temp.next.next;
        }

        prev.next = mid.next; 
        return head;
    }
}