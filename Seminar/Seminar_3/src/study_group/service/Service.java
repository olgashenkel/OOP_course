package study_group.service;

import study_group.student.Student;
import study_group.builder.StudentBuilder;
import study_group.study_group.StudyGroup;

public class Service {
    private StudentBuilder studentBuilder;
    private StudyGroup studyGroup;

    public Service() { // инициализация данных
        studyGroup = new StudyGroup();
        studentBuilder = new StudentBuilder();
    }

    public void addStudent(String name, int age) { // добавление студентов. Вместо void можно использовать boolean, т.е. выводить логическое значение добавлен или нет студент
        Student student = studentBuilder.build(name, age); // создание студента
        studyGroup.addStudent(student); // зачисление студента в группу
    }

    public void sortByName() { // сортировка по имени студента
        studyGroup.sortByName();
    }

    public void sortByAge() { // сортировка по возрасту студента
        studyGroup.sortByAge();
    }

    public String getStudentListInfo() {
        // метод для вывода информации о студентах. Данный метод только предоставляет информации
        // без возможности редактирования пользователем

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");

//        // как выглядит (синтаксис) цикл forEach:
//        Iterator<Student> iterator = studyGroup.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            stringBuilder.append(student);
//            stringBuilder.append("\n");
//        }

        // сокращенный синтаксис цикла forEach:
        // данный цикл работает благодаря реализации метода public Iterator<Student> iterator() класса StudyGroup
        for (Student student : studyGroup) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
