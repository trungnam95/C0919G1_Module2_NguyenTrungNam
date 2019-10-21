package LopCircleAndCylinder;

import LopCircleAndCylinder.Models.Circle;
import LopCircleAndCylinder.Models.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Cylinder cylinder=new Cylinder();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao ban kinh");
        circle.setRadius(scanner.nextDouble());
        System.out.println(circle.toString());
        System.out.println("nhap vao chieu cao");
        cylinder.setRadius(circle.getRadius());//goi phuong thuc de lay lai gia tri radius tu lop circle.
        cylinder.setHeight(scanner.nextDouble());
        System.out.println(cylinder.toString());
    }
}
