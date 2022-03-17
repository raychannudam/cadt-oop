package ex1;
public class CountUp implements Runnable{
    
    public void run(){
        for(int i=1; i<50; i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}
