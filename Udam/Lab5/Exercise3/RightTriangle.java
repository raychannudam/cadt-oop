package Udam.Lab5.Exercise3;

public class RightTriangle extends Shape {
    private Double width;
    private Double height;
    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public RightTriangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }
    public RightTriangle() {
    }
    public double getArea(){
        return (width*height)/2;
    }
    public double getPerimeter(){
        return (width+height+Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2)));
    }
    public String toString(){
        return "The right triangle has width = " + String.valueOf(width) + " and height = " + String.valueOf(height);
    }
}
