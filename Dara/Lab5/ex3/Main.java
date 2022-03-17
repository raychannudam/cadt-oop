package ex3;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape circle = new Circle(12.20);
        Shape rect = new Rectangle(10.2, 10.9);
        System.out.println(shape1);
        System.out.println(circle);
        System.out.println(rect);
    }
}
