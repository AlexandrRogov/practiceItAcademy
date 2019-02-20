package week01.task02;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task01_2Test {

    @Test
    public void recount() {

        List list = Arrays.asList(25, 50);

        Task01_2 task01_2 = new Task01_2();

        assertEquals("don't work", task01_2.recount(Utile.createCustomers(list)), true);

    }
}