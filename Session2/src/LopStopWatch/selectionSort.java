package LopStopWatch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class selectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
//    public static void main(String a[]){
//        int arr[] = {21,60,32,01,41,34,5};
//        System.out.println("Selection Sort");
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        selectionSort(arr);
//        System.out.println("Selection Sort");
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//    }

