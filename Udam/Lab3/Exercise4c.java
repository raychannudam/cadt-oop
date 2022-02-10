package Udam.Lab3;

public class Exercise4c {
    public static void main(String[] args) {
        int n = 6;
        for(int i=n; i>0; i--){
            for(int j=1; j<=n; j++){
                if(j<i)System.out.print("  ");
                else System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }
    }
}
