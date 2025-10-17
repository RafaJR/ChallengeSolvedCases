package cases.codility.soleratest1;

class Solution2 {

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

        int f1 = 0; // f(0)
        int f2 = 1; // f(1)
        int sd1 = 0; // sumDigits(f1)
        int sd2 = 1; // sumDigits(f2)

        for (int i = 2; i <= N; i++) {
            int curr = sd2 + sd1;
            f1 = f2;
            f2 = curr;
            sd1 = sd2;
            sd2 = sumDigits(f2); // one only call for each iteration
        }
        return f2;
    }


    /**
     * Computes the sum of the digits of the given integer.
     *
     * @param n the integer whose digits are to be summed. It can only be positive.
     * @return the sum of the absolute digits of the input number.
     */
    private int sumDigits(int n) {

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

}
