public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(6,4,4);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle1.calculatePerimeter());
    }
}