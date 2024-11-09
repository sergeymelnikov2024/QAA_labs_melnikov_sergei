package lesson_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем миску с едой
        System.out.print("Enter the amount of food in the bowl: ");
        int foodAmount = scanner.nextInt();
        FoodBowl bowl = new FoodBowl(foodAmount);

        // Создаем массив котов
        System.out.print("Enter the number of cats to create: ");
        int numCats = scanner.nextInt();
        Cat[] cats = new Cat[numCats];
        for (int i = 0; i < cats.length; i++) {
            System.out.print("Enter the name of cat " + (i + 1) + ": ");
            String catName = scanner.next();
            cats[i] = new Cat(catName);
        }

        // Создаем собак
        System.out.print("Enter the number of dogs to create: ");
        int numDogs = scanner.nextInt();
        Dog[] dogs = new Dog[numDogs];
        for (int i = 0; i < dogs.length; i++) {
            System.out.print("Enter the name of dog " + (i + 1) + ": ");
            String dogName = scanner.next();
            dogs[i] = new Dog(dogName);
        }

        // Коты пытаются покушать из миски
        for (Cat cat : cats) {
            System.out.print("Enter the amount of food " + cat.getName() + " eats: ");
            int foodEaten = scanner.nextInt();
            cat.eatFromBowl(bowl, foodEaten);
        }

        // Коты бегают и плавают
        for (Cat cat : cats) {
            System.out.print("Enter the distance " + cat.getName() + " runs: ");
            int catDistance = scanner.nextInt();
            cat.run(catDistance);

            System.out.print("Enter the distance " + cat.getName() + " swims: ");
            int catSwimDistance = scanner.nextInt();
            cat.swim(catSwimDistance);
        }

        // Собаки бегают и плавают
        for (Dog dog : dogs) {
            System.out.print("Enter the distance " + dog.getName() + " runs: ");
            int dogDistance = scanner.nextInt();
            dog.run(dogDistance);

            System.out.print("Enter the distance " + dog.getName() + " swims: ");
            int dogSwimDistance = scanner.nextInt();
            dog.swim(dogSwimDistance);
        }

        // Выводим информацию о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.getIsFull());
        }

        // Выводим общее количество котов и собак
        System.out.println("Total number of cats: " + Cat.getCount());
        System.out.println("Total number of dogs: " + Dog.getCount());
        System.out.println("Total number of animals: " + (Cat.getCount() + Dog.getCount()));
    }

}




