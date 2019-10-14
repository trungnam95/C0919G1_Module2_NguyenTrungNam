import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao chieu cao");
        double height=scanner.nextDouble();
        System.out.println("nhap vao cang nang");
        double weight=scanner.nextDouble();
        double BMI=weight/Math.pow(height,2);
        if(BMI>=30.0){
            System.out.printf("%-20.2f%s", BMI, "Obese");
        }else if(BMI<30 && BMI>=25){
            System.out.printf("%-20.2f%s", BMI, "Over Weight");
        }else if(BMI<25 && BMI>=18){
            System.out.printf("%-20.2f%s", BMI, "Normal");
        }else{
            System.out.printf("%-20.2f%s", BMI, "UnderWeight");
        }
    }
}
