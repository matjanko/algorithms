package org.matjanko.algorithms.sorting.bubblesort;

import java.util.List;

public class BubbleSort {
    public static void sort(List<Integer> list) {
        int temp;
        int iterator;

        do {
            iterator = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    iterator++;
                }
            }
        }
        while (iterator > 0);
    }
}
