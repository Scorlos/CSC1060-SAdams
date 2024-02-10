import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius;
        System.out.print("Enter the radius of a circle: ");
        radius = in.nextDouble();
        System.out.println("Diameter: " + (radius * 2));
        System.out.println("Area: " + ((radius * radius) * Math.PI));
        System.out.println("Circumference: " + (radius * 2 * Math.PI));
    }
}