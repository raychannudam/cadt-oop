package Udam.Lab3;

public class Exercise11 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                counter++;
                arr[i][j] = counter;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

