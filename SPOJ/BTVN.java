package CTDL.SPOJ;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BTVN {
    public static void main(String[] args) {
        int n = 10000;
        int total = 0;
        long start, end;
        for (int i = 0; i < n; i++) {
            total += 100;
        }
        start = System.currentTimeMillis();  
        end = System.currentTimeMillis();   
        System.out.println("Time Millis: " + (end - start));
        System.out.println(total);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(); 
        String stringDate = dateFormat.format(date);
        System.out.println("Date: " + stringDate);
    }
}

