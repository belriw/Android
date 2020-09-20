package belsty.gorbatenkova.by;

import belsty.gorbatenkova.by.Exeption.EduException;
import belsty.gorbatenkova.by.educationManager.IAction;
import belsty.gorbatenkova.by.educationManager.Manager;
import belsty.gorbatenkova.by.units.Listener;
import belsty.gorbatenkova.by.units.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EduException {
        String courseName;
        Manager manager = IAction.getManager();
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        String s = "";
        while (!"7".equals(s)) {
            System.out.println("1. Создать курс");
            System.out.println("2. Вывести список учасников курса");
            System.out.println("3. Добавить студента в курс");
            System.out.println("4. Добавить слушателя в курс");
            System.out.println("5. Показать рейтинг 3 лучших студентов");
            System.out.println("6. Добавить участников их файла");
            System.out.println("7. Для выхода из приложения введите 7");

            s = scanner.nextLine();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (x) {
                case 1:
                    System.out.println("Введите название курса");
                    courseName = scanner.nextLine();
                    manager.createCourse(courseName);
                    break;
                case 2:
                    System.out.println("Список курсов:");
                    manager.PrintAllCourses();
                    System.out.println("Введите Курс:");
                    courseName = scanner.nextLine();
                    manager.PrinfAllMembersOfCours(courseName);
                    break;
                case 3:
                    try {
                        System.out.println("Введите название курса");
                        courseName = scanner.nextLine();
                        System.out.println("Введите Имя Студента");
                        String studentName = scanner.nextLine();
                        System.out.println("Введите возраст студента");
                        String studentAge = scanner.nextLine();
                        int Age = Integer.parseInt(studentAge);
                        if (Age > 100 || Age < 18) {
                            System.out.println("Возраст должен быть корректным");
                            break;
                        }
                        manager.addPersonToCourse(courseName, new Student(studentName, Age));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Не верно введенно значение");
                        break;
                    }
                case 4:
                    System.out.println("Введите название курса");
                    courseName = scanner.nextLine();
                    System.out.println("Введите Имя:");
                    String listenerName = scanner.nextLine();
                    manager.addPersonToCourse(courseName, new Listener(listenerName));
                case 5:
                    System.out.println("Введите название курса");
                    courseName = scanner.nextLine();
                    manager.GetThreeBestStudents(courseName);
                    break;
                case 6:
                    System.out.println("Введите название курса");
                    courseName = scanner.nextLine();
                    manager.loadJSONFile(courseName);
            }
        }
        System.out.println("До свидания!");
    }
}
