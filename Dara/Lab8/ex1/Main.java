package ex1;

public class Main {
    public static void main(String[] args) {
        CountDown cDown = new CountDown();
        CountUp cUp = new CountUp();
        Thread thread = new Thread(cUp);
        cDown.start();
        thread.start();
    }
}
