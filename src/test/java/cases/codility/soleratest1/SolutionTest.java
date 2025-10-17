package cases.codility.soleratest1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    /**
     * This class tests the `solution` method in the `Solution` class.
     * The `solution` method calculates the last number in a whimsical Fibonacci sequence
     * of length N + 1, where each number is derived from the sum of the digits of the
     * previous two numbers.
     */

    @Test
    void testSolutionWith0() {
        // Test when N = 0
        Solution Solution = new Solution();
        int result = Solution.solution(0);
        assertEquals(0, result, "Expected the result to be 0 for N = 0.");
    }

    @Test
    void testSolutionWith1() {
        // Test when N = 1
        Solution Solution = new Solution();
        int result = Solution.solution(1);
        assertEquals(1, result, "Expected the result to be 1 for N = 1.");
    }

    @Test
    void testSolutionWith2() {
        // Test when N = 2
        Solution Solution = new Solution();
        int result = Solution.solution(2);
        assertEquals(1, result, "Expected the result to be 1 for N = 2.");
    }

    @Test
    void testSolutionWith9() {
        // Test when N = 9
        Solution Solution = new Solution();
        int result = Solution.solution(9);
        assertEquals(7, result, "Expected the result to be 1 for N = 9.");
    }

    @Test
    void testSolutionWith19() {
        // Test when N = 19
        Solution Solution = new Solution();
        int result = Solution.solution(19);
        assertEquals(5, result, "Expected the result to be 1 for N = 19.");
    }
}