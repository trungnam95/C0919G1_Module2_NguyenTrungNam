import java.util.Scanner;

public class TimGTLNMang2Chieu {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so dong");
        int dong = scanner.nextInt();
        System.out.println("nhap vao so cot");
        int cot = scanner.nextInt();
        array = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("nhap phan tu thu" + i + "," + j + " :");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mang vua nhap la:");
        for (int i = 0; i < dong; i++) {
            System.out.println();
            for (int j = 0; j < cot; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("gia tri lon nhat la: "+max(array));
        System.out.println("GTNN la: "+min(array));
        for (int i = 0; i <dong ; i++) {
            for (int j = 0; j <cot ; j++) {
                if(max(array)==array[i][j]){
                    System.out.println("GTLN nam o vi tri: "+i+","+j);
                }
            }
        }
        for (int i = 0; i <dong ; i++) {
            for (int j = 0; j <cot ; j++) {
                if(min(array)==array[i][j]){
                    System.out.println("GTNN nam o vi tri: "+i+","+j);
                }
            }
        }
    }

    private static int max(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    private static int min(int[][] array){

        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
