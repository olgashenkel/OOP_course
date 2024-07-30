package study_group.study_group;

import study_group.student.Student;
import study_group.student.comparators.StudentComparatorByAge;
import study_group.student.comparators.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    /*
    Iterable — это интерфейс, который позволяет использовать объекты в усовершенствованном цикле "for-each".
    Метод iterator() возвращает Iterator, способный перемещаться по элементам с помощью методов hasNext() и next(),
    и, к тому же, предлагающий возможность удалять элементы с помощью метода remove().

    Основные определения и различия
Iterable: Объект, способный создавать Iterator, представляет собой последовательность элементов, которую можно перебрать.
Iterator: Это средство для итераций, позволяющее пройти через всю коллекцию, останавливаясь на каждом элементе с помощью next().
     */

    private List<Student> students;

    public StudyGroup() { // список студентов инициализируется в конструкторе
        students = new ArrayList<>();
    }

    public void addStudent(Student student) { // метод добавления студентов
        students.add(student);
    }

    public void sortByName() { // метод сортировки студентов по имени
//        Collections.sort(students, new StudentComparatorByName());
        students.sort(new StudentComparatorByName());  // упрощение метода сортировки Collections.sort(students);
        // изначально при добавлении в качества передаваемого типа students выходит ошибка (несоответствие запрашиваемого и предоставляемого типа),
        // для ее исключения необходимо воспользоваться Comparable (реализация в классе class Student implements Comparable<Student>,
        // далее метод:
        //// @Override
        ////    public int compareTo(Student o) {
        ////        return 0;
        ////    }

        ////    переопределение метода (метод для типа String):
        // @Override
        //    public int compareTo(Student anotherStudent) {
        //        return this.name.compareTo(anotherStudent.name);
        //    }
        //    )
        // далее этот метод необходимо отобразить в классе Service:
        //        public void sortByName() {
        //        studyGroup.sortByName();
        //        }
    }

    public void sortByAge() {
        // метод сортировки по возрасту студентов
        // через метод public int compare(Student o1, Student o2) класса StudentComparatorByAge
//        Collections.sort(students, new StudentComparatorByAge());
        students.sort(new StudentComparatorByAge()); // упрощение метода сортировки Collections.sort(students, new StudentComparatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        // метод iterator должен вернуть объект типа - Iterator<Student>
        return new StudentIterator(students);
    }


//    class SrudentIterator implements Iterator<Student> {
//        // создание класса, для реализации интерфейса Iterator<Student>
//        // создание нового (вложенного) класса внутри другого крайне НЕ желательно!
//        // лучше выносить его отдельным классом! чтобы в дальнейшем его было легко найти!
//
//// перенесен в отдельный класс SrudentIterator!!!
//
//        // т.к. класс SrudentIterator является вложенным (является частью) класса StudyGroup, то может получать данные класса StudyGroup,
//        // даже приватным. Т.е. методы private на него не действуют!
//
//        private int currentId;
//
//        @Override
//        public boolean hasNext() { // метод hasNext() проверяет есть ли следующий объект
//            return students.size() > currentId;
//        }
//
//        @Override
//        public Student next() { // метод next() возвращает следующий объект
//            return students.get(currentId++);
//        }
//    }

}
