package Dara.Lab2;

public class ex11 {
    static void multiplyNumber(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        multiplyNumber(7);
    }
}
