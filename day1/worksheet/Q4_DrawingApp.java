package day1.worksheet;
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

public class Q4_DrawingApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        for (Shape shape : shapes) {
            shape.draw();  // Calls the appropriate overridden method
        }
    }
}
