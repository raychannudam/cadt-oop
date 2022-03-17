package Udam.Lab6.Exercise5;

public class Animal implements Walkable {

    @Override
    public void walkLeft() {
        System.out.println("Animal walks left");
    }

    @Override
    public void walkRight() {
        System.out.println("Animal walks right");
    }

    @Override
    public void Forward() {
        System.out.println("Animal walks forward");
    }

    @Override
    public void Backward() {
        System.out.println("Animal walks backward");
    }

}
