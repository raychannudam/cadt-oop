public class ex5 {
    static Boolean isPrime(int n) {
        byte flag=0;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (n == 0 || n == 1) {
            return false;
        } else {
            if (flag == 0)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args){
        System.out.println(isPrime(29));
    }
}
