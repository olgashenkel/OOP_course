package study_group.service;

import study_group.student.Student;
import study_group.builder.StudentBuilder;
import study_group.study_group.StudyGroup;

public class Service {
    private StudentBuilder studentBuilder;
    private StudyGroup<Student> studyGroup;

    public Service() {
        studyGroup = new StudyGroup<>();
        studentBuilder = new StudentBuilder();
    }

    public void addStudent(String name, int age) {
        Student student = studentBuilder.build(name, age);
        studyGroup.addStudent(student);
    }

    public void sortByName() { // сортировка по имени студента
        studyGroup.sortByName();
    }

    public void sortByAge() { // сортировка по возрасту студента
        studyGroup.sortByAge();
    }

    public String getStudentListInfo() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");
        for (Student student : studyGroup) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
