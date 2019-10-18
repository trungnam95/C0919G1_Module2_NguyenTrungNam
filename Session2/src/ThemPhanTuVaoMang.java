import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
//        int[] array;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhap vao so luong phan tu muon them vao mang");
//        int size=scanner.nextInt();
//        array=new int[size];
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println("nhap vao phan tu thu"+i+" ");
//            array[i]=scanner.nextInt();
//        }
//        System.out.println("mang la"+ Arrays.toString(array));
//        int[] arrayNew= Arrays.copyOf(array,array.length+1);
//        System.out.println("nhap vao vi tri muon them");
//        int viTri=scanner.nextInt();
//        System.out.println("nhap vao gia tri muon them vao");
//        int value=scanner.nextInt();
//        hienThi(arrayNew, value, viTri);
//    }

        int[] array = {1, 2, 3, 4};
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        int viTri =0, value = 6;
        System.out.println(Arrays.toString(hienThi(newArray, value, viTri)));
    }

    private static int[] hienThi(int[] arrayNew, int value, int viTri) {
        for (int i = arrayNew.length - 1; i >= viTri; i--) {
            if(viTri==0){
                arrayNew[i]=value;
                break;
            }
            arrayNew[i] = arrayNew[i-1];
            if (i == viTri) {
                arrayNew[i] = value;
            }
        }

        return arrayNew;
    }
}


