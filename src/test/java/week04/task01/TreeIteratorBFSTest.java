package week04.task01;


import org.junit.Test;
import week03.tree.Tree;
import week04.utile.TreeNodeClassUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TreeIteratorBFSTest {

    @Test
    public void testIteratorPreOrder() {
        List actual = Arrays.asList(4, 2, 1, 6, 5, 8);

        Tree<Integer> tree = TreeNodeClassUtil.buildTreeInteger();
        Iterator<Integer> iterator = TreeIteratorPreOrder.iterator(tree);

        List<Integer> expected = new ArrayList<>();
        while (iterator.hasNext()) {
            expected.add(iterator.next());
        }

        assertEquals(expected, actual);
    }

    @Test
    public void testIteratorBFS() {
        List actual = Arrays.asList(4, 2, 6, 1, 5, 8);

        Tree<Integer> tree = TreeNodeClassUtil.buildTreeInteger();
        Iterator<Integer> iterator = TreeIteratorBFS.iterator(tree);

        List<Integer> expected = new ArrayList<>();
        while (iterator.hasNext()) {
            expected.add(iterator.next());
        }

        assertEquals(expected, actual);
    }
}