package ex1;
public class CountDown extends Thread{
    public void run(){
        for(int i=100;i>=60;i--){
            System.out.println(i);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}