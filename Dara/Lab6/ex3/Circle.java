package ex3;

import java.util.Scanner;

public class Circle extends MyShape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    public String toString(){
        return "A Circle with a width of: "+this.radius+" has an area of "+this.getArea()+" and parameter of "+this.getPerimeter();
    }

    public static Circle addData(){
        double radius;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = input2.nextDouble();
        
        Circle newCircle = new Circle(radius);
        return newCircle;
    }
}
