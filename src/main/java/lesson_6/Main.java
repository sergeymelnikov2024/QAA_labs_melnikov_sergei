package lesson_6;

public class Main {
    public static void main(String[] args) {
        // Создание корректного двумерного массива строк
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Создание двумерного массива строк с некорректным размером
        String[][] invalidSizeArray = {
                {"1", "2"},
                {"3", "4"},
        };

        // Создание двумерного массива строк с некорректными данными
        String[][] invalidDataArray = {
                {"1", "2", "three", "4"}, // Здесь "three" не является числом
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Попытка обработки корректного массива
        try {
            int result = ArrayProcessor.sumArray(validArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            // Обработка исключения на случай некорректного размера массива
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDataException e) {
            // Обработка исключения на случай некорректных данных массива
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Пример вызова с некорректным размером массива
        try {
            ArrayProcessor.sumArray(invalidSizeArray);
        } catch (MyArraySizeException e) {
            // Обработка исключения на случай некорректного размера
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDataException e) {
            // Обработка исключения на случай некорректных данных
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Пример вызова с некорректными данными в массиве
        try {
            ArrayProcessor.sumArray(invalidDataArray);
        } catch (MyArraySizeException e) {
            // Обработка исключения на случай некорректного размера
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDataException e) {
            // Обработка исключения на случай некорректных данных
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
