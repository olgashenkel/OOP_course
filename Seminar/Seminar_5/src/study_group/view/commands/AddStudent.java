package study_group.view.commands;

import study_group.view.ConsoleUI;

// создание класса для отображения в пункте меню для пользователя

public class AddStudent extends Command {

    public AddStudent(ConsoleUI consoleUI) {
        super("Добавить студента", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addStudent();
    }
}
