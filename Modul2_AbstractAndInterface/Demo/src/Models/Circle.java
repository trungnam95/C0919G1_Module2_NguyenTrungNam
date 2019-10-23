package Models;

public class Circle extends Shape implements Sizeable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
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
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println( "circle after up size:" +percent+" % is "+(getArea()+(getArea()*(percent/100))));
    }
}
