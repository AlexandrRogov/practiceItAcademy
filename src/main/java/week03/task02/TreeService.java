package week03.task02;

import week03.tree.Tree;

public class TreeService {

    public int depthTree(Tree tree) {
        return depthTree(tree.getRoot());
    }

    private int depthTree(Tree.Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 +
                    Math.max(depthTree(node.getRigthChilde()), depthTree(node.getLeftChilde()));
        }
    }
}
