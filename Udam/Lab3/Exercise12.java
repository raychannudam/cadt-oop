package Udam.Lab3;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Inut rows: ");
        int row = ac.nextInt();
        System.out.print("Input columns: ");
        int column = ac.nextInt();

        int[][] arr = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                double rand = Math.random()*100;
                int randInt = (int)rand;
                arr[i][j] = randInt;
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++) System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
    }
}
