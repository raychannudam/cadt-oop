package Udam.Lab2;

public class Exercise11 {
    public static void main(String[] args) {
        multiplyNumber(7);
    }

    public static void multiplyNumber(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
