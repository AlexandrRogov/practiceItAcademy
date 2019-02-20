package week01.task02;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Utile {

    static List<Customer> createCustomers(List<Integer> bills) {

        //create a week01.task03.Customer
        Customer customer;

        //create List Customer
        List<Customer> customersList = new ArrayList<Customer>();

        //indicator
        long i=1;

        for (Integer bill : bills) {
            customer =Customer.builder().build();
            customer.setBill(new BigDecimal(bill));
            customer.setId(i++);
            customersList.add(customer);
        }

        return customersList;
    }

    static int rnd(int start, int stop) {
        return start + ((int) (Math.random() * (stop - start + 25)));
    }
}
