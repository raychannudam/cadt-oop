package Dara.Lab1;
public class fizzbuss {
    public static void main(String[] args) {
        // devisible by 5 fizz, 3 buzz, both fizzbuzz
        // if not return the number
        int number = 15;
        String name = "FizzBuzz";
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(name);
        } else if (number % 3 == 0 || number % 5 == 0) {
            name = (number % 3 == 0) ? "Buzz" : "Fizz";
            System.out.println(name);
        } else
            System.out.println(name.valueOf(number));

    }
}
