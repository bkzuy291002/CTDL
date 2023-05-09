package CTDL.HW2;

import java.util.Random;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        int Array[] = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = random.nextInt(10000);
        }
        String nameSort = sc.next();
        if (nameSort.equals("B")) {
            System.out.println("Bubble Sort: ");
            bubbleSort(Array, n);
        } else if (nameSort.equals("S")) {
            System.out.println("Selection Sort: ");
            selectionSort(Array, n);
        } else if (nameSort.equals("Q")) {
            System.out.println("Quick Sort: ");
            quickSort(Array, n, 0, n-1);
        } else {
            System.out.println("ERROR");
        }
        sc.close();
    }
    public static void printArray(int Array[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println( );
    }
    public static void bubbleSort(int Array[], int n) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                count2++;
                if (Array[i] > Array[j]) {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                    count1++;
                    printArray(Array, n);
                }
            }
        }
        System.out.println("so lan so sanh: " + count2);
        System.out.println("so lan doi cho: " + count1);
    }
    public static void selectionSort(int Array[], int n) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if( Array[j] < Array[min]) {
                    min = j;
                    count1++;
                }
            }
            int temp = Array[min];
            Array[min] = Array[i];
            Array[i] = temp;
            count2++;
            printArray(Array, n);

        }
        System.out.println("so lan so sanh: " + count1);
        System.out.println("so lan doi cho: " + count2);
    }
    public static void swap(int Array[], int num1, int num2) {
        int temp = Array[num1];
        Array[num1] = Array[num2];
        Array[num2] = temp;
    }
    public static int partition(int Array[], int n, int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;
        while (true) {
            while (Array[++leftPointer] < pivot) {
            }
            while (rightPointer > 0 && Array[--rightPointer] > pivot) {
            }
            if (leftPointer >= rightPointer) {
                break;
            } else {
                swap(Array, leftPointer, rightPointer);
            }
        }
        swap(Array, leftPointer, right);
        printArray(Array, n);
        return leftPointer;
    }
    public static void quickSort(int Array[], int n, int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = Array[right];
            int partitionPoint = partition(Array, n, left, right, pivot);
            quickSort(Array, n, left, partitionPoint - 1);
            quickSort(Array, n, partitionPoint + 1, right);
        }
    }
}
