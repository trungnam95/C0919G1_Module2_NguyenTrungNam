import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("enter number function you want use:");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                for (int i = 0; i <3 ; i++) {
                    for (int j = 0; j <=6 ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i=1; i<=5; i++) {
                    for(int j=1; j<i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3 :
                for (int i = 7; i >=1 ; i--) {
                    for (int j = 1; j <=i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:break;
            default:
                System.out.println("fail");
        }
    }
}
