package lesson_5;

import java.util.Scanner;// Абстрактный класс Животное
public abstract class Animal {
    // Общее количество животных
    public static int count = 0;

    // Конструктор
    public Animal() {
        count++;
    }

    // Бег
    public void run(int distance) {
        System.out.println(getName() + " пробежал " + distance + " м.");
    }

    // Плавание
    public void swim(int distance) {
        System.out.println(getName() + " проплыл " + distance + " м.");
    }

    // Получить имя
    public abstract String getName();
}



