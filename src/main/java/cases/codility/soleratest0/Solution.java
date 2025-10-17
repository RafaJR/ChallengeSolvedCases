package cases.codility.soleratest0;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Find the smallest missing positive integer.
        // Approach:
        // - Only values in range [1..N] matter for the answer, where N = A.length.
        // - Mark presence of numbers 1..N in a boolean array.
        // - The first index i in [1..N] not marked is the answer; otherwise, answer is N+1.

        int n = A.length;
        boolean[] seen = new boolean[n + 2]; // +2 to safely access index N+1 if needed

        // Mark seen positives within [1..N]
        for (int v : A) {
            if (v > 0 && v <= n) {
                seen[v] = true;
            }
        }

        // The first missing positive in [1..N]
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                return i;
            }
        }

        // If all 1..N are present, the answer is N+1
        return n + 1;
    }

}
