package Udam.Lab3;

public class Exercise4d {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) System.out.print(j - i + 1 + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
