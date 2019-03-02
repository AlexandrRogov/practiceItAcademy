package week03.task01;

import org.junit.Test;
import week03.tree.Tree;

import static org.junit.Assert.*;

public class CounterNodeServiceTest {

    private Tree<Integer> tree = new Tree<>();
    private CounterNodeService counterNodeService = new CounterNodeService();

    @Test
    public void countNodesRecursion() {
        tree.add(1);
        tree.add(3);
        tree.add(4);
        tree.add(6);

        int actualForRecursion = counterNodeService.countNodesRecursion(tree);

        int expected = 4;
        assertEquals(expected, actualForRecursion);
    }

    @Test
    public void countNodesCycle() {
        tree.add(1);
        tree.add(3);

        int actualForCycle = counterNodeService.countNodesCycle(tree);

        int expected = 2;
        assertEquals(expected, actualForCycle);
    }
}