package main.VW1.BubbleSort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {
    
    @Test
    public void TestBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();

        AssertionError ae = null;
        try { assert false; }
        catch (AssertionError exception) { ae = exception; }
        if (ae == null) System.out.println("WARNING: Turn assertions on, call \"jshell -R-ea\"");

        assert Arrays.equals(new int[]{}, bubbleSort.bubblesort());
        assert Arrays.equals(new int[]{}, bubbleSort.bubblesort());
        assert Arrays.equals(new int[]{3}, bubbleSort.bubblesort(3));
        assert Arrays.equals(new int[]{3, 5}, bubbleSort.bubblesort(3, 5));
        assert Arrays.equals(new int[]{3, 5}, bubbleSort.bubblesort(5, 3));
        assert Arrays.equals(new int[]{3, 3}, bubbleSort.bubblesort(3, 3));
        assert Arrays.equals(new int[]{1, 2, 3}, bubbleSort.bubblesort(1, 2, 3));
        assert Arrays.equals(new int[]{1, 2, 3}, bubbleSort.bubblesort(1, 3, 2));
        assert Arrays.equals(new int[]{1, 2, 3}, bubbleSort.bubblesort(2, 1, 3));
        assert Arrays.equals(new int[]{1, 2, 3}, bubbleSort.bubblesort(2, 3, 1));
        assert Arrays.equals(new int[]{1, 2, 3}, bubbleSort.bubblesort(3, 1, 2));
        assert Arrays.equals(new int[]{1, 2, 3}, bubbleSort.bubblesort(3, 2, 1));

        assert bubbleSortTest(bubbleSort, new int[]{4, 3, 7, 1, 5, 2});
        assert bubbleSortTest(bubbleSort, generateRandomNumbers(20));
    }
    
    boolean bubbleSortTest(BubbleSort bs, int[] numbers) {
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbersCopy);
        bs.bubblesort(numbers);
        return Arrays.equals(numbersCopy, numbers);
    }

    int[] generateRandomNumbers(int n) {
        int[] randomNumbers = new int[n];
        for (int i = 0; i < randomNumbers.length; i++)
            randomNumbers[i] = new Random().nextInt(100);
        return randomNumbers;
    }

}
