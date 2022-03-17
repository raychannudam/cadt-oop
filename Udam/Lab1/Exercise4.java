package Udam.Lab1;

public class Exercise4 {
    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        short c;

        System.out.println("Before swap");
        System.out.println("a : " + a + ", b: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("After swap");
        System.out.println("a : " + a + ", b: " + b);

    }
}


