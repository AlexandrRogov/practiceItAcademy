package week04.task02;

import java.util.Iterator;

public abstract class IteratorDecorator<T> implements Iterator<T> {

    private Iterator<T> iterator;

    IteratorDecorator(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return iterator.next();
    }

    abstract void accept(Visitor visitor);
}
