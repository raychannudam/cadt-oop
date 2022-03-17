package ex5;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(12, 12);
        Point p2 = new Point(01, 01);
        Point p3 = new Point(5,2);
        Line l1=  new Line(p1, p2);
        Line l2 = new Line(p3, p1);
        System.out.println(l1);
        System.out.println(l2);
        
    }
}
