package week04.task02;

import lombok.Getter;
import week04.util.Student;

import java.util.ArrayList;
import java.util.List;

@Getter
public class VisitorTreeIteratorPreOrderAverageRating implements Visitor {

    private List<Integer> list = new ArrayList<>();

    @Override
    public void visitTreeIteratorPreOrder(TreeIteratorPreOrderDecorator treeIterator) {
        while (treeIterator.hasNext()) {
            Student student = treeIterator.next();
            list.add(student.getMark());
        }
    }

    public double average() {

        return list.stream()
                .mapToInt(a -> a)
                .average()
                .orElse(0);
    }
}
