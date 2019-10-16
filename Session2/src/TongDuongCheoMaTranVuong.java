import java.util.Random;
import java.util.Scanner;

public class TongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        int[][] array;
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao do dai cua hinh vuong");
        int input = scanner.nextInt();
        array = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                array[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j <array.length ; j++) {
                System.out.print(array[i][j]+"\t");
            }
        }
        System.out.println();
        int sumCheo1=0;
        int sumCheo2=0;

        for (int i = 0; i <array.length ; i++) {
            sumCheo1+=array[i][i];
            sumCheo2+=array[i][array.length-1-i];
        }
        System.out.println(sumCheo1);
        System.out.println(sumCheo2);
        System.out.println("nhap vao cot muon tinh tong cac phan tu");
        int cot=scanner.nextInt();
        int sumCot=0;
        for (int i = 0; i <array.length ; i++) {
            sumCot+=array[i][cot];
        }
        System.out.println("tong la "+sumCot);

    }
}
