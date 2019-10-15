import java.util.Arrays;
import java.util.Scanner;

public class TimGTLNArray {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size");
        int size = scanner.nextInt();
        while (size > 20) {
            System.out.println("enter size <=20");
            size = scanner.nextInt();
        }
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("input array: " + (i+1));
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        GTLN(array);
    }
    private static void GTLN(int []array){
        int max=array[0];
        int index=1;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
                index=i+1;
            }
        }
        System.out.println("GTLN is:"+max+" nam o vi tri"+index);
    }
}
