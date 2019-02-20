package week01.task03;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class UtileTest {

    @Test
    public void createCashier() {

        Set cashiers = Utile.createCashier(2);

        assertEquals("don't work", cashiers.toString(), "[CashierImp(id=1, name=null, " +
                "serviceTimeCustomers=0), CashierImp(id=0, name=null, serviceTimeCustomers=0)]");


    }
}