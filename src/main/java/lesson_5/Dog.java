package lesson_5;

// Класс Собака, наследуется от Животное
public class Dog extends Animal {
    // Общее количество собак
    private static int count = 0;

    // Имя
    private String name;

    // Конструктор
    public Dog(String name) {
        super();
        this.name = name;
        count++;
    }

    // Бег (ограничение 500 м)
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать так далеко.");
        }
    }

    // Плавание (ограничение 10 м)
    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println(name + " не может проплыть так далеко.");
        }
    }

    // Получить имя
    @Override
    public String getName() {
        return name;
    }

    // Получить количество собак
    public static int getCount() {
        return count;
    }
}
