import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month you want to count day");
        int month = scanner.nextInt();
        System.out.println("Which year you want to count day");
        int year = scanner.nextInt();
        switch (month) {
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("the month "+month+" nam nhuan " + year + "have:29 days");
                    break;
                } else {
                    System.out.println("the month "+month+" nam k nhuan " + year + "have: 28 days");
                    break;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("the month " + month + "have 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("the month " + month + "have 30 days");
                break;
            default:
                System.out.println("fails");
        }
    }
}
