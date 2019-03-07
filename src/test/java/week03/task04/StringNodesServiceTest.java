package week03.task04;

import org.junit.Test;
import week03.tree.Tree;
import week03.util.TreeNodeClassUtil;

import static org.junit.Assert.assertEquals;

public class StringNodesServiceTest {

    private StringNodesService nodesService = new StringNodesService();

    @Test
    public void concatenateNodeToString() {
        Tree<Character> tree = TreeNodeClassUtil.buildCharacterTree();

        String actual = nodesService.concatenateNodeToString(tree);

        String expected = "menah";
        assertEquals(expected, actual);
    }
}