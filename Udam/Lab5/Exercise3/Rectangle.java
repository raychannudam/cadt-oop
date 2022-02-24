package Udam.Lab5.Exercise3;

public class Rectangle extends Shape{
    private Double height;
    private Double width;
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle() {
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return (height+width)*2;
    }
    public String toString(){
        return "The right triangle has width = " + String.valueOf(width) + " and height = " + String.valueOf(height);
    }
}
