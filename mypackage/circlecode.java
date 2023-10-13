import mypack.Circle;  // Import the Circle class from the "mypack" package.

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle myCircle = new Circle(5.0);

        // Access methods from the Circle class
        double radius = myCircle.getRadius();
        double area = myCircle.calculateArea();

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
    
}
