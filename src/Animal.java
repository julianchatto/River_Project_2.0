import java.util.Random;

public class Animal {
    private int age;
    private double hunger;
    private String Animaltype;
    Animal(int a, String type) {
        this.age = a;
        this.hunger = 1;
        this.Animaltype = type;
    }

    double reproducibilityCalc() {
        Random r = new Random();
        double repro = r.nextDouble(1);

        return repro;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public String getAnimaltype() {
        return Animaltype;
    }
}
