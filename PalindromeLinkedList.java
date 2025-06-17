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
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp2.next!=null && temp2.next.next!=null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        ListNode fhalf = head;
        ListNode shalf = reverse(temp1.next);
        while(shalf!=null){
            if(fhalf.val!=shalf.val) return false;
            fhalf = fhalf.next;
            shalf = shalf.next;
        }
        return true;
    }
}
