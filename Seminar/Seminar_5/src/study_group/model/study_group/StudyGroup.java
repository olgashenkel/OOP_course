package study_group.model.study_group;

import study_group.model.student.comparators.StudentComparatorByAge;
import study_group.model.student.comparators.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E extends ItemStudyGroup> implements Iterable<E> {

    private List<E> students;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(E student) {
        students.add(student);
    }

    public void sortByName() {
        students.sort(new StudentComparatorByName<>());
    }

    public void sortByAge() {
        students.sort(new StudentComparatorByAge<>());
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(students);
    }


}
