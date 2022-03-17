package Udam.Lab3;

public class Exercise14 {
    public static void main(String[] args) {
        helloForLoop();
        helloWhileLoop();
        helloDoWhileLoop();
    }

    public static void helloForLoop() {
        for (int i = 0; i < 10; i++) System.out.println("helloForLoop");
    }

    public static void helloWhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println("helloWhileLoop");
            i++;
        }
    }

    public static void helloDoWhileLoop() {
        int i = 0;
        do {
            System.out.println("helloDoWhileLoop");
            i++;
        } while (i < 10);
    }
}
