import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter full name: ");
        String fullname = input.nextLine();
        System.out.print("Please enter age: ");
        byte age = Byte.parseByte(input.nextLine());
        System.out.print("Please enter address: ");
        String address = input.nextLine();
        input.close();

        System.out.println("Fullname: " + fullname + 
        "\n Age: " + age + "\n Address: " + address);
    }
}
