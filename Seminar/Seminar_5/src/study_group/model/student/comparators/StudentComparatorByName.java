package study_group.model.student.comparators;

import study_group.model.study_group.ItemStudyGroup;

import java.util.Comparator;

public class StudentComparatorByName<T extends ItemStudyGroup> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
