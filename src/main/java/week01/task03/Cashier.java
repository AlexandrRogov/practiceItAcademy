package week01.task03;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cashier implements  Runnable {

    private long id;

    private String name;

    private long serviceTimeCustomers;

    private long serviceTimeCustomer(Customer customer) {
        if(customer!=null) {
            serviceTimeCustomers = serviceTimeCustomers + customer.getGoods().size();
        }
        return serviceTimeCustomers;

    }

    @Override
    public void run() {

        Customer customer = Customer.builder().build();
        customer.setId(0);
        while (customer != null) {
            customer = Task01_3.customers.poll();

            serviceTimeCustomer(customer);
        }

        Task01_3.result+=serviceTimeCustomers;

    }
}
