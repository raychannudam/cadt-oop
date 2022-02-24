package Udam.Lab5.Exercise5;

public class Main {
    public static void main(String[] args) {
        Point p1L1 = new Point(3.45, 6.75);
        Point p2L1 = new Point(8.98, 4.67);
        Point p1L2 = new Point(9.56, 8.56);
        Point p2L2 = new Point(1.50, 3.87);
        Line l1  = new Line(p1L1, p2L1);
        Line l2 = new Line(p1L2, p2L2);
        System.out.println(l1);
        System.out.println(l2);
    }
}
