package Udam.Lab6.Exercise5;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.walkLeft();
        human.walkRight();
        human.Forward();
        human.Backward();

        Animal animal = new Animal();
        animal.walkLeft();
        animal.walkRight();
        animal.Forward();
        animal.Backward();
    }
}
