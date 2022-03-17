package ex4;

import ex3.Circle;
import ex3.Rectangle;
import ex3.Shape;

public class Main {
public static void main(String[] args) {
    
    Shape rect1 = new Rectangle(12.0, 12.0);
    Shape cir1 = new Circle(21);
    Shape cir2 = new Circle(2);
    Shape rect2 = new Rectangle(01, 01);
    Shape rect3 = new Rectangle(02, 02);
    Shape[] shapes = {rect1, cir1, cir2, rect2, rect3 };
    for(Shape shape : shapes){
        System.out.println(shape);
    }
}
}
