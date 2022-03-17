package ex8;

public class Tiger implements Movable{
    String color;
    double weight;
    
    public Tiger(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String toString(){
        return "The tiger has the color of "+this.getColor()+" "+this.getWeight();
    }
    //movable
    public void moveLeft(){System.out.println("The tiger with the color of "+this.getColor()+" "+this.getWeight()+" moves left.");}
    public void moveRight(){System.out.println("The tiger with the color of "+this.getColor()+" "+this.getWeight()+" moves Right.");}
    public void moveUp(){System.out.println("The tiger with the color of "+this.getColor()+" "+this.getWeight()+" moves Up.");}
    public void moveDown(){System.out.println("The tiger with the color of "+this.getColor()+" "+this.getWeight()+" moves Down.");}
}
