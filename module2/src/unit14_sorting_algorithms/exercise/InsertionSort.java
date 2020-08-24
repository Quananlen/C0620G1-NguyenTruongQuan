package unit14_sorting_algorithms.exercise;

import java.util.ArrayList;

public class InsertionSort {
    public static void insertionSort(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int selectedNum = arr.get(i);
            System.out.println("key " + selectedNum);
            int currentMaxIndex = i - 1;
            while (currentMaxIndex > -1) {
                int comparedNum = arr.get(currentMaxIndex);
                if (selectedNum < comparedNum) {
                    System.out.println(selectedNum + " < " + comparedNum);
                    currentMaxIndex--;
                } else {
                    System.out.println(selectedNum + " > " + comparedNum);
                    System.out.println("Move " + selectedNum + " to position after " + comparedNum);
                    break;
                }
            }
            if (currentMaxIndex == -1) System.out.println("Move " + selectedNum + " to first position");
            arr.add(currentMaxIndex + 1, selectedNum);
            arr.remove(i + 1);
            System.out.println(arr);
        }
    }
}

