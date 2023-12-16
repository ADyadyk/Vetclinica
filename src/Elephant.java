import java.time.LocalDate;
import java.util.List;

/**
 Слон умеет плавать, бегать и НЕ УМЕЕТ летать
 */
public class Elephant extends Animal{
    public Elephant(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }

    @Override
    public void fly() {
        System.out.println("Я точно никогда не смогу взлететь!!!");
    }
}
