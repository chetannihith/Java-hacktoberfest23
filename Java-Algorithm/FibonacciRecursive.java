import java.util.Scanner;

/**
 * A simple recursive implementation of the Fibonacci sequence.
 *
 * Example output:
 *
 * Fibonacci(0) = 0
 * Fibonacci(1) = 1
 * Fibonacci(2) = 1
 * Fibonacci(3) = 2
 * Fibonacci(4) = 3
 * Fibonacci(5) = 5
 * Fibonacci(6) = 8
 * Fibonacci(7) = 13
 * Fibonacci(8) = 21
 * Fibonacci(9) = 34
 * Fibonacci(10) = 55
 */

public class FibonacciRecursive {

    public static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate the Fibonacci number: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
            } else {
                System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        scanner.close();
    }
}
