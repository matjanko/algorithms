package org.matjanko.algorithms.sorting.bubblesort;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {
    @Test
    public void sortMethodTest() {
        // given
        List<Integer> numbers = getUnsortedNumbers();
        List<Integer> expectedSortedNumbers = getSortedNumbers();

        // when
        BubbleSort.sort(numbers);

        // then
        Assert.assertEquals(numbers, expectedSortedNumbers);
    }

    @Test
    public void sortMethodTestWhenNumberListIsEmpty() {
        // given
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> expectedEmptyList = new ArrayList<>();

        // when
        BubbleSort.sort(emptyList);

        // then
        Assert.assertEquals(emptyList, expectedEmptyList);
    }

    @Test
    public void sortMethodTestWhenNumberListHasOneNumber() {
        // given
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3));
        List<Integer> expectedSortedNumbers = new ArrayList<>(Arrays.asList(3));

        // when
        BubbleSort.sort(numbers);

        // then
        Assert.assertEquals(numbers, expectedSortedNumbers);
    }

    @Test
    public void sortMethodTestWhenNumberListHasTwoNumbers() {
        // given
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2));
        List<Integer> expectedSortedNumbers = new ArrayList<>(Arrays.asList(2, 5));

        // when
        BubbleSort.sort(numbers);

        // then
        Assert.assertEquals(numbers, expectedSortedNumbers);
    }

    private List<Integer> getUnsortedNumbers() {
        return new ArrayList<Integer>(
                Arrays.asList(5, 7, 14, 21, 3, 38, 45, 2, 1, 5, 2, 14, 11, 0, -2));
    }

    private List<Integer> getSortedNumbers() {
        return new ArrayList<Integer>(
                Arrays.asList(-2, 0, 1, 2, 2, 3, 5, 5, 7, 11, 14, 14, 21, 38, 45));
    }
}
