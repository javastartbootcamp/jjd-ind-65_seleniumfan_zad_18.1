package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        int sum = euler2.sumOfEvenNumbers(4_000_000);
        System.out.println(sum);
    }

    public int sumOfEvenNumbers(int upperLimit) {
        if (upperLimit < 0) {
            throw new IllegalArgumentException("Value cannot be less than zero");
        }
        if (upperLimit == 0 || upperLimit == 1) {
            return 0;
        }

        int sum = 0;
        int a = 0;
        int b = 1;
        int nextFibonacciNumber;

        do {
            nextFibonacciNumber = b + a;
            if (nextFibonacciNumber % 2 == 0) {
                sum += nextFibonacciNumber;
            }
            a = b;
            b = nextFibonacciNumber;
        } while (nextFibonacciNumber < upperLimit);
        return sum;
    }
}
