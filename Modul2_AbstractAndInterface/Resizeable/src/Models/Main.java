package Models;

class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(2.1);
        shapes[1] = new Circle(6);
        shapes[2] = new Rectangle(4,2.3);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            shapes[i].resize(getRandom());
        }
    }
    public static int getRandom() {
        return (int) (Math.random() * 100 + 1);
    }
}
