import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempF;
        double tempC;
        double tempK;
        System.out.print("Enter a Temperature in Fahrenheit: ");
        tempF = in.nextInt();
        tempC = (tempF - 32.0) * (5.0 / 9.0);
        tempK = tempC + 273.15;
        System.out.println("Celsius: " + tempC);
        System.out.println("Kelvin: " + tempK);
    }
}