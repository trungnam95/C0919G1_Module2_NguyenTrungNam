package LopPTBac2;

public class PTB2 {
    private double a;
    private double b;
    private double c;

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PTB2() {
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

    public double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDelta())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDelta())) / (2 * a);
    }

    public double nghiemDuyNhat() {
        return -c / b;
    }

    public double nghiemKep() {
        return -b / 2 * a;
    }
}
