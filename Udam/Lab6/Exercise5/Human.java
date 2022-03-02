package Udam.Lab6.Exercise5;

public class Human implements Walkable {

    @Override
    public void walkLeft() {
        System.out.println("Human walks left");
    }

    @Override
    public void walkRight() {
        System.out.println("Human walks right");
    }

    @Override
    public void Forward() {
        System.out.println("Human walks forward");
    }

    @Override
    public void Backward() {
        System.out.println("Human walks backward");
    }

    public Human() {
    }

    
}
