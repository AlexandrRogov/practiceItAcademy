package week01.task04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task01_4Test {

    @Test
    public void mergeSortList() {
        List list1 = new ArrayList(Arrays.asList(1, 2, 3, 4));
        List list2 = Arrays.asList(5, 6, 7, 8, 9);
        Task01_4 task01_4 = new Task01_4();
        task01_4.mergeSortList(list1, list2);
        assertEquals("don't work", list1.toString(), "[1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }

    @Test
    public void mergeSortLists() {
        List list1 = new ArrayList(Arrays.asList(1, 2));
        List list2 = Arrays.asList(4, 6, 8);
        List list3 = Arrays.asList(2, 3, 7);
        Task01_4 task01_4 = new Task01_4();
        task01_4.mergeSortLists(list1,list2,list3);
        assertEquals("don't work",list1.toString(),"[1, 2, 2, 3, 4, 6, 7, 8]");

    }
}