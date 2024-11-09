package lesson_5;

// Класс Кот, наследуется от Животное
public class Cat extends Animal {
    // Общее количество котов
    private static int count = 0;

    // Имя
    private String name;

    // Сытость
    private boolean isFull;

    // Конструктор
    public Cat(String name) {
        super();
        this.name = name;
        this.isFull = false;
        count++;
    }

    // Метод бега (ограничение 200 м)
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать так далеко.");
        }
    }

    // Метод плавания (не умеет плавать)
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    // Метод кушания из миски
    public void eatFromBowl(FoodBowl bowl, int amount) {
        if (bowl.getFood() >= amount) {
            bowl.setFood(bowl.getFood() - amount);
            this.isFull = true;
            System.out.println(name + " покушал из миски.");
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    // Метод получения имени
    @Override
    public String getName() {
        return name;
    }

    // Метод получения сытости
    public boolean getIsFull() {
        return isFull;
    }

    // Метод получения общего количества котов
    public static int getCount() {
        return count;
    }
}
