package week04.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {

    private String name;
    private Course course;
    private Integer mark;


    @Override
    public int compareTo(Student o) {
        return Comparator.comparing(Student::getName)
                .thenComparing(Student::getCourse)
                .thenComparing(Student::getMark)
                .compare(this, o);
    }
}
