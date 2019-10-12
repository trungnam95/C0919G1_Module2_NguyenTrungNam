import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter A");
        int a = scanner.nextInt();
        System.out.println("enter B");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("can't test");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.printf("%d la UCLN", a);
    }
}
