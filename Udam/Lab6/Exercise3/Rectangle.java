package Udam.Lab6.Exercise3;

public class Rectangle extends MyShape {
    private double width;
    private double height;
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
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle() {
    }
    public Double getArea(){
        return width*height;
    }
    public Double getPerimeter(){
        return (width+height)*2;
    }
    public String toString(){
        return ("Widht: "+this.width+", Height: "+this.height+". With area: "+getArea()+" and perimeter: "+getPerimeter());
    }
}
