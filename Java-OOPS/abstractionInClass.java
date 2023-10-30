// Abstract class
abstract class Shape {
    // Concrete method
    public void displayArea() {
        System.out.println("Area calculation is abstract.");
    }

    // Abstract method, to be implemented by subclasses
    public abstract double calculateArea();
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.displayArea(); // Calls the concrete method
        System.out.println("Circle area: " + circle.calculateArea());

        rectangle.displayArea(); // Calls the concrete method
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
