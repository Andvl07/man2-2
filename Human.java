import java.util.Random;


public class Human {
    private String name; // Имя
    private int age; // Возраст
    private int hp; // Здоровье в процентах
    private boolean isAlive; // Жив ли человек

    // Массив имен
    private static String[] names = {
            "Дима", "Ксения", "Руслан", "Анастасия", "Илья",
            "Ольга", "Дмитрий", "Екатерина", "Максим", "Татьяна",
            "Яна", "Алёна", "Даниил", "Степан", "Егор", "Никита"
    };

    // Конструктор
    public Human(String name) {
        this.name = name;
        this.age = generRandAge(); // Случайный возраст от 15 до 50
        this.hp = generRandHealth(); // Состояние здоровья от 10 до 100
        this.isAlive = true; // По умолчанию считается, что человек жив
    }

    // Метод генерации случайного возраста от 15 до 50
    private int generRandAge() {
        Random random = new Random();
        return random.nextInt(36) + 15; // Возраст от 15 до 50
    }

    // Метод генерации здоровья от 10 до 100
    private int generRandHealth() {
        Random random = new Random();
        return random.nextInt(91) + 10; // Здоровье от 10 до 100
    }

    // Метод Talk(ответ персонажа зависит от различных факторов)
    public void talk() {
        Random random = new Random();
        int dialogueOption = random.nextInt(3) + 1; // Случайное число от 1 до 3
        if (isAlive) {
            switch (dialogueOption) {
                case 1:
                    System.out.println(getGreeting() + ", рад(а) познакомиться.");
                    break;
                case 2:
                    System.out.println("Мне " + age + " лет. А тебе?");
                    break;
                case 3:
                    if (hp >= 50) {
                        System.out.println("Да я здоров(а) как бык!");
                    } else {
                        System.out.println("Со здоровьем у меня хреново, дожить бы до " + (age + 10) + " лет.");
                    }
                    break;
            }
        } else {
            System.out.println(name + " мертв(а) и не может говорить.");
        }
    }

    // Метод для определения обращения (мужское / женское)
    private String getGreeting() {
        // Определение пола по имени
        String[] femaleNames = { "Яна", "Ксения", "Ольга", "Анастасия", "Татьяна", "Екатерина", "Алёна" };
        for (String femaleName : femaleNames) {
            if (name.equals(femaleName)) {
                return "Привет, меня зовут " + name; // Женское имя
            }
        }
        return "Привет, меня зовут " + name; // Мужское имя
    }

    // Метод Go (прогулка человека по городу. Не будет совершать при болезни или после смерти)
    public void go() {
        if (isAlive) {
        if (hp   >= 40) {
       System.out.println(name + " мирно прогуливается по городу.");
            } else {
                System.out.println(name + " болен(льна) и не может прогуливаться по городу.");
            }
        } else {
            System.out.println(name + " не может идти, он умер(ла).");
        }
    }

    // Метод Kill (убийство )
    public void kill() {
        if (isAlive) {
            isAlive = false;
            hp = 0; // Здоровье при смерти
            System.out.println(name + " умер(ла).");
        } else {
            System.out.println(name + " уже мертв(а). Создадим нового человека.");
        }
    }

    // Метод IsAlive
    public boolean isAlive() {
        return isAlive;
    }
}

    
       
