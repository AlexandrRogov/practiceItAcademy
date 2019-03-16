package week05;

import lombok.Getter;
import week05.util.Details;

import java.util.EnumMap;
import java.util.OptionalInt;

import static week05.util.Util.LOCK;
import static week05.util.Util.allNightIsFinish;
import static week05.util.Util.getRandom;

@Getter
public class Scientist extends Thread {

    private EnumMap<Details, Integer> detailsRobot = new EnumMap<>(Details.class);

    public Scientist(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (!allNightIsFinish) {
            for (int i = 0; i < getRandom(1, 4); i++) {
                addDetailInMap(Dump.takeDetail());
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

    private void addDetailInMap(Details detail) {
        if (detail != null) {
            detailsRobot.merge(detail, 1, (a, b) -> a + b);
        }
    }

    public int countRobots() {
        int result;
        if (detailsRobot.size() < 9) {
            result = 0;
        } else {
            OptionalInt min = detailsRobot.entrySet().stream().mapToInt(EnumMap.Entry::getValue).min();
            result = min.orElse(0);
        }

        return result;
    }
}
