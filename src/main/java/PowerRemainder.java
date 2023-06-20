public class PowerRemainder {

    public static void main(String[] args) {
        System.out.println(pow(-3, 3, 5));
        System.out.println(pow(-1, 1, 20));
    }

    /**
     * Implement pow(A, B) % C.
     * In other words, given A, B and C, Find (A^B % C).
     * Note: The remainder of the division cannot be negative.
     * In other words, make sure the answer you return is non-negative.
     * @param A
     * @param B
     * @param C
     * @return
     */
    public static int pow(int A, int B, int C) {
        // Just write your code below to complete the function.
        // Required inputs are available to you as the function arguments.
        // Do not print the result or any output.
        // Just return the result via this function.

        int result = 1;
        for (int i = 0; i < B; i++) {
            result *= A;
        }

        if (A < 0 && B % 2 == 1) {
            result = C + (result % C);
        } else {
            result = result % C;
        }
        return result;
    }
}
