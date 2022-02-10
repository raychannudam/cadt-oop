package Dara.Lab3;
public class ex4 {
    static void patternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patternB(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patternC(int n) {
        for (int i = 0; i <= n; i++) {
            int j;
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    static void patternD(int n) {
        for (int i = 1; i <= n; i++) {
            int j;
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <n-i+2; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternA(6);
        System.out.println();
        patternB(6);
        System.out.println();
        patternC(6);
        System.out.println();
        patternD(6);
    }
}
