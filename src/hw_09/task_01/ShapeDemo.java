package hw_09.task_01;

public class ShapeDemo {

    public static void main(String[] args) {

        Shape[] shape = {new Rectangle(8, 12),
                         new Triangle(5, 8, 5),
                         new Circle(10)};

        for (Shape sh : shape)
            System.out.println(sh.getName() + " Area = " + sh.calculateArea() + "; Perimeter = " + sh.calculatePerimeter());

    }
}

