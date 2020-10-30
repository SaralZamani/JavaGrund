package lab1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {

        while (loop) {
            try {
                switchCase(menu());
            } catch (Exception e) {
                System.out.println("Wrong input, please try again.\n");
                sc.nextLine();
            }
        }

// Circle cirk = new Circle(5);
// Triangle triang = new Triangle(2, 4);
// Rectangle rect = new Rectangle(5, 7);
//
// System.out.println("The circles area with radius " + cirk.getRadie() + " is " + cirk.area());
// System.out.println("The circles perimeter with radius " + cirk.getRadie() + " * 3,14 * 2 = " + cirk.perimeter());
// System.out.println();
// System.out.println("The triangle with base " + triang.getBase() + " * height " + triang.getHeight() + " /2 is " + triang.area());
// System.out.println("The triangle circumference with sqrt(base)" + triang.getBase() + "+ (height) " + triang.perimeter());
// System.out.println();
// System.out.println("The rectangle area with base " + rect.getBase() + " * height " + rect.getHeight() + " = " + rect.area());
// System.out.println("The rectangle parimeter is 2(base " + rect.getBase() + " + height)" + rect.getHeight() + " = " + rect.perimeter());
    }

    public static int menu() {

        System.out.println("Select among shapes: ");
        System.out.println("\n1) Circle");
        System.out.println("\n2) Triangle");
        System.out.println("\n3) Rectangle");
        System.out.println("\n0) Exit");
        int choice = sc.nextInt();

        return choice;
    }

    public static void switchCase(int choice) {
        switch (choice) {
            case 1:
                calculationForCircle();
                break;
            case 2:
                calculationForTriangle();
                break;
            case 3:
                calculationForRectangle();
                break;
            case 0:
                loop = false;
                System.out.println("See you next time!");
                break;
            default:
                if (choice <= -1 || choice >= 4) {
                    System.out.println("Wrong input, please try again.\n");
                }
                switchCase(menu());
        }
    }

    public static void calculationForCircle() {

        System.out.println("\n1. Area");
        System.out.println("\n2. Perimeter");
        System.out.println("\n3. Both");
        int userInput = sc.nextInt();
        if (userInput == 1) {
            System.out.println("Enter value for radius to calculate the area of circle: ");
            double radius = sc.nextDouble();

            Circle circle = new Circle(radius);
            circle.setRadius(radius);
            System.out.println("Circle with radius " + radius + " has area: " + circle.area());
            System.out.println("Thank you for using our application, you are welcome to re-try!\n");
        } else if (userInput == 2) {
            System.out.println("Enter value for radius to calculate the perimeter of circle: ");
            double radius = sc.nextDouble();

            Circle circle = new Circle(radius);
            circle.setRadius(radius);
            System.out.println("Circle with radius " + radius + " has parimeter: " + circle.perimeter());
            System.out.println("Thank you for using our application, you are welcome to re-try!\n");
        } else if (userInput == 3) {
            System.out.println("Enter value for radius to calculate the area and the perimeter of circle: ");
            double radius = sc.nextDouble();

            Circle circle = new Circle(radius);
            circle.setRadius(radius);
            System.out.println("Circle with radius " + radius + " has area: " + circle.area() + " and has perimeter: " + circle.perimeter());
            System.out.println("Thank you for using our application, you are welcome to re-try!\n");
        } else /*if (userInput != 1 || userInput != 2 || userInput != 3) */ {
            System.out.println("Choice not recognizable please pick a valid option.\n");
        }
    }

    public static void calculationForTriangle() {

        System.out.println("\n1. Area");
        System.out.println("\n2. Perimeter");
        System.out.println("\n3. Both");
        int userInput = sc.nextInt();
        System.out.println();
        if (userInput == 1) {
            System.out.println("Enter value for base to calculate the area of right-angled triangle: ");
            double baseValue = sc.nextDouble();
            System.out.println("Enter value for height to calculate the area of right-angled triangle: ");
            double heightValue = sc.nextDouble();

            Triangle triangle = new Triangle(baseValue, heightValue);
            triangle.setBase(baseValue);
            triangle.setHeight(heightValue);
            System.out.println("Triangle with base " + baseValue + " and height " + heightValue + " and has area: " + triangle.area());
            System.out.println("Thank you for using our application, you are welcome to re-try!\n");
        } else if (userInput == 2) {
            System.out.println("Enter value for base to calculate the perimeter of right-angled triangle: ");
            double baseValue = sc.nextDouble();
            System.out.println("Enter value for height to calculate the perimeter of right-angled triangle: ");
            double heightValue = sc.nextDouble();

            Triangle triangle = new Triangle(baseValue, heightValue);
            triangle.setBase(baseValue);
            triangle.setHeight(heightValue);
            System.out.println("Triangle with base " + baseValue + " and height " + heightValue + " and has perimeter: " + triangle.perimeter());
            System.out.println("Thank you for using our application you are welcome to re-try!\n");
        } else if (userInput == 3) {
            System.out.println("Enter value for base to get the calculation of area and perimeter of right-angled triangle: ");
            double baseValue = sc.nextDouble();
            System.out.println("Enter value for height to get the calculation of area and perimeter of right-angled triangle: ");
            double heightValue = sc.nextDouble();

            Triangle triangle = new Triangle(baseValue, heightValue);
            triangle.setBase(baseValue);
            triangle.setHeight(heightValue);
            System.out.println("Triangle with base " + baseValue + " and height " + heightValue + " and has area: " + triangle.area() + " and perimeter " + triangle.perimeter());
            System.out.println("Thank you for using our application you are welcome to re-try!\n");
        } else /*if (userInput != 1 || userInput != 2 || userInput != 3)*/ {
            {
                System.out.println("Choice not recognizable please pick a number from the display above.\n");
            }
        }
    }

    public static void calculationForRectangle() {
        System.out.println("\n1. Area");
        System.out.println("\n2. Perimeter");
        System.out.println("\n3. Both");
        int userInput = sc.nextInt();
        if (userInput == 1) {
            System.out.println("Enter value for base to calculate the area of rectangle: ");
            double baseValue = sc.nextDouble();
            System.out.println("Enter value for height to calculate the area of rectangle: ");
            double heightValue = sc.nextDouble();

            Rectangle rectangle = new Rectangle(baseValue, heightValue);
            rectangle.setBase(baseValue);
            rectangle.setHeight(heightValue);
            System.out.println("Rectangle with base " + baseValue + " and height " + heightValue + " has area: " + rectangle.area());
            System.out.println("Thank you for using our application, you are welcome to re-try!\n");
        } else if (userInput == 2) {
            System.out.println("Enter value for base to calculate the perimeter of rectangle: ");
            double baseValue = sc.nextDouble();
            System.out.println("Enter value for height to calculate the perimeter of rectangle: ");
            double heightValue = sc.nextDouble();

            Rectangle rectangle = new Rectangle(baseValue, heightValue);
            rectangle.setBase(baseValue);
            rectangle.setHeight(heightValue);
            System.out.println("Rectangle with base " + baseValue + " and height " + heightValue + " has perimeter: " + rectangle.perimeter());
            System.out.println("Thank you for using our application, you are welcome to re-try!\n");
        } else if (userInput == 3) {
            System.out.println("Enter value for base to calculate the area and perimeter of rectangle: ");
            double baseValue = sc.nextDouble();
            System.out.println("Enter value for height to calculate the area and perimeter of rectangle: ");
            double heightValue = sc.nextDouble();

            Rectangle rectangle = new Rectangle(baseValue, heightValue);
            rectangle.setBase(baseValue);
            rectangle.setHeight(heightValue);
            System.out.println("Rectangle with base " + baseValue + " and height " + heightValue + " has area: " + rectangle.area() + " and has perimeter: " + rectangle.perimeter());
            System.out.println("Thank you for using our application, you are welcome to re-try!\n");
        } else /*if (userInput != 1 || userInput != 2 || userInput != 3)*/ {
            {
                System.out.println("Choice not recognizable please pick a number from the display above.\n");
            }
        }
    }
}
