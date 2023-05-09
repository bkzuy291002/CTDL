package CTDL.SPOJ;

import java.util.Scanner;
public class SLPLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int test = sc.nextInt();
            System.out.println(checkCube(test));
        }
        sc.close();
    }
    public static int checkCube(int test) {
        int max = 0;
        for (int i = 1; i < 22; i++) {
            if (Math.pow(i, 3) <= test) {
                max = i;
            }
        }
        return max;
    }
}

