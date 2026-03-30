import java.util.Scanner;

class LAB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите задание (1-10):");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                int n1 = sc.nextInt();
                if (n1 > 0) System.out.println("Положительное");
                else if (n1 < 0) System.out.println("Отрицательное");
                else System.out.println("Ноль");
                break;

            case 2:
                int score = sc.nextInt();
                if (score >= 90) System.out.println("5");
                else if (score >= 75) System.out.println("4");
                else if (score >= 60) System.out.println("3");
                else System.out.println("2");
                break;

            case 3:
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b) System.out.println("Первое больше");
                else if (a < b) System.out.println("Второе больше");
                else System.out.println("Равны");
                break;

            case 4:
                int day = sc.nextInt();
                switch (day) {
                    case 1: System.out.println("Понедельник"); break;
                    case 2: System.out.println("Вторник"); break;
                    case 3: System.out.println("Среда"); break;
                    case 4: System.out.println("Четверг"); break;
                    case 5: System.out.println("Пятница"); break;
                    case 6: System.out.println("Суббота"); break;
                    case 7: System.out.println("Воскресенье"); break;
                    default: System.out.println("Ошибка");
                }
                break;

            case 5:
                int n2 = sc.nextInt();
                if (n2 % 2 == 0) System.out.println("Чётное");
                else System.out.println("Нечётное");
                break;

            case 6:
                int age = sc.nextInt();
                if (age >= 18) System.out.println("Доступ разрешён");
                else System.out.println("Доступ запрещён");
                break;

            case 7:
                int m = sc.nextInt();
                switch (m) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        System.out.println("31 день"); break;
                    case 4: case 6: case 9: case 11:
                        System.out.println("30 дней"); break;
                    case 2:
                        System.out.println("28 или 29 дней"); break;
                    default:
                        System.out.println("Ошибка");
                }
                break;

            case 8:
                int t = sc.nextInt();
                if (t < 10) System.out.println("Холодно");
                else if (t <= 25) System.out.println("Тепло");
                else System.out.println("Жарко");
                break;

            case 9:
                int n3 = sc.nextInt();
                if (n3 >= 10 && n3 <= 50) System.out.println("В диапазоне");
                else System.out.println("Вне диапазона");
                break;

            case 10:
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                char op = sc.next().charAt(0);

                switch (op) {
                    case '+': System.out.println(x + y); break;
                    case '-': System.out.println(x - y); break;
                    case '*': System.out.println(x * y); break;
                    case '/':
                        if (y != 0) System.out.println(x / y);
                        else System.out.println("Ошибка");
                        break;
                    default:
                        System.out.println("Неверная операция");
                }
                break;

            default:
                System.out.println("Неверный выбор");
        }
    }
}
