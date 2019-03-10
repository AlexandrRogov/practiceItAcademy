package week04.task02;

import week04.util.Course;
import week04.util.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisitorTreIteratorPreOrederStatisticsCourse implements Visitor {

    private Map<String, List<Student>> map = new HashMap<>();

    @Override
    public void visitTreeIteratorPreOrder(TreeIteratorPreOrderDecorator treeIterator) {
        while (treeIterator.hasNext()) {
            List<Student> list = new ArrayList<>();
            Student student = treeIterator.next();
            if (map.isEmpty()) {
                list.add(student);
                map.put(student.getName(), list);
            }

            if (map.containsKey(student.getName())) {
                list = map.get(student.getName());
                list.add(student);
                map.put(student.getName(), list);
            } else {
                list.add(student);
                map.put(student.getName(), list);
            }
        }
    }

    public Student minMarkInCourse(Course course) {
        return null;
    }
}
