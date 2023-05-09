package CTDL.SPOJ;


import java.util.Scanner;

public class SNTFIBO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int test = sc.nextInt();
            if (checkFibonacci(test) && checkPrime(test)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static boolean checkPrime(int k) {
        if (k < 2) return false;
        for ( int i = 2; i <= (int) Math.sqrt(k); i++) {
            if ( k%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkFibonacci(int n) {
        double X1 = 5 * Math.pow(n, 2) + 4;
        double X2 = 5 * Math.pow(n, 2) - 4;
 
        long X1_sqrt = (long)Math.sqrt(X1);
        long X2_sqrt = (long)Math.sqrt(X2);   
 
        return (X1_sqrt*X1_sqrt == X1) || (X2_sqrt*X2_sqrt == X2);
    }
}

