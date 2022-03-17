package ex7;

import ex6.DoAble;
import ex6.Human;

public class Main {
    public static void main(String[] args) {
        DoAble doables[] = new DoAble[10];

        for(int i=0;i<3;i++){
            doables[i] = Human.addData();
        }
        for(DoAble doable: doables){
            System.out.println(doable);
        }
    }
}
