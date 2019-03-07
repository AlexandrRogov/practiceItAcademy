package week03.task03;

import org.junit.Test;
import week03.tree.Tree;
import week03.util.TreeNodeClassUtil;

import static org.junit.Assert.assertEquals;

public class StringNodesServiceTest {

    private StringNodesService nodesService = new StringNodesService();

    @Test
    public void concatenateNodeToStringCLR() {
        Tree<Character> tree = TreeNodeClassUtil.buildCharacterTree();

        String actual = nodesService.concatenateNodeToStringPreOrder(tree);

        String expected = "meahn";
        assertEquals(expected, actual);
    }

    @Test
    public void concatenateNodeToStringLCR() {
        Tree<Character> tree = TreeNodeClassUtil.buildCharacterTree();

        String actual = nodesService.concatenateNodeToStringInOrder(tree);

        String expected = "aehmn";
        assertEquals(expected, actual);
    }

    @Test
    public void concatenateNodeToStringLRC() {
        Tree<Character> tree = TreeNodeClassUtil.buildCharacterTree();

        String actual = nodesService.concatenateNodeToStringPostOrder(tree);

        String expected = "ahenm";
        assertEquals(expected, actual);
    }
}