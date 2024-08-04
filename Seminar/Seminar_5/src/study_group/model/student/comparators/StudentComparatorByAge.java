package study_group.model.student.comparators;

import study_group.model.study_group.ItemStudyGroup;

import java.util.Comparator;

public class StudentComparatorByAge<T extends ItemStudyGroup> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        return o1.getAge() - o2.getAge();
    }
}
