package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
    }

    public int sumOfEvenNumbers(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Value cannot be less than zero");
        }
        if (count == 0 || count == 1) {
            return 0;
        }

        int sum = 0;
        int[] fib = new int[count];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < count; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (fib[i] % 2 == 0) {
                sum += fib[i];
            }
        }
        return sum;
    }
}
