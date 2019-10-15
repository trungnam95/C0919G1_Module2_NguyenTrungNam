import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Nhap vao fahrenheit");
                double fahrenheit = scanner.nextDouble();
                System.out.println(FahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("nhap vao celsius");
                double celsius = scanner.nextDouble();
                System.out.println(CelsiusToFahrenheit(celsius));
                break;
            case 0:
                break;
            default:
                System.out.println("nhap sai");

        }
    }

    private static double FahrenheitToCelsius(double f) {
        return (5.0 / 9) * (f - 32);
    }

    private static double CelsiusToFahrenheit(double c) {
        return (9.0 / 5) * c + 32;
    }
}
