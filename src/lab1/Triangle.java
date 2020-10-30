package lab1;

public class Triangle {

    private static double base;
    private static double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public static double getBase() {
        return base;
    }

    public static void setBase(double base) {
        Triangle.base = base;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Triangle.height = height;
    }

    public static double area() {
        double area = (base * height) / 2;
        return area;
    }

    public static double perimeter() {
        double perimeter = Math.sqrt((base * base) + (height * height)) + base + height;
        //double perimeter = base + height + c;
        return perimeter;
    }

    public Triangle() {

    }
}
