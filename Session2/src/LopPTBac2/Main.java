package LopPTBac2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PTB2 pt=new PTB2();
        System.out.println("nhap vao so a");
        pt.setA(scanner.nextInt());
        System.out.println("nhap vao so B");
        pt.setB(scanner.nextInt());
        System.out.println("nhap vao so C");
        pt.setC(scanner.nextInt());
        if(pt.getA()==0){
            if(pt.getB()==0){
                if (pt.getC()==0){
                    System.out.println("pt vo so nghiem");
                }else{
                    System.out.println("pt vo nghiem");
                }
            }else{
                System.out.println("pt co nghiem duy nhat"+ pt.nghiemDuyNhat() );
            }
        }else{
            if(pt.getDelta()>0){
                System.out.println("nghiem thu nhat la:"+pt.getRoot1());
                System.out.println("nghiem thu 2 la:"+pt.getRoot2());
            }else if(pt.getDelta()==0){
                System.out.println("pt co nghiem kep"+pt.nghiemKep());
            }else {
                System.out.println("pt vo nghiem");
            }
        }
    }
}
