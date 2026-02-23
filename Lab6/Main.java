import java.util.Scanner;

public class Main {

    // ---------------- ЗАДАНИЕ 1 ----------------
    // Метод вычисления площади прямоугольника
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    // ---------------- ЗАДАНИЕ 2 ----------------
    // Метод проверки чётности числа
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // ---------------- ЗАДАНИЕ 3 ----------------
    // Перегрузка метода max (int)
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Перегрузка метода max (double)
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // ---------------- ЗАДАНИЕ 4 ----------------
    // Рекурсивный факториал
    public static long factorial(int n) {

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не существует.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // ---------------- ЗАДАНИЕ 5 ----------------
    // Рекурсивное возведение в степень
    public static long power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ----- ЗАДАНИЕ 1 -----
        System.out.println("=== Задание 1: Площадь прямоугольника ===");
        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        System.out.print("Введите высоту: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);
        System.out.println("Площадь прямоугольника: " + area);

        // ----- ЗАДАНИЕ 2 -----
        System.out.println("\n=== Задание 2: Проверка чётности ===");
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Число " + number + " является чётным.");
        } else {
            System.out.println("Число " + number + " является нечётным.");
        }

        // ----- ЗАДАНИЕ 3 -----
        System.out.println("\n=== Задание 3: Перегрузка метода max ===");

        System.out.print("Введите два целых числа: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        System.out.println("Максимум (int): " + max(int1, int2));

        System.out.print("Введите два дробных числа: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        System.out.println("Максимум (double): " + max(double1, double2));

        // ----- ЗАДАНИЕ 4 -----
        System.out.println("\n=== Задание 4: Факториал ===");
        System.out.print("Введите число для факториала: ");
        int factNumber = scanner.nextInt();

        long factResult = factorial(factNumber);

        if (factResult != -1) {
            System.out.println("Факториал числа " + factNumber + " = " + factResult);
        }

        // ----- ЗАДАНИЕ 5 -----
        System.out.println("\n=== Задание 5: Степень числа ===");
        System.out.print("Введите основание: ");
        int base = scanner.nextInt();

        System.out.print("Введите степень (положительную): ");
        int exponent = scanner.nextInt();

        if (exponent < 0) {
            System.out.println("Отрицательная степень не поддерживается.");
        } else {
            long powerResult = power(base, exponent);
            System.out.println(base + " в степени " + exponent + " = " + powerResult);
        }

        scanner.close();
    }
}