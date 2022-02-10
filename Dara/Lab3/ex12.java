import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of row: ");
        byte row = input.nextByte();
        System.out.println("Enter the size of col: ");
        byte col = input.nextByte();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for(int j=0; j<col;j++){
                arr[i][j] = (int) (Math.random() * 100 + 1);
            }
        }

        for(int i=0;i<row;i++){
            for(byte j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
