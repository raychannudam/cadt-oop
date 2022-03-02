package Udam.Lab6.Exercise4;

import Udam.Lab6.Exercise3.Circle;
import Udam.Lab6.Exercise3.MyShape;
import Udam.Lab6.Exercise3.Rectangle;

public class MyShapeOp {
    public MyShape[] shapeList = new MyShape[10];
    int index=0;
    public MyShape addShape(double width, double height){
        for(int i=0; i<shapeList.length; i++){
            if(shapeList[i] == null){
                index = i;
                break;
            }
        }
        shapeList[index] = new Rectangle(width, height);
        return shapeList[index];
    }

    public MyShape addShape(double radius){
        for(int i=0; i<shapeList.length; i++){
            if(shapeList[i] == null){
                index = i;
                break;
            }
        }
        shapeList[index] = new Circle(radius);
        return shapeList[index];
    }

    public MyShape searchShape(double area){
        for(MyShape myshape: shapeList){
            if(myshape != null){
                if(myshape.getArea() == area){
                    return myshape;
                }
            }
        }
        return null;
    }

    public void printAll(){
        for(MyShape myshape: shapeList){
            System.out.println(myshape);
        }
    }
}
