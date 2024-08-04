package study_group.view;

import study_group.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {

    private Scanner scanner;
    private boolean work;
    private Presenter presenter;
    private MainMenu menu;



    public ConsoleUI() {
        scanner = new Scanner(System.in);
        work = true;
        presenter = new Presenter(this);
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Приветствие!");
        while (work) {
            System.out.println(menu.menu());
            String choiceStr = scanner.nextLine();
            // необходимо добавить метод проверки на валидность
            int choice = Integer.parseInt(choiceStr);
            menu.execute(choice);
        }
    }

    public void finish() {
        work = false;
        scanner.close();
        System.out.println("До новых встреч!");
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getStudentListInfo() {
        presenter.getStudentListInfo();
    }

    public void addStudent() {
        System.out.println("Укажите мя студента");
        String name = scanner.nextLine();
        System.out.println("Укажите возраст студента");
        String ageStr = scanner.nextLine();
        // для избежания возможных проблем в работе Scanner при разных выводах (int, String),
        // лучше использовать способ ввода строки и преобразования её в число
        int age = Integer.parseInt(ageStr);

        presenter.addStudent(name, age);
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }


}
