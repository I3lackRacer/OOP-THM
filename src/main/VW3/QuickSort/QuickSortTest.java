package main.VW3.QuickSort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] numbers = new int[]{};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{});

        numbers = new int[]{7};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{7});

        numbers = new int[]{1, 1};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 1});

        numbers = new int[]{1, 2};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 2});

        numbers = new int[]{2, 1};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 2});

        numbers = new int[]{1, 2, 3};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 2, 3});

        numbers = new int[]{1, 3, 2};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 2, 3});

        numbers = new int[]{2, 1, 3};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 2, 3});

        numbers = new int[]{2, 3, 1};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 2, 3});

        numbers = new int[]{3, 1, 2};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 2, 3});

        numbers = new int[]{3, 2, 1};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 2, 3});

        numbers = new int[]{3, 3, 1};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 3, 3});

        numbers = new int[]{1, 3, 3};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 3, 3});

        numbers = new int[]{3, 3, 1};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{1, 3, 3});

        numbers = new int[]{5, 3, 3};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{3, 3, 5});

        numbers = new int[]{3, 3, 5};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{3, 3, 5});

        numbers = new int[]{3, 3, 3};
        QuickSort.qs(numbers, 0, numbers.length - 1);
        assert Arrays.equals(numbers, new int[]{3, 3, 3});
    }

}