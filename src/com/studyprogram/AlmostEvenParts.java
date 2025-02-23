package com.studyprogram;

import java.util.Arrays;

public class AlmostEvenParts {
    public static int[] splitIntoAlmostEvenParts(int n, int parts) {
        int[] result = new int[parts];
        int baseValue = n / parts;
        int remainder = n % parts;

        for (int i = 0; i < parts; i++) {
            result[i] = baseValue + (i < remainder ? 1 : 0);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int parts = 3;
        int[] result = splitIntoAlmostEvenParts(n, parts);
        System.out.println("Almost even parts: " + Arrays.toString(result));
    }
}
