package week05;

import static week05.util.Util.LOCK;
import static week05.util.Util.allNightIsFinish;
import static week05.util.Util.createRandomDetail;
import static week05.util.Util.getRandom;

public class Factory extends Thread {

    @Override
    public void run() {
        while (!allNightIsFinish) {
            for (int i = 0; i < getRandom(1, 4); i++) {
                Dump.addDetail(createRandomDetail());
            }

            synchronized (LOCK) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
