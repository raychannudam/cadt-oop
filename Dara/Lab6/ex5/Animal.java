package ex5;

public class Animal implements Walkable {
    public void walkLeft() {
        System.out.println("Animal Walk left");
    };

    public void walkRight() {
        System.out.println("Animal Walk right");
    };

    public void walkBackward() {
        System.out.println("Animal Walk backward");
    };

    public void walkForward() {
        System.out.println("Animal Walk forward");
    };
}
