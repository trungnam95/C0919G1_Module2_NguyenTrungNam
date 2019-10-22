package Models;

import java.util.Arrays;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with Area="
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize() {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle("red", true, 2);
        circles[1] = new Circle("blue", false, 4.4);
        System.out.println(Arrays.toString(circles));
//        Random rd = new Random();
        double ran =  Math.floor((Math.random() * 100) + 1);
        for (int i = 0; i <circles.length ; i++) {

        }
        System.out.println(Arrays.toString(circles)+"tang len:"+ran+"%");
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
