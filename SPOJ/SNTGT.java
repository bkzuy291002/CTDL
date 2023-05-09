package CTDL.SPOJ;

import java.util.Scanner;;

class SNTGT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int test = sc.nextInt();
            if (checkFactorail(test) || (test == Factorial(test) & checkPrime(test))) {
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
    public static boolean checkFactorail( int test) {
        for ( int k = 1; k < 8; k++) {
            if (test == Factorial(k) - 1 || test == Factorial(k) + 1) {
                if (checkPrime(test)) {
                   return true;
                }
            }
        } return false;
    }
    public static int Factorial(int k) {
        if ( k == 1 ) return 1;
        return k *Factorial( k - 1);
    }
}

