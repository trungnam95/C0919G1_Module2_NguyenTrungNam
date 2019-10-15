import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner=new Scanner(System.in);
        System.out.println("input size:");
        int size=scanner.nextInt();
        while (size>20){
            System.out.println("input size <=20");
            size= scanner.nextInt();
        }
        array=new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("input element "+(i+1)+" :");
            array[i]=scanner.nextInt();
        }
        System.out.print("array is: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.print("dao nguoc mang:");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
