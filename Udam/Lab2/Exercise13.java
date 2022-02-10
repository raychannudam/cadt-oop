package Udam.Lab2;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println(sum(1.45d, 2));
        System.out.println(sum(1.45d, 2.34d));
        System.out.println(sum(1, 2.1d));
        System.out.println(sum(1.45d, 2.56d, 4.65d));
    }
    public static double sum(double a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static double sum(int a, double b){
        return a + b;
    }
    public static double sum(double a, double b, double c){
        return a + b;
    }
}
