import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money=1.0;
        int month=1;
        double interset_rate=1.0;
        System.out.println("input money");
        money=scanner.nextDouble();
        System.out.println("input month");
        month=scanner.nextInt();
        System.out.println("input interest rate");
        interset_rate=scanner.nextDouble();
        double total_interest=0;
        for (int i = 0; i <month ; i++) {
            total_interest=money*(interset_rate/100)/12 *3;
        }
        System.out.println("Total interset "+total_interest);
    }
}
