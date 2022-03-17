package ex3;

public class Thread2 extends Thread{
    static boolean isStop=false;
    int result;
    public void run(){
        while (Thread1.isStop==false || Thread3.isStop==false){

            if(Thread.interrupted()){
                break;
            }
            result = (int)(Math.random()*10000+1);
            // System.out.println("thread2 "+result);
        }
        isStop=true;
    }
}
