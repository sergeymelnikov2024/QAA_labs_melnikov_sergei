package lesson_6;

// Класс исключения для обработки ошибок размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Класс исключения для обработки ошибок в данных массива
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArrayProcessor {

    // Метод для подсчета суммы элементов массива
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка, что размер массива 4x4
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4"); // Генерируем исключение, если размер неправильный
        }

        int sum = 0; // Переменная для хранения суммы элементов

        // Перебор элементов массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    // Преобразование строки в целое число и добавление к сумме
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Генерируем исключение, если не удается преобразовать строку в число
                    throw new MyArrayDataException("Некорректное значение в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        return sum; // Возвращаем сумму элементов массива
    }
}
