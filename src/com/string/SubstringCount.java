package com.string;
public class SubstringCount {
    public static int countSubstrings(String s1, String s2) {
        int count = 0;
        int n = s1.length();//5
        int m = s2.length();//9

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s1.substring(i, j);
                int index = s2.indexOf(substring);
                while (index != -1) {
                    count++;
                    index = s2.indexOf(substring, index + 1);
                    
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "swalencud";
        int result = countSubstrings(s1, s2);
        System.out.println("Total number of substrings of s1 present in s2: " + result);
    }
}
//output=3
