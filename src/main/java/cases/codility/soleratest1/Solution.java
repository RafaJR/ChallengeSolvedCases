package cases.codility.soleratest1;

class Solution {

    /**
     * Computes the N-th number in a whimsical Fibonacci-like sequence, where each subsequent number
     * is determined by the sum of the absolute values of the digits of the two preceding numbers.
     *
     * @param N the position (0-based) in the whimsical Fibonacci sequence to compute. It should
     *          be a non-negative integer.
     * @return the N-th number in the whimsical Fibonacci-like sequence. If N is 0, the result is 0.
     *         If N is 1, the result is 1.
     */
    public int solution(int N) {

        if (N <= 0) return 0;
        if (N == 1) return 1;
        int fibo1 = 0; // f(0)
        int fibo2 = 1; // f(1)
        for (int i = 2; i <= N; i++) {
            int curr = sumDigits(fibo2) + sumDigits(fibo1);
            fibo1 = fibo2;
            fibo2 = curr;
        }
        return fibo2;
    }

    /**
     * Computes the sum of the digits of the given integer.
     *
     * @param n the integer whose digits are to be summed. It can be positive, negative, or zero.
     * @return the sum of the absolute digits of the input number.
     */
    private int sumDigits(int n) {
        long x = Math.abs((long) n); // Avoids overflow by using Integer.MIN_VALUE
        int sum = 0;
        if (x == 0) return 0;
        while (x > 0) {
            sum += (int) (x % 10);
            x /= 10;
        }
        return sum;
    }

}
