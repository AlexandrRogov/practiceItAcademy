package week03.task01;

import week03.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CounterNodeService {

    private int count;

    public int countNodesRecursion(Tree tree) {
        count = 0;
        return countNodesRecursion(tree.getRoot());
    }

    private int countNodesRecursion(Tree.Node node) {
        if (node == null) {
            return 0;
        } else {
            count++;
            countNodesRecursion(node.getLeftChilde());
            countNodesRecursion(node.getRigthChilde());
        }

        return count;
    }


    public int countNodesCycle(Tree tree) {
        count = 0;
        Tree.Node node = tree.getRoot();
        Queue<Tree.Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            count++;
            node = queue.poll();

            if (node.getLeftChilde() != null) {
                queue.add(node.getLeftChilde());
            }

            if (node.getRigthChilde() != null) {
                queue.add(node.getRigthChilde());
            }
        }

        return count;
    }
}
