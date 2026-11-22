/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> uniqueValues = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            if (!uniqueValues.contains(current.val)) {
                uniqueValues.add(current.val);
            }
            current = current.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int val : uniqueValues) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        return dummy.next;
        
    }
}