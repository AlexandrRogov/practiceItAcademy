package week02.task01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task01 {

    private static final String REX = "(\\{})+?|(\\[])+?|(\\(\\))+?";

    public boolean checkSymbolsString(String string) {
        if (string.length() % 2 != 0) {
            return false;
        }

        Pattern pattern = Pattern.compile(REX);
        Matcher matcher = pattern.matcher(string);
        int pairsOfSimbol = string.length() / 2;
        for (int i = 0; i < pairsOfSimbol; i++) {
            matcher = pattern.matcher(matcher.replaceAll(""));
            if (matcher.replaceAll("").equals("")) {
                return true;
            }
        }

        return false;
    }
}
