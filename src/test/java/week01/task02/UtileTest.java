package week01.task02;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UtileTest {

    @Test
    public void createCustomers() {

        List list = Arrays.asList(1,3,4,5,6);

        assertEquals("don't work",Utile.createCustomers(list).toString(),"[Customer(id=1, bill=1), " +
                "Customer(id=2, bill=3), Customer(id=3, bill=4), Customer(id=4, bill=5), Customer(id=5, bill=6)]");
    }


}