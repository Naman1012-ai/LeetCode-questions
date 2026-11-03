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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode current = head;
        ListNode temp = head;
        if (head == null) {
            return head;
        }
        
        int len = 1;
        while(temp.next != null){
            temp = temp.next;
            len++;
        }

        int pos = k % len;
        if(pos == 0) return head;

        for(int i = 0; i < len - pos - 1; i++)
            current = current.next;
        
        ListNode res = current.next;
        current.next = null;
        temp.next = head;

        return res;
    }
}