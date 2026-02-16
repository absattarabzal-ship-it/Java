import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1. Вывод чисел от 1 до N");
        System.out.print("Введите число N: ");
        int N1 = scanner.nextInt();

        for (int i = 1; i <= N1; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Задание 2. Сумма чисел от 1 до N");
        System.out.print("Введите число N: ");
        int N2 = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= N2) {
            sum += i;
            i++;
        }

        System.out.println("Сумма = " + sum + "\n");

        System.out.println("Задание 3. Факториал числа N");
        System.out.print("Введите число N: ");
        int N3 = scanner.nextInt();

        long factorial = 1;

        for (int j = 1; j <= N3; j++) {
            factorial *= j;
        }

        System.out.println("Факториал = " + factorial + "\n");

        System.out.println("Задание 4. Чётные числа от 1 до 100");

        int k = 1;

        while (k <= 10000) {
            if (k % 2 != 0) {
                k++;
                continue;
            }
            System.out.print(k + " ");
            k++;
        }
        System.out.println("\n");

        System.out.println("Задание 5. Ввод чисел до 0");

        int number;
        int total = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");
            number = scanner.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("Сумма введённых чисел = " + total + "\n");

        System.out.println("Дополнительное задание. Таблица умножения 1–5");

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
