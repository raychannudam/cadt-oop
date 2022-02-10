package Dara.Lab3;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int rand = (int)(Math.random() * 100+1);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(true){
            int guess = input.nextInt();
            if(guess>rand){
                System.out.println("Enter a smaller number");
            }else if(guess<rand){
                System.out.println("Enter a bigger number");
            }
            else{
                System.out.println("Well done! Congratulations!");
                break;
            }
        }
    }
}
