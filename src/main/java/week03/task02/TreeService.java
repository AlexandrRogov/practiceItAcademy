package week03.task02;

import week03.tree.Tree;

public class TreeService {

    public <T extends Comparable> int depthTree(Tree<T> tree) {
        return depthTree(tree.getRoot());
    }

    private <T> int depthTree(Tree.Node<T> node) {
        int result = 0;
        if (node != null) {
            result = 1 +
                    Math.max(depthTree(node.getRigthChilde()), depthTree(node.getLeftChilde()));
        }

        return result;
    }
}
