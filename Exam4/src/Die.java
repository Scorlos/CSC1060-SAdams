import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private int numSides;
    private int value;

    public Die() {
        this.numSides = 6;
        this.value = 1;
    }

    public Die(int numSides) {
        this.numSides = numSides;
        this.value = 1;
    }

    public void roll() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, this.numSides);
        this.value = randomNum;
    }

    public int getNumSides() {
        return this.numSides;
    }

    public int getValue() {
        return this.value;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Number of Sides: " + this.numSides + " Value: " + this.value;
    }
}
