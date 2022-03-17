package ex3;

public class Circle extends Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "A circle with a radius of: "+this.radius+" has an area of "+this.getArea()+" and parameter of "+this.getParameter();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getParameter(){
        return this.radius*2*Math.PI;
    }
}
