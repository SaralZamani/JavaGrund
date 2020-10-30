package lab1;

public class Rectangle {

    private static double base;
    private static double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public static double getBase() {
        return base;
    }

    public static void setBase(double base) {
        Rectangle.base = base;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Rectangle.height = height;
    }

    public static double area() {
        double area = base * height;
        return area;
    }

    public static double perimeter() {
        double perimeter = 2 * (base + height);
        return perimeter;
    }
}
