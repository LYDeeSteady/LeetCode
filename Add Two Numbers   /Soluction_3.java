/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            node.next = new ListNode(sum % 10);
            carry = sum/10;
            l1 = ((l1 == null) ? l1 : l1.next);
            l2 = ((l2 == null) ? l2 : l2.next);
            node = node.next;
        }
        return head.next;
    }
}