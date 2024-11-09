package lesson_5;

// Класс Миска с едой
public class FoodBowl {
    // Количество еды в миске
    private int food;

    // Конструктор
    public FoodBowl(int food) {
        this.food = food;
    }

    // Получить количество еды
    public int getFood() {
        return food;
    }

    // Установить количество еды
    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            System.out.println("Нельзя установить отрицательное количество еды.");
        }
    }

    // Добавить еду в миску
    public void addFood(int amount) {
        this.food += amount;
    }
}

