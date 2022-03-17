package ex5;

public class Human implements Walkable {
    public void walkLeft() {
        System.out.println("Human Walk left");
    };

    public void walkRight() {
        System.out.println("Human Walk right");
    };

    public void walkBackward() {
        System.out.println("Human Walk backward");
    };

    public void walkForward() {
        System.out.println("Human Walk forward");
    };
}
