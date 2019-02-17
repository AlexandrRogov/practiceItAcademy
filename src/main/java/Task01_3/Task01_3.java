package Task01_3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;


@Data
public class Task01_3 {

    private List<Thread> allThreads = new ArrayList<Thread>();

    static long result;

    // bloke Deque
    static LinkedBlockingDeque<Customer> customers = new LinkedBlockingDeque<Customer>();

    public long sumServiceTimeCustomer(LinkedBlockingDeque<Customer> customers, Set<CashierImp> cashiers) {

        if (cashiers.size() != 0) {
            for (CashierImp cashier : cashiers) {
                Thread thCasier = new Thread(cashier);
                thCasier.start();
                allThreads.add(thCasier);
            }
        }

        for (Thread thread : allThreads) {
            try {
                thread.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
