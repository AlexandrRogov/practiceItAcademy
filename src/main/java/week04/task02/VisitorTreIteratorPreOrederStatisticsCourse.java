package week04.task02;

import week04.util.Course;
import week04.util.Student;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VisitorTreIteratorPreOrederStatisticsCourse implements Visitor {

    private Map<Course, Map<Integer, List<Student>>> map = new LinkedHashMap<>();

    @Override
    public void visitTreeIteratorPreOrder(TreeIteratorPreOrderDecorator treeIterator) {
        List<Student> list = new ArrayList<>();
        while (treeIterator.hasNext()) {
            Student student = treeIterator.next();
            list.add(student);
        }

        map = list.stream().collect(Collectors.groupingBy(Student::getCourse, Collectors.groupingBy(Student::getMark)));
    }

    public List<Student> minMarkStudentSInCourse(Course course) {
        List<Student> students = map.get(course).entrySet().iterator().next().getValue();

        return students;
    }

    public List<Student> maxMarkStudentsInCourse(Course course) {
        List<Student> students = (List<Student>) map.get(course).values().toArray()[map.size() - 1];

        return students;
    }
}
