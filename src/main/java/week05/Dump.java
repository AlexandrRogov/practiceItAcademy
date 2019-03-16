package week05;

import week05.util.Details;

import java.util.Deque;
import java.util.LinkedList;

import static week05.util.Util.LOCK;
import static week05.util.Util.createRandomDetail;
import static week05.util.Util.getRandom;

public class Dump {

    private static Deque<Details> deque = new LinkedList<>();

    static {
        for (int i = 0; i < 20; i++) {
            deque.add(createRandomDetail());
        }
    }

    public static void addDetail(Details details) {
        synchronized (LOCK) {
            deque.add(details);
        }
    }

    public static Details takeDetail() {
        Details details;

        if (getRandom(0, 1) > 0) {
            synchronized (LOCK) {
                details = deque.pollFirst();
            }
        } else {
            synchronized (LOCK) {
                details = deque.pollLast();
            }
        }

        return details;
    }
}
