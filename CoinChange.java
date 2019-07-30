//given coins of different denominations and a total amount of money (amount). Write a function to compute the fewest number 
//of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
//assume that you have an infinite amount of each kind of coin
//dynamic programming
class Solution {
  public int coinChange(int[] coins, int amount) {
    Arrays.sort(coins); 
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    //base - to make up 0 subsets
    dp[0] = 0;
    //i = #of sets
    for(int i = 0; i <= amount; i++) {
      for(int j = 0; j < cons.length; j++) {
        if(coins[j] <= i) {
          dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]);
        } else {
          break;
        }
      }
    }
    return dp[amount] > amount ? -1 : dp[amount];
  }
}
//runtime: N*M
