import java.util.Scanner;

public class TimGTNNArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array;
        System.out.println("input size");
        int size=scanner.nextInt();
        array=new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("input element "+(i+1)+" :");
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println("min is: "+min(array));
        for (int i = 0; i <array.length ; i++) {
            if(min(array)==array[i]){
                System.out.println(i+1);
            }
        }
    }
    private static int min(int []array){
        int min=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
}
