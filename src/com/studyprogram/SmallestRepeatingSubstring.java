package com.studyprogram;
public class SmallestRepeatingSubstring {
    public static int findSmallestRepeatingLength(String str) {
        int n = str.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = str.substring(0, i);
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    repeated.append(substring);
                }
                if (repeated.toString().equals(str)) {
                    return i;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        String input = "abcabcabc";
        int result = findSmallestRepeatingLength(input);
        System.out.println("Smallest repeating substring length: " + result);
    }
}
