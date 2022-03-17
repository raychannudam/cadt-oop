package Udam.Lab6.Exercise8;

public class Tiger implements MoveAble {
    private String color;
    private Double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Tiger(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void moveLeft() {
        System.out.println("Cat moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Cat moves right");
    }

    @Override
    public void moveUp() {
        System.out.println("Cat moves up");
    }

    @Override
    public void moveDown() {
        System.out.println("Cat moves down");
    }

    public String toString() {
        return ("Color: " + this.color + ", Weight: " + this.weight);
    }

}
