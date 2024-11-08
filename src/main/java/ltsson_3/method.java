package ltsson_3;

public class method {
    public static void main(String[] args) {
        // Вызов всех методов
        printThreeWords();
        checkSums();
        printColor();
        compareNumbers();
        System.out.println("isSumInRange(8, 7): " + isSumInRange(8, 7));
        checkNumber(5);
        System.out.println("isNegative(-5): " + isNegative(-5));
        printString("Привет!", 3);
        System.out.println("2024 год високосный? " + isLeapYear(2024));
        invertArray();
        fillArray();
        multiplyLessThanSix();
        createDiagonalArray();
        int[] result = createArray(5, 10);
        System.out.print("Созданный массив: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSums() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным.");
        } else {
            System.out.println("Число " + number + " является отрицательным.");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Оригинальный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }

        System.out.println("Инвертированный массив:");
        printArray(array);
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Заполненный массив:");
        printArray(array);
    }

    public static void multiplyLessThanSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 11};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Массив после умножения чисел меньше 6 на 2:");
        printArray(array);
    }

    public static void createDiagonalArray() {
        int n = 5;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - 1 - j) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("Диагональный массив:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        if (len < 0) {
            throw new IllegalArgumentException("Length must be non-negative");
        }
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
