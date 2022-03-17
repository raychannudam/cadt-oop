package ex2;

public class Main {
    // private static volatile boolean isRunning = true;
    public static void main(String[] args) {
        CountDown cDown = new CountDown();
        CountUp cUp = new CountUp();
        Thread thread2 = new Thread(cUp);
        cDown.start();
        thread2.start();
    }
    
}
