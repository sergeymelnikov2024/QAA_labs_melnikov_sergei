package lesson_5;

import java.util.Scanner;

interface Figure {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();
}

class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return "Blue";
    }

    @Override
    public String getBorderColor() {
        return "Red";
    }
}

class Rectangle implements Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getFillColor() {
        return "Green";
    }

    @Override
    public String getBorderColor() {
        return "Black";
    }
}

class Triangle implements Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return base * 2 + height * 2;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String getFillColor() {
        return "Yellow";
    }

    @Override
    public String getBorderColor() {
        return "White";
    }
}

public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        System.out.print("Введите длину основания треугольника: ");
        double base = scanner.nextDouble();
        System.out.print("Введите высоту треугольника: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);

        printFigureInfo(circle);
        printFigureInfo(rectangle);
        printFigureInfo(triangle);
    }

    private static void printFigureInfo(Figure figure) {
        System.out.println("Периметр: " + figure.getPerimeter());
        System.out.println("Площадь: " + figure.getArea());
        System.out.println("Цвет заливки: " + figure.getFillColor());
        System.out.println("Цвет границы: " + figure.getBorderColor());
        System.out.println();
    }
}


