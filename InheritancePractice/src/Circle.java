public class Circle extends Shape{
    double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return (radius*radius)*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius*2*Math.PI;
    }
}
