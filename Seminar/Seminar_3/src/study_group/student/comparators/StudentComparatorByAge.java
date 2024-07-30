package study_group.student.comparators;

import study_group.student.Student;

import java.util.Comparator;

public class StudentComparatorByAge implements Comparator<Student> {

/*
Ключевая разница между Comparable и Comparator в Java:
Comparable в Java — это объект для сравнения себя с другим объектом,
тогда как Comparator — это объект для сравнения разных объектов разных классов.

Comparable обеспечивает compareTo() метод сортировки элементов в Java,
тогда как Comparator предоставляет compare() метод сортировки элементов в Java.

Сопоставимый интерфейс присутствует в java.lang пакете,
тогда как интерфейс Comparator присутствует в java.util пакет.

Comparable предоставляет одну последовательность сортировки,
а Comparator предоставляет несколько последовательностей сортировки.

Comparable влияет на исходный класс, тогда как Comparator не влияет на исходный класс.
 */

    @Override
    public int compare(Student o1, Student o2) {
        // метод для сравнения возраста студентов
        return o1.getAge() - o2.getAge();
    }
}
