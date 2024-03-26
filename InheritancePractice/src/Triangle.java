public class Triangle extends Shape{
    double side1;
    double side2;
    double side3;
    double altitude;
    public Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3= side3;
        this.altitude = (side2/side1)*2;
    }
    @Override
    public double calculateArea() {
        return (side1* altitude)/2;
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }
}
