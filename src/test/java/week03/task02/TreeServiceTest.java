package week03.task02;

import org.junit.Test;
import week03.tree.Tree;

import static org.junit.Assert.*;

public class TreeServiceTest {

    private Tree<Integer> tree = new Tree<>();
    private TreeService treeService = new TreeService();

    @Test
    public void depthTree() {
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(7);

        int actual = treeService.depthTree(tree);

        int expected = 3;
        assertEquals(expected, actual);
    }
}