package cases.codility.soleratest1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    /**
     * This class tests the `solution` method in the `Solution2` class.
     * The `solution` method calculates the last number in a whimsical Fibonacci sequence
     * of length N + 1, where each number is derived from the sum of the digits of the
     * previous two numbers.
     */

    @Test
    void testSolution2With0() {
        // Test when N = 0
        Solution2 Solution2 = new Solution2();
        int result = Solution2.solution(0);
        assertEquals(0, result, "Expected the result to be 0 for N = 0.");
    }

    @Test
    void testSolution2With1() {
        // Test when N = 1
        Solution2 Solution2 = new Solution2();
        int result = Solution2.solution(1);
        assertEquals(1, result, "Expected the result to be 1 for N = 1.");
    }

    @Test
    void testSolution2With2() {
        // Test when N = 2
        Solution2 Solution2 = new Solution2();
        int result = Solution2.solution(2);
        assertEquals(1, result, "Expected the result to be 1 for N = 2.");
    }

    @Test
    void testSolution2With9() {
        // Test when N = 9
        Solution2 Solution2 = new Solution2();
        int result = Solution2.solution(9);
        assertEquals(7, result, "Expected the result to be 7 for N = 9.");
    }

    @Test
    void testSolution2With15() {
        // Test when N = 15
        Solution2 Solution2 = new Solution2();
        int result = Solution2.solution(15);
        assertEquals(16, result, "Expected the result to be 16 for N = 15.");
    }

    @Test
    void testSolution2With19() {
        // Test when N = 19
        Solution2 Solution2 = new Solution2();
        int result = Solution2.solution(19);
        assertEquals(5, result, "Expected the result to be 5 for N = 19.");
    }

    @Test
    void testSolution2With500() {
        // Test when N = 500
        Solution2 Solution2 = new Solution2();
        int result = Solution2.solution(500);
        assertEquals(6, result, "Expected the result to be 1 for N = 500.");
    }
}