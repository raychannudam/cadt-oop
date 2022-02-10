package Dara.Lab3;
public class ex10 {

    static double findAvg(int number[]) {
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        return sum / number.length;
    }

    static int findMax(int number[]){
        int max=number[0];
        for(int i=0; i<number.length;i++){
            if(i+1<number.length){
                max = Math.max(max, number[i+1]);
            }
        }
        return max;
    }
    static void printArr(int number[]){
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("average:"+findAvg(arr));
        System.out.println("max: "+findMax(arr));
        printArr(arr);
    }
}
