package com.string;
import java.util.*;

public class HierarchicalGraph {
    public static void main(String[] args) {
        int[][] nodes = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 4, 6, 8, 10, 12, 14, -1, -1, -1},
                {1, 2, 3, 4, 5, 7, -1, -1, -1, -1},
                {1, 2, 3, -1, -1, -1, -1, -1, -1, -1},
                {4, 5, 6, -1, -1, -1, -1, -1, -1, -1},
                {2, 4, 6, -1, -1, -1, -1, -1, -1, -1},
                {2, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < nodes.length; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < nodes.length; i++) {
            for (int j = 0; j < nodes.length; j++) {
                if (i != j && isProperSubset(nodes[i], nodes[j])) {
                    boolean isChildOfOther = false;
                    for (int k = 0; k < nodes.length; k++) {
                        if (k != i && k != j && isProperSubset(nodes[i], nodes[k]) && isProperSubset(nodes[k], nodes[j])) {
                            isChildOfOther = true;
                            break;
                        }
                    }
                    if (!isChildOfOther) {
                        graph.get(i).add(j);
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (List<Integer> children : graph) {
            Collections.sort(children);
            for (int child : children) {
                result.append(child).append(" ");
            }
            result.append("-1, ");
        }

        System.out.println(result.toString());
    }

    private static boolean isProperSubset(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            if (num != -1) {
                set1.add(num);
            }
        }

        for (int num : arr2) {
            if (num != -1) {
                set2.add(num);
            }
        }

        return set2.containsAll(set1) && !set1.containsAll(set2);
    }
}