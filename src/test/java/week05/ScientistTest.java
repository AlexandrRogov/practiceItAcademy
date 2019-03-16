package week05;

import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;

@Log
public class ScientistTest {

    private Night night = new Night("Night", 100);

    @Test
    public void testWinner1() throws InterruptedException {
        night.start();
        night.join();

        night.printScientists();

        Assert.assertNotNull(night.getWinner());
    }
}