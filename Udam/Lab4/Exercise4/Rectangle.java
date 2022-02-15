package Udam.Lab4.Exercise4;

public class Rectangle {
    private Double _width;
    private Double _height;
    private String _color;

    public Double getWidth(){
        return this._width;
    }
    public Double height(){
        return this._height;
    }
    public String getColor(){
        return this._color;
    }

    public Rectangle(){}
    public Rectangle(Double width, Double height, String color){
        this._width = width;
        this._height = height;
        this._color = color;
    }
    public Rectangle(Double width, Double height){
        this._width = width;
        this._height = height;    
    }

    public Double getArea(){
        return this._height*this._width;
    }
}
