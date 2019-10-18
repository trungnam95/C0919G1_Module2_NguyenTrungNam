package LopStopWatch;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        stopWatch st = new stopWatch();
        st.start();
        int[] arr = stopWatch.creatRandom();//goi phuong thuc static nam trong cho khac thi ghi ten lop.phuongthuc
//        stopWatch.GTLN(arr);
        selectionSort.selectionSort(arr);
        System.out.println("Selection Sort");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        st.stop();
        System.out.println("time is " + st.getElapsedTime());
    }
}
