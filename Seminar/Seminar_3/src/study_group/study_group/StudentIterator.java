package study_group.study_group;

import study_group.student.Student;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {

    private int currentId;
    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() { // метод hasNext() проверяет есть ли следующий объект
        return students.size() > currentId;
    }

    @Override
    public Student next() { // метод next() возвращает следующий объект
        return students.get(currentId++);
    }
}
