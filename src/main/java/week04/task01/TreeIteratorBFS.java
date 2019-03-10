package week04.task01;

import week03.tree.Tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class TreeIteratorBFS<T extends Comparable> implements Iterator<T> {

    private static volatile TreeIteratorBFS instance;
    private final Queue<Tree.Node<T>> deque = new LinkedList<>();


    private TreeIteratorBFS(Tree<T> tree) {
        deque.add(tree.getRoot());
    }

    @SuppressWarnings("unchecked")
    public static <T extends Comparable> TreeIteratorBFS iterator(Tree<T> tree) {
        if (instance == null) {
            synchronized (TreeIteratorBFS.class) {
                if (instance == null) {
                    instance = new TreeIteratorBFS(tree);
                }
            }
        }

        return instance;
    }

    @Override
    public boolean hasNext() {
        return !deque.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) throw new NoSuchElementException("No more nodes remain to iterate");

        final Tree.Node<T> node = deque.poll();

        if (node.getLeftChilde() != null) {
            deque.add(node.getLeftChilde());
        }

        if (node.getRigthChilde() != null) {
            deque.add(node.getRigthChilde());
        }
        return node.getData();
    }
}
