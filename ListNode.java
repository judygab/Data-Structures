//node in a Linked List
public class ListNode {
  
  public int val;
  public ListNode next = null;
  
  public ListNode(int x) {
    val = x;
  }
  
  public ListNode (int[] arr) {
  
    if(arr == null || arr.length == 0) 
      throw new IllegalArgumentException("arr cannot be empty");
      
    this.val = arr[0];
    ListNode curNode = this;
    for(int i = 1; i < arr.length; i++){
        curNode.next = new ListNode(arr[i]);
        curNode = curNode.next;
    }
  }
}
