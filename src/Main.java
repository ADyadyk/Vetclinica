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

        System.out.println("Homework:");
        // Создадим экземпляры новых классов:
        Goose gaga = new Goose("Gaga",
                LocalDate.of(1994, 12, 24),
                new ArrayList<>(), "Насморк", "Валентина Павловна");
        Hen cococo = new Hen("Cococo",
                LocalDate.of(2001, 12, 24),
                new ArrayList<>(), "Насморк", "Валентина Павловна");
        Elephant tuzik = new Elephant("Tuzik",
                LocalDate.of(2010, 12, 24),
                new ArrayList<>(), "Насморк", "Сергей Иванович");
        Fish shark = new Fish("Акула",
                LocalDate.of(2010, 12, 24),
                new ArrayList<>(), "Сердечная недостаточность", "Виталик");

        // Добавим их в список больных животных:
        animals.add(gaga);
        animals.add(cococo);
        animals.add(tuzik);
        animals.add(shark);
        System.out.println("Посмотрим, что умеет делать наша курица Cococo:");
        cococo.fly();
        cococo.toGo();
        cococo.swim();

        System.out.println("_____________________________");
        System.out.println("Посмотрим, что умеет делать наша рыба Shark:");
        shark.swim();
        shark.fly();
        shark.toGo();

        System.out.println("_____________________________");
        System.out.println("Посмотрим, что умеет делать наш гусь Gaga:");
        gaga.fly();
        gaga.swim();
        gaga.toGo();

        System.out.println("_____________________________");
        System.out.println("Посмотрим, что умеет делать наш слон Tuzik:");
        tuzik.swim();
        tuzik.toGo();
        tuzik.fly();
        // Добавил живтоных из классной работы:
        System.out.println("_______Из классной работы______");
        System.out.println("Посмотрим, что умеет делать наш кот Barsik:");
        barsik.swim();
        barsik.toGo();
        barsik.fly();

        System.out.println("_______Из классной работы______");
        System.out.println("Посмотрим, что умеет делать наш орел Kesha:");
        eagle.swim();
        eagle.toGo();
        eagle.fly();
    }
}