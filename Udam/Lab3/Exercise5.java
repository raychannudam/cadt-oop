package Udam.Lab3;

public class Exercise5 {
    public static void main(String[] args) {
        int number = 7;
        int flag = 1;
        if (number < 0) System.out.println("Invalid input");
        else {
            if (number > 2) {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        flag = 0;
                        break;
                    } else continue;
                }
                if (flag == 0) System.out.println("This is not prime number");
                else System.out.println("This is prime number");
            } else System.out.println("This is prime number");
        }
    }
}
