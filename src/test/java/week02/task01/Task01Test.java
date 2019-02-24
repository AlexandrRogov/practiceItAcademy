package week02.task01;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task01Test {

    private Task01 task01 = new Task01();

    @Test
    public void checkSymbolsString() {
        String string = "{}(){[{[]}]}";
        boolean actualResult = task01.checkSymbolsString(string);
        assertTrue(actualResult);
    }

    @Test
    public void checkSymbolsStringSequence() {
        String string = "{}(){}[]";
        boolean actualResult = task01.checkSymbolsString(string);
        assertTrue(actualResult);
    }

    @Test
    public void checkSymbolsStringWrongSequence() {
        String string = "{}(){}[{]}";
        boolean actualResult = task01.checkSymbolsString(string);
        assertFalse(actualResult);
    }

    @Test
    public void checkSymbolsStringEmpty() {
        String string = "";
        boolean actualResult = task01.checkSymbolsString(string);
        assertFalse(actualResult);
    }
}