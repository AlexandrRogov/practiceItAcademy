package week01.task01;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task01_1Test {

    @Test
    public void stringNumberVar01() {

        List list = Arrays.asList(0,1, 2, 3, 4, 8, 6, 7, 8, 9);
        Task01_1 task01_1 = new Task01_1();
       assertEquals("don't work",task01_1.stringNumberVar01(list),"(012) 348-6789.");
    }

    @Test
    public void stringNumberVar02() {
        List list = Arrays.asList(0,1, 2, 3, 4, 8, 6, 7, 8, 9);
        Task01_1 task01_1 = new Task01_1();
        assertEquals("don't work",task01_1.stringNumberVar02(list),"(012) 348-6789.");
    }
}