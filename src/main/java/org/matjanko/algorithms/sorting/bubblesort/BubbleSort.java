package org.matjanko.algorithms.sorting.bubblesort;

import java.util.List;

public class BubbleSort {
    public static void sort(List<Integer> list) {
        int elements = list.size();
        int switches;
        int temp;

        do {
            switches = 0;
            for (int i = 0; i < elements - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    switches++;
                }
            }
            elements -= 1;
        }
        while (switches > 0);
    }
}
