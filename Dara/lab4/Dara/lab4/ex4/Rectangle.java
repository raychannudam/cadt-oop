package Dara.lab4.ex4;

public class Rectangle {
    public Double width;
    public Double height;
    public String color;

    Rectangle(){
        this.width=0.0;
        this.height=0.0;
    }

    Rectangle(double _width, double _height){
        this.width = _width;
        this.height = _height;
    }
    Rectangle (double _width, double _height, String _color){
        this.width = _width;
        this.height = _height;
        this.color = _color;
    }

    Double getWidth(){
        return this.width;
    }

    Double getHeight(){
        return this.height;
    }

    String getColor(){
        return this.color;
    }

    Double getArea(){
        return this.width*this.height;
    }

    void printRec(){
        System.out.println("Rectangle with color of "+this.color+" with Width of: "+this.width+" multiply with "+this.height+" = "+getArea());
    }
}
