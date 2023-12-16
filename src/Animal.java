import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccination;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccination = vaccination;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    private void wakeup(){
        System.out.println("Animal is wakeup!");
    }
    public void wakeup(int time){
        System.out.println("Animal is wakeup in " + time);
    }
    private void eat(){
        System.out.println("Animal ate");
    }
    private void play(){
        System.out.println("Animal played");
    }
    private void sleep(){
        System.out.println("Animal sleeping");
    }
    public void lifeCycle(){
        wakeup();
        eat();
        play();
        sleep();
    }
    // Homework methods:

    public void toGo(){
        System.out.println("Animal go!");
    }
    public void fly(){
        System.out.println("Animal fly!");
    }
    public void swim(){
        System.out.println("Animal swim!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccination=" + vaccination +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
