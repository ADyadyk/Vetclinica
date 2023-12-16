import java.time.LocalDate;
import java.util.List;

/**
 Курица умеет плавать, бегать и чуть-чуть летать
 */
public class Hen extends Animal{
    public Hen(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }

    @Override
    public void fly() {
        System.out.println("Я очень плохо летаю!!!");
    }
}
