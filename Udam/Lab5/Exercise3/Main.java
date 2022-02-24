package Udam.Lab5.Exercise3;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(1.50);
        Rectangle r = new Rectangle(34.50, 54.6);
        RightTriangle rt = new RightTriangle(5.60, 8.34);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        System.out.println(rt);
        System.out.println("Area: " + rt.getArea());
        System.out.println("Perimeter: " + rt.getPerimeter());
    }
}
