import java.time.LocalDate;
import java.util.List;

/**
 Рыба умеет плавать, но НЕ УМЕЕТ ходить и летать
 */
public class Fish extends Animal{
    public Fish(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }

    @Override
    public void fly() {
        System.out.println("Я вообще не летаю!");
    }

    @Override
    public void toGo() {
        System.out.println("Я вообще не хожу!");
    }
}
