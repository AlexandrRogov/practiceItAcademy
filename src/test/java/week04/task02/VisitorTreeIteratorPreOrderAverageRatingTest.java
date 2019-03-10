package week04.task02;

import org.junit.Test;
import week03.tree.Tree;
import week04.task01.TreeIteratorPreOrder;
import week04.util.Student;
import week04.utile.TreeNodeClassUtil;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VisitorTreeIteratorPreOrderAverageRatingTest {

    private Iterator<Student> iterator;
    private VisitorTreeIteratorPreOrderAverageRating visitor = new VisitorTreeIteratorPreOrderAverageRating();

    @Test
    public void average() {
        Tree<Student> tree = TreeNodeClassUtil.buildTreeStudents();

        iterator = new TreeIteratorPreOrderDecorator(new TreeIteratorPreOrder<>(tree));
        visitor.visitTreeIteratorPreOrder((TreeIteratorPreOrderDecorator) iterator);

        double actuale = visitor.avarenge();

        double expected = 4.17;
        assertEquals(expected, actuale, 0.02);

    }

    @Test
    public void getList() {
        List expected = Arrays.asList(5, 3, 5, 5, 3, 4);

        Tree<Student> tree = TreeNodeClassUtil.buildTreeStudents();

        iterator = new TreeIteratorPreOrderDecorator(new TreeIteratorPreOrder<>(tree));
        visitor.visitTreeIteratorPreOrder((TreeIteratorPreOrderDecorator) iterator);

        List actual = visitor.getList();
        assertEquals(expected, actual);

    }
}