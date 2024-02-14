import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius;
        System.out.print("Enter the radius of a circle: ");
        radius = in.nextDouble();
        Diameter(radius);
        Area(radius);
        Circumference(radius);
    }

    public static void Diameter (double radius) {
        System.out.println("Diameter: " + (radius * 2));
    }

    public static void Area (double radius) {
        System.out.println("Area: " + ((radius * radius) * Math.PI));
    }

    public static void Circumference (double radius) {
        System.out.println("Circumference: " + (radius * 2 * Math.PI));
    }
}