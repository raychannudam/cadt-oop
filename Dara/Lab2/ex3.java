package Dara.Lab2;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        scanner.close();
        System.out.println((age<=0)? "Your age can't be less than 0.":
        "Your age is "+age+" years old.");
    }    
}
