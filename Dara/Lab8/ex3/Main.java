package ex3;

public class Main {
    public static void main(String[] args){
        int result = (int) (Math.random() * 10000 + 1);
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        // System.out.println("Result "+result);
        t1.start();
        t2.start();
        t3.start();
        while(true){
            if (t1.result == result){
                System.out.println("Thread 1 solved!");
                t1.interrupt();
                t2.interrupt();
                t3.interrupt();
                break;
            }
            if (t2.result == result){
                System.out.println("Thread 1 solved!");
                t1.interrupt();
                t2.interrupt();
                t3.interrupt();

                break;
            }
            if (t3.result == result){
                System.out.println("Thread 1 solved!");
                t1.interrupt();
                t2.interrupt();
                t3.interrupt();
                break;
            }
        }
        System.out.println("good bye! ");
    }
}
