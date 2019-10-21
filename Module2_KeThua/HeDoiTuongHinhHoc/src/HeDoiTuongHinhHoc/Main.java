package HeDoiTuongHinhHoc;

import HeDoiTuongHinhHoc.Models.Circle;
import HeDoiTuongHinhHoc.Models.Rectangle;
import HeDoiTuongHinhHoc.Models.Shape;
import HeDoiTuongHinhHoc.Models.Square;

public class Main {
    public static void main(String[] args) {
//        Shape shape=new Shape();
//        System.out.println(shape);
//        shape=new Shape("blue",false);
//        System.out.println(shape);
//        Circle cr=new Circle();
//        System.out.println(cr);
//        cr=new Circle(3);
//        System.out.println(cr);
//        cr=new Circle("red",true,8);
//        System.out.println(cr);
//        Rectangle re=new Rectangle();
//        System.out.println(re);
//        re=new Rectangle("blue",false,3.9,4.1);
//        System.out.println(re);
        Square square = new Square();
        System.out.println(square);
        square = new Square(3.3);
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
