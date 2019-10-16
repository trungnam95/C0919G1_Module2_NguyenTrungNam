package LopHCN;

import java.util.Scanner;

public class LopHCN {
    private double dai;
    private double rong;

    public LopHCN(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public LopHCN() {
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public static double dienTich(double dai,double rong) {
        return dai*rong;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LopHCN hcn=new LopHCN();
        System.out.println("nhap vao chieu dai");
        hcn.setDai(scanner.nextDouble());
        System.out.println("nhap vao chieu rong");
        hcn.setRong(scanner.nextDouble());
        System.out.println(dienTich(hcn.getDai(),hcn.getRong()));

    }

}
