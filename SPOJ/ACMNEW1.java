package CTDL.SPOJ;

import java.util.Scanner;

public class ACMNEW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(Check(sc));
        }
    }
    public static int Check(Scanner sc) {
        int n = sc.nextInt();
        int ArrayWeight [] = new int [n];
        for (int i = 0; i < n; i++) {
            ArrayWeight [i] = sc.nextInt();
        }
        int limit = sc.nextInt();
        int summax = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ( (ArrayWeight [i] + ArrayWeight [j] + ArrayWeight [k]) <= limit ) {
                        int sum = ArrayWeight [i] + ArrayWeight [j] + ArrayWeight [k];
                        if ( summax < sum) {
                            summax = sum;
                        }
                    }
                   
                }
            }
        }
        return summax;
    }
}

