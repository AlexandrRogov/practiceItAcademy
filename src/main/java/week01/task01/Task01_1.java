package week01.task01;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task01_1 {

    String stringNumberVar01(List<Integer> list) {

        // check list size
        if (list.size() != 10) return null;
        StringBuilder result = new StringBuilder("(");

        int count = 0;

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (count == 3) result.append(") ");
            if (count == 6) result.append("-");
            int next = iterator.next();
            // check  phone number
            if (next > 9 || next < 0) return null;
            result.append(next);
            if (count == 9) result.append(".");
            count++;
        }
        return new String(result);
    }

    String stringNumberVar02(Collection<Integer> list) {

        String reg = "\\d{1}";

        // check list size
        if (list.size() != 10) return null;

        String result = list.toString();
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(result);
        StringBuilder stringBuilder = new StringBuilder("(");
        String string = new String();

        while (matcher.find()) {

            if (matcher.group().length() > 1) return null;
            stringBuilder.append(matcher.group());
        }

        stringBuilder.insert(4, ")");
        stringBuilder.insert(5," ");
        stringBuilder.insert(9,"-");
        stringBuilder.insert(14,".");

        return stringBuilder.toString();
    }

}
