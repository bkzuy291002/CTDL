package CTDL.SPOJ;

import java.util.*;
import java.io.*;
public class SLEXSORT {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder s = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String target = br.readLine();
            int n =  Integer.parseInt(br.readLine());
            String [] array = new String[n];
            for (int j = 0; j < n; j++) {
                array[j] = br.readLine();
            }
            Arrays.sort(array, new Comparator<String>() {
                public int compare(String str1, String str2) {
                    int iStr1, iStr2;
                    for (int i = 0; i < str1.length() && i < str2.length(); i++) {
                        iStr1 = findIndex(str1.charAt(i), target);
                        iStr2 = findIndex(str2.charAt(i), target);
                        if (iStr1 > iStr2) {
                            return 1; 
                            // break;
                        }
                        if (iStr1 < iStr2) {
                            return -1;
                            // break;
                        }
                    }
                    return str1.length() - str2.length();
                    
                }   
            });
        for (String word: array) {
            s.append(word).append("\n");
        }
        s.append("\n");
        br.readLine();

        }
        bw.write(s.toString());
        br.close();
        bw.close();
    }    
    public static int findIndex(char x, String array) {
        int index = 0;
        for (int i = 0; i < array.length(); i++) {
            if (x == array.charAt(i)) {
                index = i;
                break;
            }
        }
        return index;
    }
}

