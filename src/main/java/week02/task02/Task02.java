package week02.task02;

import java.util.*;
import java.util.stream.Collectors;

public class Task02 {

    private static String sortString(String string) {
        return string.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public List<List<String>> sortAnagram(String[] array) {
        Map<String, List<String>> mapAnagram = new LinkedHashMap<>(array.length);
        for (String s : array) {
            String sortedString = sortString(s);
            List<String> listAnagramString = new ArrayList<>();
            if (mapAnagram.containsKey(sortedString)) {
                listAnagramString = mapAnagram.get(sortedString);
                listAnagramString.add(s);
                mapAnagram.put(sortedString, listAnagramString);
            } else {
                listAnagramString.add(s);
                mapAnagram.put(sortedString, listAnagramString);
            }
        }

        List<List<String>> result = new ArrayList<>(mapAnagram.size());
        for (Map.Entry<String, List<String>> stringListEntry : mapAnagram.entrySet()) {
            List<String> valueMap = new ArrayList<>(stringListEntry.getValue());
            Collections.sort(valueMap);
            result.add(valueMap);
        }

        return result;
    }

    public List<List<String>> sortAnagramWithStream(String[] strings) {
        LinkedHashMap<String, List<String>> mapAnagram = Arrays.stream(strings)
                .collect(Collectors.groupingBy(Task02::sortString, LinkedHashMap::new, Collectors.toList()));

        return new ArrayList<>(mapAnagram.values());
    }
}
