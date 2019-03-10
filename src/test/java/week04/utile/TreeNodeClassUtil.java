package week04.utile;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import week03.tree.Tree;
import week04.util.Course;
import week04.util.Student;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TreeNodeClassUtil {

    public static Tree<Integer> buildTreeInteger() {
        Tree<Integer> tree = new Tree<>();
        tree.add(4);
        tree.add(2);
        tree.add(6);
        tree.add(1);
        tree.add(5);
        tree.add(8);

        return tree;
    }

    public static Tree<Student> buildTreeStudents() {
        Tree<Student> tree = new Tree<>();
        tree.add(new Student("Alex", Course.INFORMATICS, 5));
        tree.add(new Student("Ivan", Course.MATHS, 3));
        tree.add(new Student("Oleg", Course.INFORMATICS, 5));
        tree.add(new Student("Vitay", Course.MATHS, 4));
        tree.add(new Student("Olay", Course.INFORMATICS, 3));
        tree.add(new Student("Ira", Course.MATHS, 5));

        return tree;
    }
}
