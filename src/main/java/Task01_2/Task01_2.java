package Task01_2;

import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Task01_2 {

    private static Map<BigDecimal, Integer> quantityBills = new Hashtable<BigDecimal, Integer>();

    boolean recount(List<Customer> customers) {

        BigDecimal bigDec25 = new BigDecimal(25);
        BigDecimal bigDec50 = new BigDecimal(50);
        BigDecimal bigDec100 = new BigDecimal(100);


        for (Customer customer : customers) {

            if (customer == null) return false;
            // check bill 25
            if (customer.getBill().equals(bigDec25)) {
                if (quantityBills.get(bigDec25) == null) {
                    quantityBills.put(customer.getBill(), 1);
                }
                quantityBills.put(customer.getBill(), (quantityBills.get(customer.getBill()) + 1));
            }

            //check bill 50
            if (customer.getBill().equals(bigDec50)) {
                if (quantityBills.get(bigDec25) == null || quantityBills.get(bigDec25) == 0) {
                    return false;
                }
                if (quantityBills.get(customer.getBill()) == null) {
                    quantityBills.put(customer.getBill(), 1);
                }
                quantityBills.put(customer.getBill(), (quantityBills.get(customer.getBill()) + 1));
                quantityBills.put(bigDec25, quantityBills.get(bigDec25) - 1);
            }

            //check bill 100
            if (customer.getBill().equals(bigDec100)) {
                if ((quantityBills.get(bigDec50) == null || quantityBills.get(bigDec50) == 0) && (quantityBills.get(bigDec25) == null || quantityBills.get(bigDec25) < 3)) {
                    return false;
                }
                if ((quantityBills.get(bigDec50) == null || quantityBills.get(bigDec50) < 1) && (quantityBills.get(bigDec25) == null || quantityBills.get(bigDec25) < 2)) {
                    return false;
                }

                if (quantityBills.get(bigDec100) == null) {
                    quantityBills.put(bigDec100, 1);
                } else {
                    quantityBills.put(bigDec100, quantityBills.get(bigDec100) + 1);
                }
                if (quantityBills.get(bigDec50) > 1) {
                    quantityBills.put(bigDec50, quantityBills.get(bigDec50) - 1);
                    quantityBills.put(bigDec25, quantityBills.get(bigDec25) - 2);
                } else {
                    quantityBills.put(bigDec25, quantityBills.get(bigDec25) - 3);
                }
            }
        }


        return true;
    }
}
