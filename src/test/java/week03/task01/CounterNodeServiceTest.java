package week03.task01;

import org.junit.Test;
import week03.tree.Tree;
import week03.util.TreeNodeClassUtil;

import static org.junit.Assert.assertEquals;

public class CounterNodeServiceTest {

    private CounterNodeService counterNodeService = new CounterNodeService();

    @Test
    public void countNodesRecursion() {
        Tree<Integer> tree = TreeNodeClassUtil.buildIntegerTree();

        int actualForRecursion = counterNodeService.countNodesRecursion(tree);

        int expected = 4;
        assertEquals(expected, actualForRecursion);
    }

    @Test
    public void countNodesCycle() {
        Tree<Integer> tree = TreeNodeClassUtil.buildIntegerTree();

        int actualForCycle = counterNodeService.countNodesCycle(tree);

        int expected = 4;
        assertEquals(expected, actualForCycle);
    }
}