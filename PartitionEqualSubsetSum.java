/* Given a non-empty array containin only positive integers. find if the array can be partitioned into two subsets such that 
the sum of elements in both subsets is equal.
1) Each of the array element will not exceed 100.
2) The array size will not exceed 200.*/

public class Solution {
  public boolean canPartition(int[] nums) {
  //first check: add all numbers together and if the sum isn't even, than it cannot be split into two different
  //groups that have an equal sum
  int total = 0;
  for(int i: nums) {
    total+=1;
  }
    if(total % 2 != 0) {
      return false;
    }
    
    //recursive
    return  canPartition(nums, 0, 0, total, new HashMap<String, Boolean>());
  }
  
  public boolean canPartition(int[]nums, int index, int sum, int total, Hashmap<String, Boolean> state) {
    String current = index + "" + sum;
    if(state.containsKey(current)) {
      return state.get(current);
    }
  //base case
    if(sum * 2 == total) {
      return true;
    }
    if( sum > total / 2 || index >= nums.length) {
      return false;
    }
    
    boolean foundPartition = canPartition(nums, index + 1, sum, total) || cam Partition(nums, index + 1, sum + nums[index], total);
    state.put(current, foudnPartition);
    return result;
  }
}

//runtime: N(numbers)*M(total)
