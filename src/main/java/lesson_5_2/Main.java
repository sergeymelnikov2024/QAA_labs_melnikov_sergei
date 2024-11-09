package lesson_5_2;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса Figures
        Figures figures = new Figures();

        // Создаем экземпляры фигур с помощью экземпляра класса Figures
        Figures.Shape circle = figures.new Circle(5, "Красный", "Черный");
        Figures.Shape rectangle = figures.new Rectangle(4, 6, "Зеленый", "Синий");
        Figures.Shape triangle = figures.new Triangle(3, 4, 5, "Желтый", "Розовый");

        // Выводим информацию о круге
        System.out.println("Круг:");
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());

        // Выводим информацию о прямоугольнике
        System.out.println("\nПрямоугольник:");
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Цвет заливки: " + rectangle.getFillColor());
        System.out.println("Цвет границы: " + rectangle.getBorderColor());

        // Выводим информацию о треугольнике
        System.out.println("\nТреугольник:");
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Цвет заливки: " + triangle.getFillColor());
        System.out.println("Цвет границы: " + triangle.getBorderColor());
    }
}