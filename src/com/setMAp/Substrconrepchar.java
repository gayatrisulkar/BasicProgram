package com.setMAp;

import java.util.HashMap;
import java.util.Map;

// To find largest substring length which doesn't contain repeating characters
// I/P = "abbac", O/P = "bac"
public class Substrconrepchar {

    public static void main(String[] args) {
        String s = "abbac";
        //System.out.println(findLargestSubstring(s));
        System.out.println(findLongestUniqueSubstring(s));
    }

    public static String findLongestUniqueSubstring(String str) {
        String longest = "";
        String current = "";
        for (char c : str.toCharArray()) {
            if (current.contains(String.valueOf(c))) {
                current = current.substring(current.indexOf(c) + 1); // Remove repeated character
            }
            current += c;
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }
    private static String findLargestSubstring(String s) {
        // Initialize the variables for tracking the largest substring
        String longestSubstring = "";
        int longestSubstringLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        int start = 0; // This is the start index of the window
        
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            
            // If the character is already in the map, move the start pointer to avoid duplicates
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }
            
            // Update the current character's position in the map
            map.put(ch, end);
            
            // Check if the current substring is the longest found so far
            if (end - start + 1 > longestSubstringLength) {
                longestSubstringLength = end - start + 1;
                longestSubstring = s.substring(start, end + 1);
            }
        }
        
        return longestSubstring;
    }
}
