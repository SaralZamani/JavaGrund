package lab1;

public class Circle {

    private static final double PI = 3.14;
    private static double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        double area = radius * radius * PI;
        return area;
    }

    public double perimeter() {
        double perimeter = (radius * PI) * 2;
        return perimeter;
    }

    public Circle() {

    }
}
