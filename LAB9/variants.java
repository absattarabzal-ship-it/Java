// === ВАРИАНТ 1. ТРАНСПОРТ ===
class V1_Transport {
    String name;
    int speed;
    V1_Transport(String name, int speed) { this.name = name; this.speed = speed; }
    void move() { System.out.println(name + " движется со скоростью " + speed + " км/ч."); }
}
class V1_Car extends V1_Transport { V1_Car(String name, int speed) { super(name, speed); }
    @Override void move() { System.out.println("Машина " + name + " едет по шоссе."); } }
class V1_Train extends V1_Transport { V1_Train(String name, int speed) { super(name, speed); }
    @Override void move() { System.out.println("Поезд " + name + " следует по путям."); } }
class V1_Airplane extends V1_Transport { V1_Airplane(String name, int speed) { super(name, speed); }
    @Override void move() { System.out.println("Самолет " + name + " летит на высоте."); } }

// === ВАРИАНТ 2. ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ ===
class V2_Shape { void area() { System.out.println("Расчет площади фигуры..."); } }
class V2_Circle extends V2_Shape {
    double r; V2_Circle(double r) { this.r = r; }
    @Override void area() { System.out.println("Площадь круга: " + (Math.PI * r * r)); }
}
class V2_Rectangle extends V2_Shape {
    double w, h; V2_Rectangle(double w, double h) { this.w = w; this.h = h; }
    @Override void area() { System.out.println("Площадь прямоугольника: " + (w * h)); }
}
class V2_Triangle extends V2_Shape {
    double b, h; V2_Triangle(double b, double h) { this.b = b; this.h = h; }
    @Override void area() { System.out.println("Площадь треугольника: " + (0.5 * b * h)); }
}

// === ВАРИАНТ 3. РАБОТНИКИ КОМПАНИИ ===
class V3_Employee {
    String name; double salary;
    V3_Employee(String name, double salary) { this.name = name; this.salary = salary; }
    void work() { System.out.println(name + " выполняет общие задачи."); }
}
class V3_Manager extends V3_Employee { V3_Manager(String n, double s) { super(n, s); }
    @Override void work() { System.out.println("Менеджер " + name + " управляет отделом."); } }
class V3_Developer extends V3_Employee { V3_Developer(String n, double s) { super(n, s); }
    @Override void work() { System.out.println("Разработчик " + name + " пишет код на Java."); } }
class V3_Designer extends V3_Employee { V3_Designer(String n, double s) { super(n, s); }
    @Override void work() { System.out.println("Дизайнер " + name + " создает макеты."); } }

// === ВАРИАНТ 4. БАНКОВСКАЯ СИСТЕМА ===
class V4_BankAccount {
    String accountNumber; double balance;
    V4_BankAccount(String acc, double bal) { this.accountNumber = acc; this.balance = bal; }
    void deposit(double amount) { balance += amount; System.out.println(accountNumber + ": пополнение на " + amount); }
    void withdraw(double amount) { balance -= amount; System.out.println(accountNumber + ": снятие " + amount); }
}
class V4_SavingsAccount extends V4_BankAccount { V4_SavingsAccount(String a, double b) { super(a, b); } }
class V4_CreditAccount extends V4_BankAccount { V4_CreditAccount(String a, double b) { super(a, b); } }

// === ВАРИАНТ 5. УЧЕБНОЕ ЗАВЕДЕНИЕ ===
class V5_Person { String name; V5_Person(String n) { this.name = n; } }
class V5_Student extends V5_Person { V5_Student(String n) { super(n); }
    void study() { System.out.println("Студент " + name + " слушает лекцию."); } }
class V5_Teacher extends V5_Person { V5_Teacher(String n) { super(n); }
    void teach() { System.out.println("Преподаватель " + name + " ведет занятие."); } }
class V5_Administrator extends V5_Person { V5_Administrator(String n) { super(n); }
    void manage() { System.out.println("Админ " + name + " составляет расписание."); } }

// === ВАРИАНТ 6. УСТРОЙСТВА ===
class V6_Device {
    String brand; int power;
    V6_Device(String b, int p) { this.brand = b; this.power = p; }
    void turnOn() { System.out.println(brand + " включается (Мощность: " + power + "W)"); }
}
class V6_Laptop extends V6_Device { V6_Laptop(String b, int p) { super(b, p); } }
class V6_Smartphone extends V6_Device { V6_Smartphone(String b, int p) { super(b, p); } }
class V6_Tablet extends V6_Device { V6_Tablet(String b, int p) { super(b, p); } }

