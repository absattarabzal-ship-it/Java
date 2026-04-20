import java.util.Scanner;
import java.util.Random;

public class LAB14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== LAB14: Цикл do-while ===");
            System.out.println("1 - Сумма от 1 до N");
            System.out.println("2 - Количество цифр");
            System.out.println("3 - Таблица умножения");
            System.out.println("4 - Наибольшая цифра");
            System.out.println("5 - Палиндром");
            System.out.println("6 - Количество чётных цифр");
            System.out.println("7 - Случайные числа до 0");
            System.out.println("8 - Сумма чисел до 0");
            System.out.println("9 - Проверка пароля");
            System.out.println("10 - Минимальное число");
            System.out.println("0 - Выход");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Введите N: ");
                    int n = scanner.nextInt();
                    int sum = 0, i = 1;
                    do {
                        sum += i;
                        i++;
                    } while (i <= n);
                    System.out.println("Сумма: " + sum);
                    break;

                case 2:
                    System.out.print("Введите число: ");
                    int num = scanner.nextInt();
                    int count = 0;
                    do {
                        num /= 10;
                        count++;
                    } while (num != 0);
                    System.out.println("Количество цифр: " + count);
                    break;

                case 3:
                    System.out.print("Введите число: ");
                    int x = scanner.nextInt();
                    int j = 1;
                    do {
                        System.out.println(x + " * " + j + " = " + (x * j));
                        j++;
                    } while (j <= 10);
                    break;

                case 4:
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    int max = 0;
                    do {
                        int digit = number % 10;
                        if (digit > max) max = digit;
                        number /= 10;
                    } while (number > 0);
                    System.out.println("Наибольшая цифра: " + max);
                    break;

                case 5:
                    System.out.print("Введите число: ");
                    int original = scanner.nextInt();
                    int reversed = 0, temp = original;
                    do {
                        reversed = reversed * 10 + temp % 10;
                        temp /= 10;
                    } while (temp > 0);
                    if (original == reversed)
                        System.out.println("Палиндром");
                    else
                        System.out.println("Не палиндром");
                    break;

                case 6:
                    System.out.print("Введите число: ");
                    int num2 = scanner.nextInt();
                    int evenCount = 0;
                    do {
                        if ((num2 % 10) % 2 == 0) evenCount++;
                        num2 /= 10;
                    } while (num2 > 0);
                    System.out.println("Чётных цифр: " + evenCount);
                    break;

                case 7:
                    Random rand = new Random();
                    int randomNumber;
                    do {
                        randomNumber = rand.nextInt(10);
                        System.out.println(randomNumber);
                    } while (randomNumber != 0);
                    break;

                case 8:
                    int sumInput = 0, value;
                    do {
                        System.out.print("Введите число (0 для выхода): ");
                        value = scanner.nextInt();
                        sumInput += value;
                    } while (value != 0);
                    System.out.println("Сумма: " + sumInput);
                    break;

                case 9:
                    scanner.nextLine(); // очистка буфера
                    String password;
                    do {
                        System.out.print("Введите пароль (минимум 6 символов): ");
                        password = scanner.nextLine();
                    } while (password.length() < 6);
                    System.out.println("Пароль принят");
                    break;

                case 10:
                    int min = Integer.MAX_VALUE;
                    int val;
                    do {
                        System.out.print("Введите число (0 для выхода): ");
                        val = scanner.nextInt();
                        if (val != 0 && val < min) min = val;
                    } while (val != 0);
                    System.out.println("Минимальное число: " + min);
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }

        } while (choice != 0);

        scanner.close();
    }
}