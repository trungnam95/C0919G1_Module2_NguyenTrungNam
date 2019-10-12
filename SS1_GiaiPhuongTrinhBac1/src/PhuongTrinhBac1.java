import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a: ");
        double a = scanner.nextDouble();
        System.out.println("input b: ");
        double b = scanner.nextDouble();
        System.out.println("input c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double kq = (c - b) / a;
            System.out.println("Phuong trinh co nghiem la: " + kq);
        } else {
            if (b == 0) {
                System.out.println("pt vo so nghiem");
            } else {
                System.out.println("pt vo nghiem");
            }
        }
    }
}
