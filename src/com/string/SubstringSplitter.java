package com.string;

public class SubstringSplitter {
    public static boolean canSplitIntoSubstring(String s) {
        int n = s.length();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String substring1 = s.substring(0, i);
                String substring2 = s.substring(i, j);
                String substring3 = s.substring(j);

                if ((substring1.contains(substring2) && substring1.contains(substring3))
                		|| (substring2.contains(substring1) && substring2.contains(substring3))||
                		(substring3.contains(substring2) && substring3.contains(substring1))){
                    System.out.println(substring1+"  " +substring2+"  " +substring3);
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String input = "geekseekforgeeks";
        if (canSplitIntoSubstring(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
