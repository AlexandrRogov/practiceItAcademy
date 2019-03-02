package week03.task03;

import org.junit.Test;
import week03.tree.Tree;

import static org.junit.Assert.*;

public class StringNodesServiceTest {

    private Tree<String> tree = new Tree<>();
    private StringNodesService nodesService = new StringNodesService();

    @Test
    public void concatenateNodeToStringCLR() {
        tree.add("m");
        tree.add("n");
        tree.add("e");
        tree.add("h");
        tree.add("a");

        String actual = nodesService.concatenateNodeToStringCLR(tree);

        String expected = "meahn";
        assertEquals(expected, actual);
    }

    @Test
    public void concatenateNodeToStringLCR() {
        tree.add("m");
        tree.add("n");
        tree.add("e");
        tree.add("h");
        tree.add("a");

        String actual = nodesService.concatenateNodeToStringLCR(tree);

        String expected = "aehmn";
        assertEquals(expected, actual);
    }

    @Test
    public void concatenateNodeToStringLRC() {
        tree.add("m");
        tree.add("n");
        tree.add("e");
        tree.add("h");
        tree.add("a");

        String actual = nodesService.concatenateNodeToStringLRC(tree);

        String expected = "ahenm";
        assertEquals(expected, actual);
    }
}