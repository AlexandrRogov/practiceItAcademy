package week03.tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Tree<T extends Comparable> {

    private Node<T> root;

    @AllArgsConstructor
    @Getter
    @NoArgsConstructor
    public static class Node<T> {

        private T data;
        private Node<T> leftChilde;
        private Node<T> rigthChilde;

        private Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        root = add(root, data);
    }

    private Node<T> add(Node<T> node, T data) {
        if (isEmpty(node)) {
            return new Tree.Node<>(data);
        }

        if (data.compareTo(node.data) >= 0) {
            node.rigthChilde = add(node.rigthChilde, data);
        } else {
            node.leftChilde = add(node.leftChilde, data);
        }

        return node;
    }

    private boolean isEmpty(Node<T> node) {
        return node == null;
    }

}
