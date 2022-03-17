package ex3;

public class Thread3 extends Thread{
    static boolean isStop=false;
    int result;
    public void run(){
        while (Thread1.isStop==false || Thread2.isStop==false){

            if(Thread.interrupted()){
                break;
            }
            result = (int)(Math.random()*10000+1);
            // System.out.println("thread3 "+result);
        }
        isStop=true;
    }
}
