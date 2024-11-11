import java.util.Random;
import java.util.Scanner;


public class Human {
    private String name; // Имя
    private int age;     // Возраст
    private int hp;  // Здоровье в процентах
    private boolean isAlive; // Жив ли человек

    // имена
    private static String[] names = {
        "Иван", "Анна", "Петр", "Мария", "Алексей",
        "Ольга", "Дмитрий", "Екатерина", "Сергей", "Татьяна"
};

    // Конструктор
    public Human(String name) {
        this.name = name;
        this.age = generateRandomAge(); // Случайный возраст от 15 до 50
        this.hp = generateRandomHealth(); // Состояние здоровья от 10 до 100
        this.isAlive = true; // По умолчанию считается, что человек жив
    }

    // Метод генерации случайного возраста от 15 до 50
    private int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(36) + 15; // Возраст от 15 до 50
    }

    // Метод генерации здоровья от 10 до 100
    private int generateRandomHealth() {
        Random random = new Random();
        return random.nextInt(91) + 10; // Здоровье от 10 до 100
    }
}

    


