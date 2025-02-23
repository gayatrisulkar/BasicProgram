package com.studyprogram;
public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 10;  // The number of terms to display
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case: Fibonacci of 0 is 0, Fibonacci of 1 is 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }
}
