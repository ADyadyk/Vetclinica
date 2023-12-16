import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{
    public Eagle(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }
}
