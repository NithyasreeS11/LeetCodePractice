class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head = null;
        ListNode temp = null;
        int c = 0, n = 0;
        while(l1!=null && l2!=null){
            n = l1.val + l2.val + c;
            ListNode curr = new ListNode();
            if(n>9){
                curr.val = n % 10;
                c = n / 10;
            }
            else{
                curr.val = n;
                c = 0;
            }
            if(head==null){
                head = curr;
                temp = curr;
            }
            else{
                temp.next = curr;
                temp = curr;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            n = l1.val + c;
            ListNode curr = new ListNode();
            if(n>9){
                curr.val = n % 10;
                c = n / 10;
            }
            else{
                curr.val = n;
                c = 0;
            }
            temp.next = curr;
            temp = curr;
            l1 = l1.next;
        }
        while(l2!=null){
            n = l2.val + c;
            ListNode curr = new ListNode();
            if(n>9){
                curr.val = n%10;
                c = n / 10;
            }
            else{
                curr.val = n;
                c = 0;
            }
            temp.next = curr;
            temp = curr;
            l2 = l2.next;
        }
        if(c>0){
            ListNode curr = new ListNode(c);
            temp.next = curr;
            temp = curr;   
        }
        return head;
    }
}
