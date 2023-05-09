package CTDL;

import java.util.Random;
import java.util.Scanner;

public class Fibonacci {
    static Scanner sc= new Scanner(System.in);
    static Random random = new Random();

    static double initialAmount = sc.nextDouble(); //so tien ban dau minh co
    static double desiredAmount = initialAmount*2; //loi nhuan mong muon
    static double number1= sc.nextDouble(); //so tien dat lan 1
    static double number2 = sc.nextDouble(); //so tien dat lan 2
    static int randomNumber; //tao ngau nhien 1 so tu 1 den 36
    static double result; // ket qua sau moi lan cuoc
    static double[] fibonacci = new double[10000];
    static int count = 1; // dem so lan minh dat cuoc

    public static void main(String[] args) {
        int k =0;
        double resultsAfterEachBet = 1;

        while (initialAmount <  desiredAmount) {
            randomNumber = random.nextInt(36) + 1;

            if ( resultsAfterEachBet > 0 ) {
                if ( k == 0 || k == 1  ) {
                    k = 0;
                } else {
                    k = k - 2;
                }   
            }
            else {
                k = k+1;
            }
            fibonacci = new double[10000];
            fibonacci[0] = number1;
            fibonacci[1] = number2;
            for (int i = 2; i < 10000; i++) {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
            resultsAfterEachBet = AllOdd(fibonacci[k]);

            System.out.println("Second Bet: " + count);
            System.out.println("Bet Amount: " + fibonacci[k]);
            System.out.println("Result: " + resultsAfterEachBet);
            System.out.println("Current Balance: " + initialAmount);
            System.out.println( );
            if (initialAmount < fibonacci[k+1]) {
                System.out.println("You Don't Have Enough Money For Your Next Bet");
                break;
            }
            count ++;
        }
    }
// gia su dat le
    public static double AllOdd(double money) {
        if (randomNumber % 2 == 1) {
            initialAmount += money;
            return money;
        } else {
            initialAmount -= money;
            return -money;
        }
    }
}
