package Task01_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utile {

    static void createCustomer(List<Integer> list) {

        Customer customer;
        //create List Goods
        List<Good> goods;

        for (int i = 0; i < list.size(); i++) {
            goods = new ArrayList<Good>();
            customer = Customer.builder().build();
            customer.setId(i);
            // create  Goods for the Task01_3.Customer
            for (int j = 1; j <= list.get(i); j++) {
                goods.add(Good.builder().build());
            }
            customer.setGoods(goods);
            //add the Task01_3.Customer in Queque
            try {
                Task01_3.customers.putLast(customer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static Set<CashierImp> createCashier(int number) {
        Set<CashierImp> cashierImps = new HashSet<CashierImp>();

        CashierImp cashierImp;

        for (int i = 0; i < number; i++) {
            cashierImp = CashierImp.builder().build();
            cashierImp.setId(i);
            cashierImps.add(cashierImp);
        }
        return cashierImps;
    }

}
