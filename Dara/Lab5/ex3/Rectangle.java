package ex3;

public class Rectangle extends Shape{
    public double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return "A rectangle with a width of: "+this.width+" and height of "+this.height+ " has an area of "+this.getArea()+" and parameter of "+this.getParameter();
    }

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
    
    public double getArea(){
        return this.width*this.height;
    }
    public double getParameter(){
        return 2*(this.width+this.height);
    }
}
