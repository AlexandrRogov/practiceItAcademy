package week02.task02;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task02Test {

    private Task02 task02 = new Task02();

    @Test
    public void sortAnagram() {
        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List expected = Arrays.asList(Arrays.asList("ate", "eat", "tea"), Arrays.asList("nat", "tan"), Arrays.asList("bat"));
        List actual = task02.sortAnagram(array);
        assertEquals(expected, actual);
    }

    @Test
    public void sortAnagramSecond() {
        String[] array = {"bca", "qwer", "cab", "werq", "cba", "tyurr"};
        List expected = Arrays.asList(Arrays.asList("bca", "cab", "cba"), Arrays.asList("qwer", "werq"), Arrays.asList("tyurr"));
        List actual = task02.sortAnagramWithStream(array);
        assertEquals(expected, actual);
    }

}