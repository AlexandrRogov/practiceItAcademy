package week04.task02;

import lombok.Data;
import week04.util.Student;

import java.util.Iterator;

@Data
public class TreeIteratorPreOrderDecorator extends IteratorDecorator<Student> {

    TreeIteratorPreOrderDecorator(Iterator<Student> iterator) {
        super(iterator);
    }

    @Override
    public boolean hasNext() {
        return super.hasNext();
    }

    @Override
    public Student next() {
        return super.next();
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitTreeIteratorPreOrder(this);
    }


}
