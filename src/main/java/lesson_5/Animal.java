package lesson_5;

import java.util.Scanner;

// Класс Животное
public class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать так далеко.");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else {
            System.out.println(name + " не может проплыть так далеко.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество собак: ");
        int dogCount = scanner.nextInt();

        System.out.print("Введите количество котов: ");
        int catCount = scanner.nextInt();

        System.out.print("Введите количество еды в миске: ");
        int foodCount = scanner.nextInt();

        Dog[] dogs = new Dog[dogCount];
        Cat[] cats = new Cat[catCount];

        for (int i = 0; i < dogCount; i++) {
            System.out.print("Введите имя собаки " + (i + 1) + ": ");
            String dogName = scanner.next();
            dogs[i] = new Dog(dogName);
        }

        for (int i = 0; i < catCount; i++) {
            System.out.print("Введите имя кота " + (i + 1) + ": ");
            String catName = scanner.next();
            cats[i] = new Cat(catName);
        }

        FoodBowl bowl = new FoodBowl(foodCount);

        // Коты кушают из миски
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        // Проверка сытости котов
        for (Cat cat : cats) {
            if (cat.isHungry()) {
                System.out.println(cat.name + " голоден.");
            } else {
                System.out.println(cat.name + " сыт.");
            }
        }

        // Показываем сколько еды осталось в миске
        System.out.println("Осталось еды в миске: " + bowl.getFood() + " единиц.");

        // Возможность добавления еды в миску и кормления голодных котов
        while (!Cat.isAllCatsFed()) {
            System.out.print("Хотите добавить еду в миску? (да/нет): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("да")) {
                System.out.print("Введите количество еды для добавления: ");
                int additionalFood = scanner.nextInt();
                bowl.addFood(additionalFood);

                // Коты снова кушают из миски
                for (Cat cat : cats) {
                    if (cat.isHungry()) {
                        cat.eat(bowl);
                    }
                }

                // Проверка сытости котов
                for (Cat cat : cats) {
                    if (cat.isHungry()) {
                        System.out.println(cat.name + " голоден.");
                    } else {
                        System.out.println(cat.name + " сыт.");
                    }
                }

                // Показываем сколько еды осталось в миске
                System.out.println("Осталось еды в миске: " + bowl.getFood() + " единиц.");
            } else {
                break; // Если пользователь не хочет добавлять еду, выход из цикла
            }
        }

        // Собака взаимодействует
        for (Dog dog : dogs) {
            System.out.print("Введите расстояние для собаки " + dog.name + " для пробежки: ");
            int dogRunDistance = scanner.nextInt();
            dog.run(dogRunDistance);

            System.out.print("Введите расстояние для собаки " + dog.name + " для плавания: ");
            int dogSwimDistance = scanner.nextInt();
            dog.swim(dogSwimDistance);
        }

        // Кот взаимодействует
        for (Cat cat : cats) {
            System.out.print("Введите расстояние для кота " + cat.name + " для пробежки: ");
            int catRunDistance = scanner.nextInt();
            cat.run(catRunDistance);

            System.out.print("Введите расстояние для кота " + cat.name + " для плавания: ");
            int catSwimDistance = scanner.nextInt();
            cat.swim(catSwimDistance);
        }

        System.out.println("Создано животных: " + Animal.getAnimalCount());
        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Создано котов: " + Cat.getCatCount());
    }

    // Класс Собака
    public static class Dog extends Animal {
        private static int dogCount = 0;

        public Dog(String name) {
            super(name, 500, 10);
            dogCount++;
        }

        public static int getDogCount() {
            return dogCount;
        }
    }

    // Класс Кот
    public static class Cat extends Animal {
        private boolean isHungry = true;
        private static int catCount = 0;
        private static int fedCats = 0;

        public Cat(String name) {
            super(name, 200, 0);
            catCount++;
        }

        public void eat(FoodBowl bowl) {
            if (bowl.getFood() >= 10) {
                bowl.setFood(bowl.getFood() - 10);
                isHungry = false;
                fedCats++;
                System.out.println(name + " покушал.");
            } else {
                System.out.println(name + " не может покушать, не хватает еды.");
            }
        }

        public boolean isHungry() {
            return isHungry;
        }

        public static boolean isAllCatsFed() {
            return fedCats == catCount;
        }

        public static int getCatCount() {
            return catCount;
        }

        @Override
        public void swim(int distance) {
            // Переопределяем метод swim для кота
            System.out.println(name + " не умеет плавать.");
        }
    }

    // Класс Миска с едой
    public static class FoodBowl {
        private int food;

        public FoodBowl(int food) {
            this.food = food >= 0 ? food : 0; // Обеспечиваем, что еда не может быть отрицательной
        }

        public int getFood() {
            return food;
        }

        public void setFood(int food) {
            if (food >= 0) {
                this.food = food;
            } else {
                System.out.println("Нельзя положить отрицательное количество еды в миску.");
            }
        }

        public void addFood(int additionalFood) {
            if (additionalFood > 0) {
                this.food += additionalFood;
                System.out.println("Добавлено " + additionalFood + " еды в миску.");
            } else {
                System.out.println("Нельзя добавить отрицательное количество еды.");
            }
        }
    }
}
