package study_group;

import java.util.Iterator;

public class Service {
    private StudentBuilder studentBuilder;
    private StudyGroup studyGroup;

    public Service() {
        studyGroup = new StudyGroup();
        studentBuilder = new StudentBuilder();
    }

    public void addStudent(String name, int age) {
        Student student = studentBuilder.build(name, age);
        studyGroup.addStudent(student);
    }

    public String getStudentListInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");

        // как выглядит (синтаксис) цикл forEach:
        Iterator<Student> iterator = studyGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }

//        for (Student student : studyGroup) {
//            stringBuilder.append(student);
//            stringBuilder.append("\n");
//        }
        return stringBuilder.toString();
    }
}
