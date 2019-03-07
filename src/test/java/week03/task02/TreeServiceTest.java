package week03.task02;

import org.junit.Test;
import week03.tree.Tree;
import week03.util.TreeNodeClassUtil;

import static org.junit.Assert.assertEquals;

public class TreeServiceTest {

    private TreeService treeService = new TreeService();

    @Test
    public void depthTree() {
        Tree<Integer> tree = TreeNodeClassUtil.buildIntegerTree();

        int actual = treeService.depthTree(tree);

        int expected = 4;
        assertEquals(expected, actual);
    }
}