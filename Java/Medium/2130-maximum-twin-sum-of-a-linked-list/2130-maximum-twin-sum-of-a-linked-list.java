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
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        int maxSum = 0;
        while(slow != null){
            maxSum = Math.max(maxSum, stack.pop() + slow.val);
            slow = slow.next;
        }

        return maxSum;
        
    }
}