public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(6,4,4);
        Rectangle rectangle1 = new Rectangle(5,8);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle1.calculatePerimeter());
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
    }
}