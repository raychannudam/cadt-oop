package Udam.Lab3;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        double randomNumber = Math.random()*100;
        int randomNumInt = (int)randomNumber;
        System.out.println(randomNumInt);
        Scanner ac = new Scanner(System.in);
        while(true){
            System.out.print("Input a number: ");
            int input = ac.nextInt();
            if(input > randomNumInt) System.out.println("The number is smaller than: " + input);
            else if(input < randomNumInt) System.out.println("The number is bigger than: " + input);
            else{
                System.out.println("Congrate! you are correct the number is : " + input);
                break;
            }
        }
    }
}
