public class PowerRemainder {

    public static void main(String[] args) {
        System.out.println(pow(-3, 3, 5));
        System.out.println(pow(-1, 1, 20));
    }

    public static int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        Integer result = 1;
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
