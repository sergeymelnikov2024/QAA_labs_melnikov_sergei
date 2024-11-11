package lesson_5;

import java.util.Scanner;

// Интерфейс, определяющий методы для фигур
interface Figure {
    double getPerimeter(); // Метод для вычисления периметра
    double getArea(); // Метод для вычисления площади
    String getFillColor(); // Метод для получения цвета заливки
    String getBorderColor(); // Метод для получения цвета границы
}

// Класс круга, реализующий интерфейс Figure
class Circle implements Figure {
    private double radius; // Радиус круга

    public Circle(double radius) { // Конструктор круга
        this.radius = radius;
    }

    @Override
    public double getPerimeter() { // Вычисление периметра круга
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() { // Вычисление площади круга
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() { // Цвет заливки круга
        return "Blue"; // Цвет заливки: Синий
    }

    @Override
    public String getBorderColor() { // Цвет границы круга
        return "Red"; // Цвет границы: Красный
    }
}

// Класс прямоугольника, реализующий интерфейс Figure
class Rectangle implements Figure {
    private double length; // Длина прямоугольника
    private double width; // Ширина прямоугольника

    public Rectangle(double length, double width) { // Конструктор прямоугольника
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() { // Вычисление периметра прямоугольника
        return 2 * (length + width);
    }

    @Override
    public double getArea() { // Вычисление площади прямоугольника
        return length * width;
    }

    @Override
    public String getFillColor() { // Цвет заливки прямоугольника
        return "Green"; // Цвет заливки: Зеленый
    }

    @Override
    public String getBorderColor() { // Цвет границы прямоугольника
        return "Black"; // Цвет границы: Черный
    }
}

// Класс треугольника, реализующий интерфейс Figure
class Triangle implements Figure {
    private double base; // Основание треугольника
    private double height; // Высота треугольника

    public Triangle(double base, double height) { // Конструктор треугольника
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() { // Вычисление периметра треугольника
        return base * 2 + height * 2; // Простой расчет, предполагающий равнобедренный треугольник
    }

    @Override
    public double getArea() { // Вычисление площади треугольника
        return base * height / 2;
    }

    @Override
    public String getFillColor() { // Цвет заливки треугольника
        return "Yellow"; // Цвет заливки: Желтый
    }

    @Override
    public String getBorderColor() { // Цвет границы треугольника
        return "White"; // Цвет границы: Белый
    }
}

// Главный класс для выполнения программы
public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создание объекта для считывания ввода

        // Ввод радиуса круга
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius); // Создание объекта круга

        // Ввод длины и ширины прямоугольника
        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width); // Создание объекта прямоугольника

        // Ввод основания и высоты треугольника
        System.out.print("Введите длину основания треугольника: ");
        double base = scanner.nextDouble();
        System.out.print("Введите высоту треугольника: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height); // Создание объекта треугольника

        // Вывод информации о каждой фигуре
        printFigureInfo(circle);
        printFigureInfo(rectangle);
        printFigureInfo(triangle);
    }

    // Метод для вывода информации о фигуре
    private static void printFigureInfo(Figure figure) {
        if (figure instanceof Circle) {
            System.out.println("Информация о круге:");
        } else if (figure instanceof Rectangle) {
            System.out.println("Информация о прямоугольнике:");
        } else if (figure instanceof Triangle) {
            System.out.println("Информация о треугольнике:");
        }

        System.out.printf("Периметр: %.2f%n", figure.getPerimeter()); // Вывод периметра
        System.out.printf("Площадь: %.2f%n", figure.getArea()); // Вывод площади
        System.out.printf("Цвет заливки: %s%n", figure.getFillColor()); // Вывод цвета заливки
        System.out.printf("Цвет границы: %s%n", figure.getBorderColor()); // Вывод цвета границы
        System.out.println(); // Пустая строка для разделения
    }
}
