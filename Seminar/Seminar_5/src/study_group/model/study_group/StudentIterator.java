package study_group.model.study_group;

import java.util.Iterator;
import java.util.List;

public class StudentIterator<T> implements Iterator<T> {

    private int currentId;
    private List<T> students;

    public StudentIterator(List<T> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() { // метод hasNext() проверяет есть ли следующий объект
        return students.size() > currentId;
    }

    @Override
    public T next() { // метод next() возвращает следующий объект
        return students.get(currentId++);
    }
}
