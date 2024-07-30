package study_group.student;

public class Student implements Comparable<Student> {
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

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        // метод, чтобы использовать данные имени вне данного класса
        return name;
    }

    public int getAge() {
        // метод, чтобы использовать данные возраста вне данного класса
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student anotherStudent) {
        return this.name.compareTo(anotherStudent.name);
    }
}
