package week01.task04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Task01_4 {


    public void mergeSortList(List<Integer> list1, List<Integer> list2) {

        list1.addAll(list2);

        Collections.sort(list1);

        Optional.empty();

    }

    public void mergeSortLists(List<Integer>... lists) {

        List<Integer> newLists = new ArrayList<Integer>();

        boolean swap = false;

        for (List<Integer> list : lists) {

            newLists.addAll(list);

            if (!swap) newLists = list;

            swap = true;



        }
        Collections.sort(newLists);
    }
}
