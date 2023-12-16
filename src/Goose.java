import java.time.LocalDate;
import java.util.List;

/**
 Гусь умеет летать, плавать и бегать
 */
public class Goose extends Animal{
    public Goose(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }
}
