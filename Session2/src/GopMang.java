

public class GopMang {
    public static void main(String[] args) {
        int[] array1={1,3,4};
        int[] array2={6,8,9,4,2};
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
        for (int i = 0; i <array3.length ; i++) {
            System.out.println(array3[i]+"\t");
        }
    }
}
