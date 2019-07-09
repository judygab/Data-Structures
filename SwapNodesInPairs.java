public class Solution {
  public ListNode swapPairs(ListNode head) {
  ListNode temp = new ListNode(0);
  temp.next = head;
  ListNode current = temp;
  
  while (current.next != null && current.next.next != null) {
    ListNode node1 = current.next;
    ListNode node2 = current.next.next;
    node1.next = node2.next;
    current.next = node2;
    current.next.next = node1;
    current = current.next.next;
  }
  
  return temp.next;
  }
}
