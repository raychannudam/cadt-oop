package Udam.Lab5.Exercise3;

public class Circle extends Shape {
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    
    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (3.14 * Math.pow(radius, 2));
    }

    public double getPerimeter(){
        return (2*3.14*radius);
    }

    public String toString(){
        return "The circle has radius = " + String.valueOf(radius);
    }
}
