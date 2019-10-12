import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("input width");
        width = scanner.nextFloat();
        System.out.println("input height");
        height=scanner.nextFloat();
        float area=width*height;
        System.out.println("area is: "+area);
    }
}
