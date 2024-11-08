package lesson_4;

public class Worker {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Worker(String surname, String name, String patronymic, String position, String email, String phone, double salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Сотрудник: " + surname + " " + name + " " + patronymic);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];

        workers[0] = new Worker("Зайцев", "Петр", "Иванович", "Инженер", "petr.ivanov@gmail.com", "+7 (123) 456-7890", 50000.0, 35);
        workers[1] = new Worker("Смирнова", "Анна", "Юрьевна", "Менеджер", "anna.smirnova@gmail.com", "+7 (987) 654-3210", 60000.0, 30);
        workers[2] = new Worker("Маршин", "Александр", "Александрович", "Программист", "ivan.sidorov@gmail.com", "+7 (456) 123-7890", 40000.0, 25);
        workers[3] = new Worker("Петрова", "Мария", "Николаевна", "Бухгалтер", "maria.petrova@mail.ru", "+7 (111) 222-3344", 45000.0, 28);
        workers[4] = new Worker("Козлов", "Евгений", "Викторович", "Директор", "evgeny.kozlov@mail.ru", "+7 (555) 666-7788", 80000.0, 40);

        for (Worker worker : workers) {
            worker.printInfo();
            System.out.println();
        }
    }
}