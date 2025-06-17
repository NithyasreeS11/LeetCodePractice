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
    public ListNode middleNode(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int c = 1;
        while(temp2.next!=null && temp2.next.next!=null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
            c+=2;
        }
        if(temp2.next!=null) c+=1;
        if(c%2==0) return temp1.next;
        else return temp1;
    }
}
