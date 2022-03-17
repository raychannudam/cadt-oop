package Udam.Lab5.Exercise5;

public class Line {
    Point p1 = new Point();
    Point p2 = new Point();

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line() {
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public String toString() {
        return "This line is from coordinate p1(" + String.valueOf(p1.getX()) + ", " + String.valueOf(p1.getY()) + ") and p2(" + String.valueOf(p2.getX()) + ", " + String.valueOf(p2.getY()) + ")";
    }
}
