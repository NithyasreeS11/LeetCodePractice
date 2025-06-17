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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0,head);
        ListNode temp1 = temp;
        ListNode temp2 = temp;
        int c = 1;
        while(c<=n+1){
            temp1 = temp1.next;
            c++;
        }
        while(temp1!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp2.next!=null && temp2.next.next!=null) temp2.next = temp2.next.next;
        else temp2.next = null;
        return temp.next;
    }
}
