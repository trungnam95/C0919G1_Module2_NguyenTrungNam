package HeDoiTuongHinhHoc.Models;

public class Rectangle extends Shape {
        private double width=1.0;
        private double length=1.0;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public Rectangle(double side, double side1) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width " +
                 width + " and length "+length+" Which is a subclass of"+super.toString();
    }
}
