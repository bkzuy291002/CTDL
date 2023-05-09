package CTDL.HW1;

import java.util.Scanner;
 
public class Bai1 {
    public static boolean checkPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0) {
                sum += i;
            }
        }
        if ( sum == n){
            return true;
        } else {
            return false;
        }
    }
    public static void perfectNumber(int Array[], int n) {
        System.out.print("Cac so hoan hao trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (checkPerfectNumber(Array[i])) {
                System.out.print(Array[i]+ " ");
            }
        }
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
    public static void Prime(int Array[], int n) {
        System.out.print("Cac so nguyen to trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (checkPrime(Array[i])) {
                System.out.print(Array[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua mang: ");
        int n = sc.nextInt();
        int Array [] = new int[n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            Array[i] = sc.nextInt();
        }
        perfectNumber(Array, n);
        System.out.println( );
        Prime(Array, n);
        sc.close();
    }
}
