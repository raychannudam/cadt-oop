package ex2;

public class CountDown extends Thread {
    static boolean isStop = false;

    public void run() {
        for (int i = 1000; i >= 0 & CountUp.isStop == false; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        isStop = true;
    }
}