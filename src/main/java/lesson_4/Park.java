package lesson_4;

import java.util.ArrayList;
import java.util.List;

// Класс Park
public class Park {
    // Имя парка
    private String name;
    // Список аттракционов
    private List<Attraction> attractions;

    // Конструктор парка
    public Park(String name) {
        // Инициализируем имя парка
        this.name = name;
        // Создаем пустой список аттракционов
        this.attractions = new ArrayList<>();
    }

    // Внутренний класс Attraction представляет собой аттракцион
    private static class Attraction {
        // Имя аттракциона
        private String name;
        // Время работы аттракциона
        private String workingHours;
        // Стоимость аттракциона
        private double cost;

        // Конструктор аттракциона
        public Attraction(String name, String workingHours, double cost) {
            // Инициализируем имя, время работы и стоимость аттракциона
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        // Геттер для имени аттракциона
        public String getName() {
            return name;
        }

        // Геттер для времени работы аттракциона
        public String getWorkingHours() {
            return workingHours;
        }

        // Геттер для стоимости аттракциона
        public double getCost() {
            return cost;
        }
    }

    // Метод для добавления аттракциона в парк
    public void addAttraction(Attraction attraction) {
        // Добавляем аттракцион в список
        attractions.add(attraction);
    }

    // Метод для вывода информации об аттракционах
    public void printAttractions() {
        // Перебираем список аттракционов
        for (Attraction attraction : attractions) {
            // Выводим информацию об аттракционе
            System.out.println("Название аттракциона: " + attraction.getName());
            System.out.println("Время работы: " + attraction.getWorkingHours());
            System.out.println("Стоимость: " + attraction.getCost());
            System.out.println();
        }
    }

    // Основной метод
    public static void main(String[] args) {
        // Создаем парк развлечений
        Park park = new Park("Парк развлечений");

        // Создаем три аттракциона
        Park.Attraction attraction1 = new Park.Attraction("Колесо обозрения", "10:00-20:00", 50.0);
        Park.Attraction attraction2 = new Park.Attraction("Веселые  горки", "10:00-19:00", 70.0);
        Park.Attraction attraction3 = new Park.Attraction("Карусель Вальс", "11:00-19:00", 30.0);

        // Добавляем аттракционы в парк
        park.addAttraction(attraction1);
        park.addAttraction(attraction2);
        park.addAttraction(attraction3);

        // Выводим информацию об аттракционах
        park.printAttractions();
    }
}