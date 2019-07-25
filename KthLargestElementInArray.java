class Solution {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    for(int i: nums) {
      minHeap.add(i);
      if(minHEap.size() > k) {
        minHeap.remove();
      }
    }
    
    //the root will contain kth largest element since it's a minHeap and contains only K elements
    return minHeap.remove();
  }
}

//runtime of building heap - N
//using Heap instead of sorting in-place (N(logN)) = O(N)
