package week02.task03;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task03Test {

    private Task03 task03 = new Task03();

    @Test
    public void searchForDominantElement() {
        List list = Arrays.asList(1, 2, 3, 3, 3, 5, 6, 3);
        int expected = 3;
        int actual = task03.searchForDominantElement(list);
        assertEquals(expected, actual);
    }

    @Test
    public void searchForDominantElementWithStream() {
        List list = Arrays.asList(0, 2, 0, 0, 3, 5, 6);
        int expected = 0;
        int actual = task03.searchForDominantElementWithStream(list);
        assertEquals(expected, actual);
    }
}