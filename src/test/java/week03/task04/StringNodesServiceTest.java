package week03.task04;

import org.junit.Test;
import week03.tree.Tree;

import static org.junit.Assert.*;

public class StringNodesServiceTest {
    private Tree<String> tree = new Tree<>();
    private StringNodesService nodesService = new StringNodesService();

    @Test
    public void concatenateNodeToString() {
        tree.add("m");
        tree.add("n");
        tree.add("e");
        tree.add("h");
        tree.add("a");

        String actual = nodesService.concatenateNodeToString(tree);

        String expected = "menah";
        assertEquals(expected, actual);
    }
}