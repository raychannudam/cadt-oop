package Udam.Lab3;

public class Exercise3d {
    public static void main(String[] args) {
        int n=5;
        for(int i=n; i>0; i--){
            for(int j=1; j<=n*2-1; j++){
                if(j>=i && j<=(n*2) - i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n*2-1; j++){
                if(j>i && j<(n*2) - i) System.out.print("* "); 
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
