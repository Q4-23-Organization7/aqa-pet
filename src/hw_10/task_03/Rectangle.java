package hw_10.task_03;

class Rectangle extends Shape {
    private static final String NAME = "Rectangle";
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return NAME;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    // Getters and setters for width and height omitted for brevity

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}


