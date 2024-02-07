package hw_10.task_03;

import java.util.Objects;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract String getName();

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String paint(String color) {
        this.color = color;
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}