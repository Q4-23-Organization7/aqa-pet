package hw_10.task_03;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle("blue", 8, 12),
                new Triangle("red", 5, 8, 5),
                new Circle("green", 10)};

        for (Shape shape : shapes)
            System.out.println(shape.getName() + " Area = " + shape.calculateArea() + "; Perimeter = " + shape.calculatePerimeter());
    }
}
