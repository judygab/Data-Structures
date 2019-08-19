import java.util.Map;
import java.util.HashMap;

//solve finding nth Fobonacci Number by memoization in DP
/* To avoid the duplicate work caused by the branching, we can wrap the method in a class that stores an instance variable, memo, that maps inputs to outputs. Then we simply

check memo to see if we can avoid computing the answer for any given input, and
save the results of any calculations to memo. */

class Fibber {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Index was negative. No such thing as a negative index in a series.");

        // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memo.containsKey(n)) {
            System.out.printf("grabbing memo[%d]\n", n);
            return memo.get(n);
        }

        System.out.printf("computing fib(%d)\n", n);
        int result = fib(n - 1) + fib(n - 2);

        // memoize
        memo.put(n, result);

        return result;
    }
}
