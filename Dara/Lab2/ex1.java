import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        String result = (input>=0)? "positive" : "negative";
        System.out.println(result);
    }
}