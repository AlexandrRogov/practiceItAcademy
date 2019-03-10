package week04.task02;

import org.junit.Test;
import week03.tree.Tree;
import week04.task01.TreeIteratorPreOrder;
import week04.util.Course;
import week04.util.Student;
import week04.utile.TreeNodeClassUtil;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class VisitorTreIteratorPreOrederStatisticsCourseTest {

    private VisitorTreIteratorPreOrederStatisticsCourse visitor = new VisitorTreIteratorPreOrederStatisticsCourse();
    private Iterator<Student> iterator;

    @Test
    public void minMarkStudentSInCourse() {
        Tree<Student> tree = TreeNodeClassUtil.buildTreeStudents();

        iterator = new TreeIteratorPreOrderDecorator(new TreeIteratorPreOrder<>(tree));
        visitor.visitTreeIteratorPreOrder((TreeIteratorPreOrderDecorator) iterator);

        List<Student> actual = visitor.minMarkStudentSInCourse(Course.INFORMATICS);

        List<Student> expected = Arrays.asList(new Student("Olay", Course.INFORMATICS, 3));
        assertEquals(expected, actual);

    }

    @Test
    public void maxMarkStudentsInCourse() {
        Tree<Student> tree = TreeNodeClassUtil.buildTreeStudents();

        iterator = new TreeIteratorPreOrderDecorator(new TreeIteratorPreOrder<>(tree));
        visitor.visitTreeIteratorPreOrder((TreeIteratorPreOrderDecorator) iterator);

        List<Student> actual = visitor.maxMarkStudentsInCourse(Course.MATHS);

        List<Student> expected = Arrays.asList(new Student("Vitay", Course.MATHS, 4));
        assertEquals(expected, actual);
    }
}