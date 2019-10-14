import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double VND=23000;
        double USD;
        System.out.println("input USD");
        Scanner scanner=new Scanner(System.in);
        USD=scanner.nextDouble();
        double trans=VND*USD;
        System.out.println("congratulation:"+trans);
    }
}
