// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Тема Строки");
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задание 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);

        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задание 2");

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }

    public static void task2() {
        System.out.println("Задание 3");

        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника-"+fullName.replace('ё','е'));
    }
}