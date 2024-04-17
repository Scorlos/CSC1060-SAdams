import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(appendNTimes("dog", 5));
        System.out.println(powerOf2GreaterThanN(127));
    }

    public static String appendNTimes(String phrase, int numOfTimes)
    {
        if (numOfTimes >= 1) {
            return phrase + appendNTimes(phrase, numOfTimes - 1);
        }
        return "";
    }

    public static int powerOf2GreaterThanN(int num) {
        return powerOf2(num, 1);
    }

    public static int powerOf2(int num, int power) {
    if (num < Math.pow(2,power)) {
        return (int) Math.pow(2,power);
        }
    return powerOf2(num, power + 1);
    }
}