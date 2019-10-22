package Models;

import java.util.Arrays;

public class Rectangle extends Shape implements Resizeable{
    public Rectangle() {

    }

    @Override
    public void resize() {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle("red", true, 2,4);
        rectangles[1] = new Rectangle("blue", false, 4.4,8);
        System.out.println(Arrays.toString(rectangles));
//        Random rd = new Random();
//        double kq = 0;
        double ran =  Math.floor((Math.random() * 100) + 1);
        for (Rectangle rectangle : rectangles) {
//            kq=(rectangle.getArea()+(rectangle.getArea()*(ran/100)));
               rectangle.getArea(rectangle.getArea()+(rectangle.getArea()*(ran/100)));

        }
        System.out.println(Arrays.toString(rectangles)+"tang len:"+ran+"%");
    }
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//    public double setArea(double v){
//        return width*height;
//    }
    public double getArea(){
        return width*height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
               "Area= "+getArea()+
                super.toString()+
                '}';
    }
}
