package Dara.Lab3;

public class ex11 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        byte row = 3;
        for (int i = 0; i < arr.length; i++) {
            for (byte j = 0; j < row; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
