package week03.task03;

import week03.tree.Tree;

public class StringNodesService {

    public String concatenateNodeToStringCLR(Tree tree) {
        StringBuilder string = new StringBuilder();
        return concatenateNodeToStringCLR(tree.getRoot(), string).toString();
    }

    private StringBuilder concatenateNodeToStringCLR(Tree.Node node, StringBuilder string) {
        if (node == null) {
            return string;
        }
        string.append(node.getData());
        concatenateNodeToStringCLR(node.getLeftChilde(), string);
        concatenateNodeToStringCLR(node.getRigthChilde(), string);
        return string;
    }

    public String concatenateNodeToStringLCR(Tree tree) {
        StringBuilder string = new StringBuilder();
        return concatenateNodeToStringLCR(tree.getRoot(), string).toString();
    }

    private StringBuilder concatenateNodeToStringLCR(Tree.Node node, StringBuilder string) {
        if (node == null) {
            return string;
        }
        concatenateNodeToStringLCR(node.getLeftChilde(), string);
        string.append(node.getData());
        concatenateNodeToStringLCR(node.getRigthChilde(), string);
        return string;
    }

    public String concatenateNodeToStringLRC(Tree tree) {
        StringBuilder string = new StringBuilder();
        return concatenateNodeToStringLRC(tree.getRoot(), string).toString();
    }

    private StringBuilder concatenateNodeToStringLRC(Tree.Node node, StringBuilder string) {
        if (node == null) {
            return string;
        }
        concatenateNodeToStringLRC(node.getLeftChilde(), string);
        concatenateNodeToStringLRC(node.getRigthChilde(), string);
        string.append(node.getData());
        return string;
    }
}
