package Udam.Lab4.Exercise2;

public class MainforDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tidu");
        System.out.println(dog1.getName());
        Dog dog2 = new Dog();
        dog2.setNAme("Tito");
        System.out.println(dog2.getName());
    }
}
