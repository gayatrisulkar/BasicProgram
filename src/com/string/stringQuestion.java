package com.string;
public class stringQuestion {

    public static void main(String[] args) {
        String input = "gayatrtig";  // Example input
        System.out.println(groupAndSort(input));
    }

    public static String groupAndSort(String input) {
        // Create an array to count the occurrences of each character
        int[] charCount = new int[256];  // Assuming ASCII characters
        for (char c : input.toCharArray()) {
            charCount[c]++;
            
          
        }

        // StringBuilder to hold the result
        StringBuilder result = new StringBuilder();

        // Iterate through the string and append characters
        // Group repeated characters first
        for (char c : input.toCharArray()) {
        
            if (charCount[c] > 0) {
                // Append the character as many times as its frequency
                for (int i = 0; i < charCount[c]; i++) {
                    result.append(c);
                }
                // Set the count to 0 so we don't process the same character again
                charCount[c] = 0;
            }
        }

        return result.toString();
    }
}