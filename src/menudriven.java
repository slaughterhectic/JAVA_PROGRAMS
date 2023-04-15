import java.util.Scanner;

public class menudriven
{
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1 to calculate area of circle");
        System.out.println("Enter 2 to calculate area of square");
        System.out.println("Enter 3 to calculate area of rectangle");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double r = in.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of circle = " + ca);
                break;

            case 2:
                System.out.print("Enter side of square: ");
                double side = in.nextDouble();
                double sa = side * side;
                System.out.println("Area of square = " + sa);
                break;

            case 3:
                System.out.print("Enter length of rectangle: ");
                double l = in.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double b = in.nextDouble();
                double ra = l * b;
                System.out.println("Area of rectangle = " + ra);
                break;

            default:
                System.out.println("Wrong choice!");
        }
    }
}