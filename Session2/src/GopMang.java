import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1;
        System.out.println("nhap so luong phan tu cua mang 1:");
        Scanner scanner=new Scanner(System.in);
        int soLuongArray1=scanner.nextInt();
        array1=new int[soLuongArray1];
        for (int i = 0; i <array1.length ; i++) {
            System.out.println("nhap vao phan tu thu "+(i+1));
            array1[i]=scanner.nextInt();
        }
        int[] array2;
        System.out.println("nhap so luong phan tu mang 2: ");
        int soLuongArray2=scanner.nextInt();
        array2=new int[soLuongArray2];
        for (int i = 0; i <array2.length ; i++) {
            System.out.println("nhap vao phan tu thu "+(i+1));
            array2[i]=scanner.nextInt();
        }


        System.out.println(Arrays.toString(gopMang(array1, array2)));
    }
    private static int[] gopMang(int[] array1, int[] array2){
        int[] array3;
        array3=new int[array1.length+array2.length];
        for (int i = 0; i <array1.length ; i++) {
            int temp=array1[i];
            array3[i]=array1[i];
            array3[i]=temp;
        }
        for (int i = 0; i <array2.length ; i++) {
            int temp=array2[i];
            array2[i]=array3[array1.length+i];
            array3[array1.length+i]=temp;
        }
        return array3;
    }
}
