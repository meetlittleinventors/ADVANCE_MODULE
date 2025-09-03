interface Shape {
    void draw(); // Abstract method

    // Default method introduced in Java 8
    default String getArea() {
        return "Area calculation is not implemented for this shape.";
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    // Optional: overriding the default method
    @Override
    public String getArea() {
        return "Area of the circle is being calculated...";
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        
        myCircle.draw();
        System.out.println(myCircle.getArea());
    }
}
