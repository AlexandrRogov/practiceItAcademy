package week03.task03;

import week03.tree.Tree;

public class StringNodesService {

    public String concatenateNodeToStringPreOrder(Tree<Character> tree) {
        StringBuilder string = new StringBuilder();
        return concatenateNodeToStringPreOrder(tree.getRoot(), string).toString();
    }

    private StringBuilder concatenateNodeToStringPreOrder(Tree.Node<Character> node, StringBuilder string) {
        if (node != null) {
            string.append(node.getData());
            concatenateNodeToStringPreOrder(node.getLeftChilde(), string);
            concatenateNodeToStringPreOrder(node.getRigthChilde(), string);
        }

        return string;
    }

    public String concatenateNodeToStringInOrder(Tree<Character> tree) {
        StringBuilder string = new StringBuilder();
        return concatenateNodeToStringInOrder(tree.getRoot(), string).toString();
    }

    private StringBuilder concatenateNodeToStringInOrder(Tree.Node<Character> node, StringBuilder string) {
        if (node == null) {
            return string;
        }
        concatenateNodeToStringInOrder(node.getLeftChilde(), string);
        string.append(node.getData());
        concatenateNodeToStringInOrder(node.getRigthChilde(), string);
        return string;
    }

    public String concatenateNodeToStringPostOrder(Tree<Character> tree) {
        StringBuilder string = new StringBuilder();
        return concatenateNodeToStringPostOrder(tree.getRoot(), string).toString();
    }

    private StringBuilder concatenateNodeToStringPostOrder(Tree.Node<Character> node, StringBuilder string) {
        if (node == null) {
            return string;
        }
        concatenateNodeToStringPostOrder(node.getLeftChilde(), string);
        concatenateNodeToStringPostOrder(node.getRigthChilde(), string);
        string.append(node.getData());
        return string;
    }
}
