package study_group.builder;

import study_group.student.Student;

public class StudentBuilder {
    // класс для присваивания Id студенту

    private int genId;

    public Student build(String name, int age) {
        return new Student(genId++, name, age);
    }
}
