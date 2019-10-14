import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] myList={1,3,4,8};
        System.out.println(Arrays.toString(myList));
        System.out.println(tb(myList));
    }
    private static int tb(int []a){
        int sum=0;
        int tb=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
            tb=sum/a.length;
        }return tb;

    }
}
