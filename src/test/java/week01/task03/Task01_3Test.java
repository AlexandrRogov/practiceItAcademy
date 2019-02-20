package week01.task03;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Task01_3Test {

    @Test
    public void addtoQueque() {
        // create a Customer
        Customer customer = Customer.builder().build();
        customer.setId(1);

        //add the Customer in Queque
        Task01_3.customers.add(customer);
        assertEquals("don't work", Task01_3.customers.contains(customer), true);
    }

    @Test
    public void takeCustomerFromQueque() {
        // create a Customer
        Customer customer = Customer.builder().build();
        customer.setId(2);

        //add the Customer in Queque
        Task01_3.customers.addFirst(customer);
        assertEquals("don't work", Task01_3.customers.contains(customer), true);
    }

    @Test
    public void sumServiceTimeCustomer() {

        //create some Customer
        List list = Arrays.asList(2,1,3,1);
        Utile.createCustomer(list);

        //create some Cashier
        Set cashiers = Utile.createCashier(2);

        Task01_3 task01_3 = new Task01_3();
        assertEquals("don't work",task01_3.sumServiceTimeCustomer(Task01_3.customers,cashiers),7);
    }


}