package Main.java.lab5;


// Define the Rectangle class
class Rectangle {
    // Attributes of the Rectangle class
    private double width;
    private double height;
    
    
    // Constructor to initialize the attributes
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // Method to calculate the area
    public double getArea() {
        return width * height;
    }
    
    // Method to calculate the perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    // Method to get the width
    public double getWidth() {
        return width;
    }
    
    // Method to get the height
    public double getHeight() {
        return height;
    }
    
    // Method to set the width
    public void setWidth(double width) {
        this.width = width;
    }
    
    // Method to set the height
    public void setHeight(double height) {
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        
        // Calculate and print the area
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
        
        // Calculate and print the perimeter
        double perimeter = rectangle.getPerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
