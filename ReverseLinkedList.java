/// Time Complexity: O(n)
/// Space Complexity: O(1)
public class Solution1 {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /// Iterative
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }
    //recursive
     public ListNode reverseList(ListNode head) {
     
        if(head == null|| head.next == null)
            return head;

        ListNode rhead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return rhead;
    }
    }
