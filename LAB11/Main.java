import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            printMenu();
            int choice = getIntInput("Выберите пункт меню: ");

            clearScreen();

            switch (choice) {
                case 1: // сложение
                    double a1 = getDoubleInput("Введите первое число: ");
                    double b1 = getDoubleInput("Введите второе число: ");
                    double sum = a1 + b1;
                    saveAndPrint(a1 + " + " + b1 + " = " + sum);
                    break;

                case 2: // вычитание
                    double a2 = getDoubleInput("Введите первое число: ");
                    double b2 = getDoubleInput("Введите второе число: ");
                    double sub = a2 - b2;
                    saveAndPrint(a2 + " - " + b2 + " = " + sub);
                    break;

                case 3: // умножение
                    double a3 = getDoubleInput("Введите первое число: ");
                    double b3 = getDoubleInput("Введите второе число: ");
                    double mul = a3 * b3;
                    saveAndPrint(a3 + " * " + b3 + " = " + mul);
                    break;

                case 4: // деление
                    double a4 = getDoubleInput("Введите первое число: ");
                    double b4 = getDoubleInput("Введите второе число: ");

                    if (b4 == 0) {
                        System.out.println("Ошибка: деление на ноль!");
                        break;
                    }

                    double div = a4 / b4;
                    saveAndPrint(a4 + " / " + b4 + " = " + div);
                    break;

                case 5: // степень
                    double base = getDoubleInput("Введите основание: ");
                    double exp = getDoubleInput("Введите степень: ");
                    double pow = Math.pow(base, exp);
                    saveAndPrint(base + "^" + exp + " = " + pow);
                    break;

                case 6: // квадратный корень
                    double x = getDoubleInput("Введите число: ");
                    if (x < 0) {
                        System.out.println("Ошибка: отрицательное число!");
                        break;
                    }
                    saveAndPrint("√" + x + " = " + Math.sqrt(x));
                    break;

                case 7: // проценты
                    double percentA = getDoubleInput("Введите число: ");
                    double percentB = getDoubleInput("Сколько % взять: ");
                    double percentResult = (percentA * percentB) / 100;
                    saveAndPrint(percentB + "% от " + percentA + " = " + percentResult);
                    break;

                case 8: // sin, cos, tan
                    double angle = getDoubleInput("Введите число (радианы): ");
                    System.out.println("1 - sin");
                    System.out.println("2 - cos");
                    System.out.println("3 - tan");
                    int op = getIntInput("Выберите функцию: ");

                    if (op == 1) saveAndPrint("sin(" + angle + ") = " + Math.sin(angle));
                    else if (op == 2) saveAndPrint("cos(" + angle + ") = " + Math.cos(angle));
                    else if (op == 3) saveAndPrint("tan(" + angle + ") = " + Math.tan(angle));
                    else System.out.println("Неверный выбор!");
                    break;

                case 9: // выражения
                    scanner.nextLine();
                    System.out.print("Введите выражение: ");
                    String expr = scanner.nextLine();

                    try {
                        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
                        Object result = engine.eval(expr);
                        saveAndPrint(expr + " = " + result);
                    } catch (Exception e) {
                        System.out.println("Ошибка в выражении!");
                    }
                    break;

                case 10: // история
                    System.out.println("История вычислений:");
                    for (String record : history) System.out.println(record);
                    break;

                case 11: // очистка истории
                    history.clear();
                    System.out.println("История очищена!");
                    break;

                case 0:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неверный пункт меню!");
            }

            System.out.println("\nНажмите Enter чтобы продолжить...");
            scanner.nextLine();
            scanner.nextLine();
            clearScreen();
        }
    }

    // ======== Методы ========

    static void printMenu() {
        System.out.println("===== КАЛЬКУЛЯТОР 11LAB =====");
        System.out.println("1 – сложение");
        System.out.println("2 – вычитание");
        System.out.println("3 – умножение");
        System.out.println("4 – деление");
        System.out.println("5 – степень (x^y)");
        System.out.println("6 – квадратный корень");
        System.out.println("7 – процент (a % от b)");
        System.out.println("8 – инженерный (sin, cos, tan)");
        System.out.println("9 – вычисление выражения");
        System.out.println("10 – история");
        System.out.println("11 – очистить историю");
        System.out.println("0 – выход");
    }

    static double getDoubleInput(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ожидается число!");
                scanner.nextLine();
            }
        }
    }

    static int getIntInput(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ожидается целое число!");
                scanner.nextLine();
            }
        }
    }

    static void saveAndPrint(String text) {
        history.add(text);
        System.out.println(text);
    }

    static void clearScreen() {
        for (int i = 0; i < 40; i++) System.out.println();
    }
}