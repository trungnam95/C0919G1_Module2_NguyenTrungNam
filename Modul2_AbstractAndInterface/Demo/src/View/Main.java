package View;

import Models.Circle;
import Models.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[2];
        shapes[0]=new Circle(3);
        shapes[1]=new Circle(3.9);
        for (int i = 0; i <shapes.length ; i++) {
            System.out.println(shapes[i]);
            shapes[i].resize(random());
        }
    }
    private static int random(){
        return (int) (Math.random() * 100) +1;
    }

}