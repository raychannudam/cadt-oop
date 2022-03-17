package ex3;

public class Thread1 extends Thread{
    static boolean isStop=false;
    int result;
    public void run(){
        while (Thread2.isStop==false || Thread3.isStop==false){
            if(Thread.interrupted()){
                break;
            }
            result = (int)(Math.random()*10000+1);
            // System.out.println("thread1 "+result);
        }
        isStop=true;
    }
}
