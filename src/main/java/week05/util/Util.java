package week05.util;

import week05.Scientist;

import java.util.Random;

public class Util {

    public static final Object LOCK = new Object();

    public static volatile boolean allNightIsFinish;

    private static Random random = new Random();

    public static int getRandom(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static String winner(Scientist scientist1, Scientist scientist2) {
        String finish;
        if (scientist1 == scientist2) {
            finish = "Dead heat";
        } else {
            finish = scientist1.countRobots() > scientist2.countRobots() ? scientist1.getName() : scientist2.getName();
        }

        return finish;
    }

    public static Details createRandomDetail() {
        return Details.values()[Util.getRandom(0, 8)];
    }
}
