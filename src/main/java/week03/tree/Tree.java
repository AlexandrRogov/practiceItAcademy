package week03.tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Tree<T extends Comparable> {
    private Node root;

    @AllArgsConstructor
    @Getter
    @NoArgsConstructor
    public static class Node<T> {
        private T data;
        private Node leftChilde;
        private Node rigthChilde;
    }

    public void add(T data) {
        root = add(root, data);
    }

    private Node add(Node node, T data) {
        if (isEmpty(node)) {
            return new Tree.Node<>(data, null, null);
        }

        if (data.compareTo(node.data) >= 0) {
            node.rigthChilde = add(node.rigthChilde, data);
        } else {
            node.leftChilde = add(node.leftChilde, data);
        }

        return node;
    }

    private boolean isEmpty(Node node) {
        return node == null;
    }

}
