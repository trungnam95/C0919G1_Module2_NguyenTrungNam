package LopPTBac2;

import java.util.Scanner;

public class PTBac2 {
    private double a;
    private double b;
    private double c;

    public PTBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PTBac2() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDelta(){
        return Math.pow(b,2)-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(getDelta()))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(getDelta()))/(2*a);
    }
    public double nghiemDuyNhat(){
        return -c/b;
    }
    public double nghiemKep(){
        return -b/2*a;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PTBac2 pt=new PTBac2();
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
