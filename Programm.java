
import java.util.Random;

public class Programm {
    private String name; // Имя
    private int age; // Возраст
    private int hp; // Здоровье в процентах
    private boolean isAlive; // Жив ли человек
    private static final Random rand = new Random();

    public Programm(String name) {
        this.name = name;
        this.age = generRandAge(); // Случайный возраст от 15 до 50
        this.hp = generRandHealth(); // Состояние здоровья от 10 до 100
        this.isAlive = true; // По умолчанию считается, что человек жив
    }
    private int generRandAge() {
        return age;
    }
    private int generRandHealth() {
        return hp;
    }
    public boolean isAlive() {
        return isAlive;
    }
    
    public void talk(){
        
    }

    public static void main(String[] args) {
        
    }
    
}
// реализовать вызов методов в данном файле