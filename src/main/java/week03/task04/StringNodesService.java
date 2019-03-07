package week03.task04;

import week03.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class StringNodesService {

    public <T extends Comparable> String concatenateNodeToString(Tree<T> tree) {
        StringBuilder string = new StringBuilder();
        Tree.Node<T> node = tree.getRoot();
        Queue<Tree.Node<T>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.poll();
            string.append(node.getData());
            if (node.getLeftChilde() != null) {
                queue.add(node.getLeftChilde());
            }

            if (node.getRigthChilde() != null) {
                queue.add(node.getRigthChilde());
            }
        }

        return string.toString();
    }


}
