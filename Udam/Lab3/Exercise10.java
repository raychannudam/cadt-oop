package Udam.Lab3;

public class Exercise10 {
    public static void main(String[] args) {
        int[] randArr = new int[10];
        for(int i=0; i<randArr.length; i++){
            double rand = Math.random()*100;
            int randIn = (int)rand;
            randArr[i] = randIn;
        }
        System.out.println("Avg: " + findAvg(randArr));
        System.out.println("Max: " + FindMax(randArr));
        printAll(randArr);
    }

    public static double findAvg(int arr[]){
        double sum = 0;
        for(int i=0; i<arr.length; i++)  sum = sum + arr[i];
        return sum / arr.length;
    }
    public static int FindMax(int arr[]){
        int max = 0;
        for(int i=0; i<arr.length; i++) max = Math.max(max, arr[i]);
        return max;
    }
    public static void printAll(int arr[]){
        System.out.println("Display all: ");
        for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
    }
}
