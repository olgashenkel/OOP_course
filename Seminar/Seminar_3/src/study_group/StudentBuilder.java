package study_group;

public class StudentBuilder {
    private int genId;

    public Student build(String name, int age) {
        return new Student(genId++, name, age);
    }
}
