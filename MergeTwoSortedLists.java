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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp = null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ListNode curr = new ListNode(list1.val);
                if(head==null){
                    head = curr;
                    temp = curr;
                }
                temp.next = curr;
                temp = curr;
                list1 = list1.next;
            }
            else{
                ListNode curr = new ListNode(list2.val);
                if(head==null){
                    head = curr;
                    temp = curr;
                }
                temp.next = curr;
                temp = curr;
                list2 = list2.next;
            }
        }
        if(list1==null){
            temp.next = list2;
        }
        else if(list2==null){
            temp.next = list1;
        }
        return head;
    }
}
