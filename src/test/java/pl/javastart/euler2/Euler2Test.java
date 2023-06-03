package pl.javastart.euler2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class Euler2Test {
    private Euler2 euler2 = new Euler2();

    @Test
    public void shouldThrowExceptionForNegativeNumbers() {
        assertThatThrownBy(() -> euler2.sumOfEvenNumbers(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Value cannot be less than zero");
    }

    @Test
    public void shouldReturn0EvenFibonacciSumFor0() {
        int sum = euler2.sumOfEvenNumbers(0);
        Assertions.assertThat(sum)
                .as("Fibonacci sum for 0")
                .isEqualTo(0);  // 0 is even
    }

    @Test
    public void shouldReturn0EvenFibonacciSumFor1() {
        int sum = euler2.sumOfEvenNumbers(1);
        Assertions.assertThat(sum)
                .as("Fibonacci sum for 1")
                .isEqualTo(0);
    }

    @Test
    public void shouldReturn0EvenFibonacciSumFor1_000_000() {
        int sum = euler2.sumOfEvenNumbers(1_000_000);
        Assertions.assertThat(sum)
                .as("Fibonacci sum for 1 000 000")
                .isEqualTo(1_089_154);
    }

    @Test
    public void shouldReturn0EvenFibonacciSumFor4_000_000() {
        int sum = euler2.sumOfEvenNumbers(4_000_000);
        Assertions.assertThat(sum)
                .as("Fibonacci sum for 40 000 000")
                .isEqualTo(4_613_732);
    }
}