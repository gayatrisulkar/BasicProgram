package com.string;


public class SubstringVowels {
    public static boolean canSplitIntoSubstring(String S) {
    	int n=S.length();
    	 for (int i = 0; i < n - 1; i++) {
    	      int vowelsLeft = 0, vowelsRight = 0;
    	 
    	      // Count the number of vowels in left substring
    	      for (int j = 0; j <= i; j++) {
    	        if (isVowel(S.charAt(j))) {
    	          vowelsLeft++;
    	        }
    	      }
    	 
    	      // Count the number of vowels in right substring
    	      for (int j = i + 1; j < n; j++) {
    	        if (isVowel(S.charAt(j))) {
    	          vowelsRight++;
    	        }
    	      }
    	 
    	      // check if substrings has equal
    	      // number of vowels
    	      if (vowelsLeft == vowelsRight) {
    	        return true;
    	      }
    	    }
    	 return false;
    }
    static boolean isVowel(char c)
    {
      return (c == 'a' || c == 'e' || c == 'i' || c == 'o'
              || c == 'u' || c == 'A' || c == 'E' || c == 'I'
              || c == 'O' || c == 'U');
    }
    public static void main(String[] args) {
        String input = "geeks";
        if (canSplitIntoSubstring(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
