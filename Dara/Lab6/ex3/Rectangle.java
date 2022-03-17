package ex3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle extends MyShape{
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return "A rectangle with a width of: "+this.width+" and height of "+this.height+ " has an area of "+this.getArea()+" and parameter of "+this.getPerimeter();
    }

    public static Rectangle addData(){
        double width, height;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = input2.nextDouble();
        System.out.print("Enter height: ");
        height = input2.nextDouble();
        
        Rectangle newRectangle = new Rectangle(width, height);
        return newRectangle;
    }
    
}
