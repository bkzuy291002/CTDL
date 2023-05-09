import java.util.Random;
public class tkdgtttuan2cau1b {
    public static int example1 (int[ ] first , int[ ] second ) {
        // assume equal - length arrays
        int n = first . length , count = 0;
        for ( int i =0; i < n ; i ++) { // loop from 0 to n -1
            int total = 0;
            for ( int j =0; j < n ; j ++) // loop from 0 to n -1
                for ( int k =0; k <= j ; k ++) // loop from 0 to j
                    total += first [ k ];
                        if ( second [ i ] == total ) count ++;
        }
        return count ;
    }
    public static void main(String[] args) {
        Random rd = new Random();
        int n = 1000;

        int[] arr = new int[n];
        int[] second = new int[n];


        for (int i = 0; i < n; i++){
            arr[i] = rd.nextInt();
            second[i] = rd.nextInt();
        }


        long timeAvg = 0;
        for (int i = 0; i < 20; i++){
            long start = System.nanoTime();
            int s = example1(arr, second);
            long elapsedTime = System.nanoTime() - start;
            timeAvg += elapsedTime;
        }
        System.out.println("Thời gian trung bình sau 20 lần chạy là: "+ timeAvg/20 + " * 10^-9 (s)");


    }
}