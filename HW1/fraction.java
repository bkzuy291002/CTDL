package CTDL.HW1;

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator1 = sc.nextInt();
        int denominator1 = sc.nextInt();
        int numerator2 = sc.nextInt();
        int denominator2 = sc.nextInt();
        System.out.println("Phan so dau vao: ");
        printFraction(numerator1, denominator1);
        printFraction(numerator2, denominator2);
        System.out.println("Cong 2 phan so: ");
        addFractions(numerator1, denominator1, numerator2, denominator2);
        System.out.println("Tru 2 phan so: ");
        subtractFractions(numerator1, denominator1, numerator2, denominator2);
        System.out.println("Nhan 2 phan so: ");
        multiplyFractions(numerator1, denominator1, numerator2, denominator2);
        System.out.println("Chia 2 phan so: ");
        divideFractions(numerator1, denominator1, numerator2, denominator2);
        sc.close();
    }
    public static void printFraction(int numerator, int denominator) {
        int GCD;
        if (denominator == 0) {
            System.out.println("ERROR");
        } else if (numerator == 0) {
            if (denominator < 0) {
                denominator = -1 * denominator;
                System.out.println("fraction: -0 "  + " / " + denominator);
            } else {
                System.out.println("fraction: " + numerator + " / " + denominator);
            }
        } else if ( numerator < 0 && denominator < 0 ) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
            GCD = gcd(numerator, denominator);
            numerator = numerator / GCD;
            denominator = denominator / GCD;
            System.out.println("fraction: " + numerator + " / " + denominator);
        } else if (numerator > 0 && denominator < 0) {
            denominator = Math.abs(denominator);
            GCD = gcd(numerator, denominator);
            numerator = (-1) * numerator / GCD;
            denominator = denominator/GCD;
            System.out.println("fraction: " + numerator + " / " + denominator);
        } else if (numerator < 0 && denominator > 0) {
            numerator = Math.abs(numerator);
            GCD = gcd(numerator, denominator);
            numerator = (-1) * numerator / GCD;
            denominator = denominator/GCD;
            System.out.println("fraction: " + numerator + " / " + denominator);
        } else {
            GCD = gcd(numerator, denominator);
            numerator = numerator / GCD;
            denominator = denominator / GCD;
            System.out.println("fraction: " + numerator + " / " + denominator);
        }
    }
    public static int gcd(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator; 
        } else {
            return gcd(denominator, numerator%denominator);
        }
    }
    public static void addFractions(int numerator1, int denominator1,   int numerator2, int denominator2 ) {
        int numerator = numerator1*denominator2 + numerator2*denominator1;
        int denominator = denominator1*denominator2;
        printFraction(numerator, denominator);
    }
    public static void subtractFractions(int numerator1, int denominator1,   int numerator2, int denominator2 ) {
        int numerator = numerator1*denominator2 - numerator2*denominator1;
        int denominator = denominator1*denominator2;
        printFraction(numerator, denominator);
    }
    public static void multiplyFractions(int numerator1, int denominator1,   int numerator2, int denominator2 ) {
        int numerator = numerator1*numerator2;
        int denominator = denominator1*denominator2;
        printFraction(numerator, denominator);
    }
    public static void divideFractions(int numerator1, int denominator1,   int numerator2, int denominator2 ) {
        int numerator = numerator1*denominator2;
        int denominator = denominator1*numerator2;
        printFraction(numerator, denominator);
    }
}
