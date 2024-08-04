package study_group.model.builder;

import study_group.model.student.Student;

public class StudentBuilder {

    private int genId;

    public Student build(String name, int age) {
        return new Student(genId++, name, age);
    }
}
