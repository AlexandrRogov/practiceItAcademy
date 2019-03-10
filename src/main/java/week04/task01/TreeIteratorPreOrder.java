package week04.task01;

import week03.tree.Tree;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public final class TreeIteratorPreOrder<T extends Comparable> implements Iterator<T> {

    private static volatile TreeIteratorPreOrder instance;
    private final Stack<Tree.Node<T>> stack;

    public TreeIteratorPreOrder(Tree<T> tree) {
        stack = new Stack<>();
        stack.add(tree.getRoot());
    }


    public static <T extends Comparable> TreeIteratorPreOrder iterator(Tree<T> tree) {
        if (instance == null) {
            synchronized (TreeIteratorPreOrder.class) {
                if (instance == null) {
                    instance = new TreeIteratorPreOrder(tree);
                }
            }
        }

        return instance;
    }

    @Override
    public boolean hasNext() {
        return !stack.empty();
    }

    @Override
    public T next() {
        if (!hasNext()) throw new NoSuchElementException("No more nodes remain to iterate");

        final Tree.Node<T> node = stack.pop();

        if (node.getRigthChilde() != null) {
            stack.push(node.getRigthChilde());
        }

        if (node.getLeftChilde() != null) {
            stack.push(node.getLeftChilde());
        }

        return node.getData();
    }
}