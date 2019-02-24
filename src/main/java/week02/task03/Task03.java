package week02.task03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Task03 {

    public int searchForDominantElement(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int lengthArray = list.size();
        int index = 0;
        for (Integer aList : list) {
            Integer identicalNumbers = map.get(aList);
            if (identicalNumbers == null) {
                identicalNumbers = 0;
            }

            map.put(aList, ++identicalNumbers);

            if (identicalNumbers >= lengthArray / 2) {
                index = aList;
                break;
            }
        }

        return index;
    }

    public Integer searchForDominantElementWithStream(List<Integer> list) {
        int listSize = list.size();
        Optional<Integer> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p -> p.getValue() >= (listSize / 2))
                .map(Map.Entry::getKey).findFirst();

        return result.get();
    }

}
