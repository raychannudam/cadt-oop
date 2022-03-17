package Dara.Lab2;

public class ex13 {
    static double sum(double a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double sum(int a, double b) {
        return a + b;
    }

    static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(2.9, 1.2));
        System.out.println(sum(1.7, 2));
        System.out.println(sum(3, 5.9));
        System.out.println(sum(1.7, 1.2, 12.9));
    }
}
