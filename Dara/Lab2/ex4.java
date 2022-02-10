import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte score = scanner.nextByte();
        scanner.close();
        char result = (score >= 95 && score <= 100) ? 'A'
                : (score >= 80 && score <= 94)
                        ? 'B': (score >= 74 && score <= 79) ? 
                        'C' : (score >= 55 && score <= 73) ? 
                        'D' : 'F';
        System.out.println(result);
    }
}
