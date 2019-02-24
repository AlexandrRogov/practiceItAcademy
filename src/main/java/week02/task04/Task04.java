package week02.task04;

import java.util.function.LongPredicate;
import java.util.stream.LongStream;

public class Task04 {

    public long[] sortOddNumbers(long[] array) {
        LongPredicate predicate = (n) -> n % 2 != 0;
        long[] sortedOdd = LongStream.of(array).filter(predicate).sorted().toArray();
        long[] sortedArray = new long[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            sortedArray[i] = predicate.test(array[i]) ? sortedOdd[j++] : array[i];
        }

        return sortedArray;
    }
}
