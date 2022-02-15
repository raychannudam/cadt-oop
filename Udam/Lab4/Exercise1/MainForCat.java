package Udam.Lab4.Exercise1;

public class MainForCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1._Color = "yellow";
        cat1.setName("kosal");
        cat1.cry();
        System.out.println("My cat name: " + cat1.getName());
    }
}
