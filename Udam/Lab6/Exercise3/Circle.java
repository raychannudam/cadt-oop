package Udam.Lab6.Exercise3;

public class Circle extends MyShape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Double getArea() {
        return (3.14 * Math.pow(radius, 2));
    }

    public Double getPerimeter() {
        return (2 * 3.14 * radius);
    }

    public String toString() {
        return ("Radius: " + this.radius + ". With area: " + getArea() + " and perimeter: " + getPerimeter());
    }
}
