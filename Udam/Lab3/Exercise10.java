package Udam.Lab3;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int[] randArr = new int[20];
        for(int i=0; i<randArr.length; i++){
            double rand = Math.random()*130 + 20;
            int randIn = (int)rand;
            randArr[i] = randIn;
        }
        System.out.println("***Menu***");
        System.out.println("1. find average");
        System.out.println("2. sum");
        System.out.println("3. find max");
        System.out.println("4. find element");
        System.out.println("5. print all");
        System.out.println("Input option: ");
        int option = ac.nextInt();
        switch (option){
            case 1:
                System.out.println("Average: "+findAvg(randArr));
                break;
            case 2:
                System.out.println("Sum: "+sumElement(randArr));
                break;
            case 3:
                System.out.println("Max: "+FindMax(randArr));
                break;
            case 4:
                System.out.print("Input key: ");
                int key = ac.nextInt();
                int result = findElement(randArr, key);
                if(result == -1){
                    System.out.println("Not found");
                }else{
                    System.out.println("Index: "+result);
                }
                break;
            case 5:
                printAll(randArr);
                break;
            default:
                System.out.print("Invalid");
                break;
            
        }
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
    public static int findElement(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int sumElement(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++)  sum = sum + arr[i];
        return sum;
    }
}
