package com.Array;

public class RotateArrayKTimes {

    // Function to rotate the array k times to the right
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    // Helper function to reverse elements of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main function to test the rotation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotateArray(arr, k);

        System.out.println("\nRotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}