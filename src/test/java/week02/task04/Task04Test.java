package week02.task04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task04Test {

    private Task04 task04 = new Task04();

    @Test
    public void sortOddNumbers() {
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        long[] actualArray = task04.sortOddNumbers(array);
        final long[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void sortOddNumbersSecond() {
        long[] array = {5, 4, 1, 4, 5, 2, 3, 0, 7};
        long[] actualArray = task04.sortOddNumbers(array);
        final long[] expectedArray = {1, 4, 3, 4, 5, 2, 5, 0, 7};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void sortOddNumbersThird() {
        long[] array = {0, 0, 5, 3, 2, 2, 4, 1, 1};
        long[] actualArray = task04.sortOddNumbers(array);
        final long[] expectedArray = {0, 0, 1, 1, 2, 2, 4, 3, 5};
        assertArrayEquals(expectedArray, actualArray);
    }
}