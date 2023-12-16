import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik",
                LocalDate.of(1990, 1, 1),
                new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        Animal eagle = new Eagle("Kesha",
                LocalDate.of(2000, 1, 1),
                new ArrayList<>(), "Chumka", "Boss");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
//        eagle.wakeup();
        eagle.wakeup(3);

        System.out.println("===========================");
        barsik.lifeCycle();
    }
}