// === ВАРИАНТ 7. ЖИВОТНЫЕ ===
class V7_Animal { void makeSound() { System.out.println("Животное издает звук"); } }
class V7_Lion extends V7_Animal { @Override void makeSound() { System.out.println("Лев: Ррррр!"); } }
class V7_Elephant extends V7_Animal { @Override void makeSound() { System.out.println("Слон: Туууу!"); } }
class V7_Monkey extends V7_Animal { @Override void makeSound() { System.out.println("Обезьяна: У-а-а!"); } }

// === ВАРИАНТ 8. ТРАНСПОРТНЫЕ СРЕДСТВА ===
class V8_Vehicle { void startEngine() { System.out.println("Двигатель запущен"); } }
class V8_Bike extends V8_Vehicle { @Override void startEngine() { System.out.println("Велосипед: двигателя нет, крутим педали."); } }
class V8_Bus extends V8_Vehicle { @Override void startEngine() { System.out.println("Автобус: дизель прогрет."); } }
class V8_Taxi extends V8_Vehicle { @Override void startEngine() { System.out.println("Такси: мотор работает, ожидаем клиента."); } }

// === ВАРИАНТ 9. КОМПЬЮТЕРНЫЕ КОМПОНЕНТЫ ===
class V9_Component {
    String model; V9_Component(String m) { this.model = m; }
    void showInfo() { System.out.println("Деталь: " + model); }
}
class V9_CPU extends V9_Component { V9_CPU(String m) { super(m); }
    @Override void showInfo() { System.out.println("Процессор: " + model); } }
class V9_RAM extends V9_Component { V9_RAM(String m) { super(m); }
    @Override void showInfo() { System.out.println("Память: " + model); } }
class V9_GPU extends V9_Component { V9_GPU(String m) { super(m); }
    @Override void showInfo() { System.out.println("Видеокарта: " + model); } }

// === ВАРИАНТ 10. МАГАЗИН ===
class V10_Product {
    String name; double price;
    V10_Product(String n, double p) { this.name = n; this.price = p; }
    void showPrice() { System.out.println("Товар: " + name + " | Цена: " + price + " руб."); }
}
class V10_Food extends V10_Product { V10_Food(String n, double p) { super(n, p); } }
class V10_Electronics extends V10_Product { V10_Electronics(String n, double p) { super(n, p); } }
class V10_Clothes extends V10_Product { V10_Clothes(String n, double p) { super(n, p); } }

// === ВАРИАНТ 11. СПОРТИВНЫЕ КОМАНДЫ ===
class V11_TeamMember {
    String name; V11_TeamMember(String n) { this.name = n; }
    void play() { System.out.println(name + " участвует в игре."); }
    void train() { System.out.println(name + " тренируется."); }
    void heal() { System.out.println(name + " на лечении."); }
}
class V11_Player extends V11_TeamMember { V11_Player(String n) { super(n); } }
class V11_Coach extends V11_TeamMember { V11_Coach(String n) { super(n); } }
class V11_Doctor extends V11_TeamMember { V11_Doctor(String n) { super(n); } }

// === ВАРИАНТ 12. МУЗЫКАЛЬНЫЕ ИНСТРУМЕНТЫ ===
class V12_Instrument { void playSound() { System.out.println("Звучит музыка..."); } }
class V12_Guitar extends V12_Instrument { @Override void playSound() { System.out.println("Гитара: Брынь-брынь!"); } }
class V12_Piano extends V12_Instrument { @Override void playSound() { System.out.println("Пианино: До-Ре-Ми..."); } }
class V12_Drums extends V12_Instrument { @Override void playSound() { System.out.println("Барабаны: Бум-бам-бац!"); } }

// === ВАРИАНТ 13. УЧЕБНЫЕ КУРСЫ ===
class V13_Course {
    String title; V13_Course(String t) { this.title = t; }
    void startCourse() { System.out.println("Курс '" + title + "' открыт для записи."); }
}
class V13_ProgrammingCourse extends V13_Course { V13_ProgrammingCourse(String t) { super(t); } }
class V13_MathCourse extends V13_Course { V13_MathCourse(String t) { super(t); } }
class V13_HistoryCourse extends V13_Course { V13_HistoryCourse(String t) { super(t); } }

// === ВАРИАНТ 14. ИГРОВЫЕ ПЕРСОНАЖИ ===
class V14_Character {
    String name; V14_Character(String n) { this.name = n; }
    void attack() { System.out.println(name + " атакует!"); }
}
class V14_Warrior extends V14_Character { V14_Warrior(String n) { super(n); }
    @Override void attack() { System.out.println("Воин " + name + " бьет мечом!"); } }
class V14_Mage extends V14_Character { V14_Mage(String n) { super(n); }
    @Override void attack() { System.out.println("Маг " + name + " колдует фаербол!"); } }
class V14_Archer extends V14_Character { V14_Archer(String n) { super(n); }
    @Override void attack() { System.out.println("Лучник " + name + " стреляет из лука!"); } }

