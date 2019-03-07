package week03.task01;

import week03.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;


public class CounterNodeService {


    public <T extends Comparable> int countNodesRecursion(Tree<T> tree) {
        return countNodesRecursion(tree.getRoot());
    }

    private <T> int countNodesRecursion(Tree.Node<T> node) {
        int counter = 0;
        if (node != null) {
            counter = 1 + countNodesRecursion(node.getLeftChilde()) +
                    countNodesRecursion(node.getRigthChilde());
        }

        return counter;
    }


    public <T extends Comparable> int countNodesCycle(Tree<T> tree) {
        int counter = 0;
        Tree.Node<T> node = tree.getRoot();
        Queue<Tree.Node<T>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            counter++;
            node = queue.poll();

            if (node.getLeftChilde() != null) {
                queue.add(node.getLeftChilde());
            }

            if (node.getRigthChilde() != null) {
                queue.add(node.getRigthChilde());
            }
        }

        return counter;
    }
}
