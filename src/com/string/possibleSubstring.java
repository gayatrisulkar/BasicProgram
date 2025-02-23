package com.string;

public class possibleSubstring {
    public static void main(String[] args) {
        String str = "Tekdi Technologies";
        int n = str.length();
        
        System.out.println("All substrings:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}