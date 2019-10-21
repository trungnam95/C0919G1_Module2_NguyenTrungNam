package LopCircleAndCylinder.Models;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume(){
        return height*getArea();
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "Volume" + Volume() +
                '}';
    }
}
