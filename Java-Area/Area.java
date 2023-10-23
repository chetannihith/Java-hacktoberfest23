import java.util.Scanner;

public class Area{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the shape (1 for square, 2 for rectangle):");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the side length of the square:");
                double length = sc.nextInt();
                AreaCalculate square = new AreaCalculate(length);
                square.calculateSquareArea();
                break;
            case 2:
                System.out.println("Enter the length of the rectangle:");
                double r_length = sc.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double r_width = sc.nextDouble();
                AreaCalculate rectangle = new AreaCalculate(r_length,r_width);
                rectangle.calculateRectangleArea();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

class AreaCalculate{
    double length;
    double width;
    
    // Constructor Overloaded for square or Rectangle.

    AreaCalculate(double length) {
        this.length = length;
    }

    AreaCalculate(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateSquareArea() {
        if(length < 0){
            System.out.println("Invalid Length Entered");
        }
        else{
            double area = length * length;
            System.out.println("Area of the square : "+area);
        }
    }

    void calculateRectangleArea() {
         if(length < 0 || width < 0){
            System.out.println("Invalid Dimensions Entered");
        }
        else{
            double area = length * width;
            System.out.println("Area of the Rectangle : "+area);
        }
    }


}