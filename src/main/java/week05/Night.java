package week05;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

import static week05.util.Util.LOCK;
import static week05.util.Util.allNightIsFinish;
import static week05.util.Util.winner;

@Log
public class Night extends Thread {

    private String winner;

    private List<Scientist> scientists = new ArrayList<>();

    private int numberOfNight;

    public Night(String name, int numberOfNight) {
        super(name);
        this.numberOfNight = numberOfNight;
    }

    @Override
    public void run() {
        Factory factory = new Factory();
        Scientist scientist1 = new Scientist("Scientist1");
        Scientist scientist2 = new Scientist("Scientist2");

        factory.start();
        scientist1.start();
        scientist2.start();

        for (int i = 1; i <= numberOfNight; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == numberOfNight) {
                allNightIsFinish = true;
            }

            synchronized (LOCK) {
                LOCK.notifyAll();
            }
        }

        scientists.add(scientist1);
        scientists.add(scientist2);

        winner = winner(scientist1, scientist2);
    }

    public void printScientists() {
        for (Scientist a : scientists) {
            log.info(a.getName());
            log.info("Count Robots: " + a.countRobots());
            log.info(a.getDetailsRobot().toString());
        }
        log.info("Winner: " + winner);
    }

    public String getWinner() {
        return winner;
    }
}
