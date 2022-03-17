package ex1;
public class catMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("kitty");
        cat.color = "white";
        cat.cry();
        System.out.println(cat.getName()+" is hello-ing you");
    }
}