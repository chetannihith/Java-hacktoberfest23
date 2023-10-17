package hacktoberfest;
import java.util.Scanner;

public class PrintAreaOfShape {

	// Method to print the area of a square
    public static void printAreaOfSquare(double side) {
        double area = side * side;
        System.out.println("Area of square of side " + side + " units is = " + area + " sq. units.");
    }

    // Method to print the area of a rectangle
    public static void printAreaOfRectangle(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of rectangle of length " + length + " units and breadth " 
        					+ breadth + " units is = " + area + " sq. units.");
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for side of square
        System.out.print("Enter the side of the square = ");
        double sqSide = sc.nextDouble();
        printAreaOfSquare(sqSide);
        System.out.println();

        // User input for length and breadth of rectangle
        System.out.print("Enter the length of the rectangle = ");
        double rectLength = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle = ");
        double rectBreadth = sc.nextDouble();
        printAreaOfRectangle(rectLength, rectBreadth);

        // close the scanner
        sc.close();
    }

}
