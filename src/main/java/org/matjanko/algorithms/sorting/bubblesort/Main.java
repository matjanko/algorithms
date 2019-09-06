package org.matjanko.algorithms.sorting.bubblesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<Integer>(
                Arrays.asList(5, 7, 14, 21, 3, 38, 45, 2, 1, 5, 2, 14, 11, 0, -2));

        System.out.println("Unsorted list :" + numbers);

        BubbleSort.sort(numbers);

        System.out.println("Sorted list :" + numbers);
    }
}
