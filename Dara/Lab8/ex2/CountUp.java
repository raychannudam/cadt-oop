package ex2;

public class CountUp implements Runnable {
    static boolean isStop = false;

    public void run() {
        for (int i = 1; i < 50 & CountDown.isStop == false; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        isStop = true;
    }
}
