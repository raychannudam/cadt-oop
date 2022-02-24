package Udam.Lab5;

import Udam.Lab5.Exercise3.Rectangle;
import Udam.Lab5.Exercise3.Circle;
import Udam.Lab5.Exercise3.RightTriangle;
import Udam.Lab5.Exercise3.Shape;

public class Exercise4 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Circle c1 = new Circle(1.50);
        RightTriangle rt = new RightTriangle(5.60, 8.34);
        Rectangle r = new Rectangle(4.67, 5.78);
        Circle c2 = new Circle(6.89);
        Circle c3 = new Circle(9.56);
        shapes[0] = c1;
        shapes[1] = r;
        shapes[2] = c2;
        shapes[3] = rt;
        shapes[4] = c3;

        for(Shape shape: shapes){
            System.out.println(shape);
        }
        
    }
}
