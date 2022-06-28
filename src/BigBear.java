public class BigBear extends Animal{
    private double reproducibility;

    BigBear() {
        super(15, "Big Bear");
        this.reproducibility =  reproducibilityCalc();

    }

    public double getReproducibility() {
        return reproducibility;
    }

}