// === ВАРИАНТ 15. ЭЛЕКТРОННЫЕ УСТРОЙСТВА (БЫТОВАЯ ТЕХНИКА) ===
class V15_Appliance { void operate() { System.out.println("Прибор запущен."); } }
class V15_Refrigerator extends V15_Appliance { @Override void operate() { System.out.println("Холодильник поддерживает -18 градусов."); } }
class V15_WashingMachine extends V15_Appliance { @Override void operate() { System.out.println("Стиральная машина начала цикл стирки."); } }
class V15_Microwave extends V15_Appliance { @Override void operate() { System.out.println("Микроволновка разогревает еду."); } }

public class variants {
    public static void main(String[] args) {
        System.out.println("=== ВАРИАНТ 1: ТРАНСПОРТ ===");
        V1_Car car1 = new V1_Car("Toyota Corolla", 180);
        V1_Car car2 = new V1_Car("BMW M5", 250);
        V1_Train train = new V1_Train("Sapsan", 300);
        V1_Airplane plane = new V1_Airplane("Airbus A320", 850);
        car1.move(); car2.move(); train.move(); plane.move();

        System.out.println("\n=== ВАРИАНТ 2: ФИГУРЫ ===");
        new V2_Circle(10).area();
        new V2_Circle(3.5).area();
        new V2_Rectangle(5, 10).area();
        new V2_Triangle(4, 8).area();

        System.out.println("\n=== ВАРИАНТ 3: СОТРУДНИКИ ===");
        new V3_Manager("Александр", 150000).work();
        new V3_Developer("Дмитрий", 200000).work();
        new V3_Developer("Мария", 180000).work();
        new V3_Designer("Анна", 120000).work();

        System.out.println("\n=== ВАРИАНТ 4: БАНК ===");
        V4_SavingsAccount sAcc = new V4_SavingsAccount("Сберегательный-01", 50000);
        V4_CreditAccount cAcc = new V4_CreditAccount("Кредитный-99", 0);
        sAcc.deposit(10000);
        cAcc.withdraw(5000);

        System.out.println("\n=== ВАРИАНТ 5: ОБУЧЕНИЕ ===");
        new V5_Student("Игорь").study();
        new V5_Student("Елена").study();
        new V5_Teacher("Профессор Иванов").teach();
        new V5_Administrator("Ольга Петровна").manage();

        System.out.println("\n=== ВАРИАНТ 6: УСТРОЙСТВА ===");
        new V6_Laptop("MacBook Pro", 96).turnOn();
        new V6_Smartphone("Samsung S23", 25).turnOn();
        new V6_Tablet("iPad Air", 30).turnOn();

        System.out.println("\n=== ВАРИАНТ 7: ЗООПАРК ===");
        new V7_Lion().makeSound();
        new V7_Elephant().makeSound();
        new V7_Monkey().makeSound();

        System.out.println("\n=== ВАРИАНТ 8: ТРАНСПОРТНЫЕ СРЕДСТВА ===");
        new V8_Bike().startEngine();
        new V8_Bus().startEngine();
        new V8_Taxi().startEngine();

        System.out.println("\n=== ВАРИАНТ 9: КОМПОНЕНТЫ ===");
        new V9_CPU("Intel Core i7").showInfo();
        new V9_RAM("Kingston 16GB").showInfo();
        new V9_GPU("NVIDIA RTX 4070").showInfo();

        System.out.println("\n=== ВАРИАНТ 10: МАГАЗИН ===");
        new V10_Food("Молоко", 89).showPrice();
        new V10_Electronics("Наушники", 12000).showPrice();
        new V10_Clothes("Джинсы", 4500).showPrice();

        System.out.println("\n=== ВАРИАНТ 11: КОМАНДА ===");
        new V11_Player("Роналду").play();
        new V11_Coach("Черчесов").train();
        new V11_Doctor("Доктор Хаус").heal();

        System.out.println("\n=== ВАРИАНТ 12: МУЗЫКА ===");
        new V12_Guitar().playSound();
        new V12_Piano().playSound();
        new V12_Drums().playSound();

        System.out.println("\n=== ВАРИАНТ 13: КУРСЫ ===");
        new V13_ProgrammingCourse("Основы Java").startCourse();
        new V13_MathCourse("Высшая математика").startCourse();

        System.out.println("\n=== ВАРИАНТ 14: RPG ИГРА ===");
        new V14_Warrior("Конан").attack();
        new V14_Mage("Гэндальф").attack();
        new V14_Archer("Леголас").attack();

        System.out.println("\n=== ВАРИАНТ 15: БЫТОВАЯ ТЕХНИКА ===");
        new V15_Refrigerator().operate();
        new V15_WashingMachine().operate();
        new V15_Microwave().operate();
    }
}