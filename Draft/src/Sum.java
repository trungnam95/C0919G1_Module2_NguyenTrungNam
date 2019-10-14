import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input 1: ");
        int number1 = scanner.nextInt();
        System.out.println("input 2: ");
        int number2 = scanner.nextInt();
        System.out.println("tong tu 1 den 2 la:" + sum(number1, number2));
    }

    private static int sum(int val1, int val2) {
        int sum = 0;
        for (int i = val1; i <= val2; i++) {
            sum += i;
        }
            return sum;
    }
}

