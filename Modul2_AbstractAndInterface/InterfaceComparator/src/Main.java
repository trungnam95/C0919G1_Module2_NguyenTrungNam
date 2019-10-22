import Models.Circle;
import Models.CircleComparator;
import Models.Rectangle;
import Models.RectangleComparator;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[3];
        rectangles[1]=new Rectangle(6.3,4.5);
        rectangles[0]=new Rectangle(9.6,5.6);
        rectangles[2]=new Rectangle(3.1,55.0);
        System.out.println("Pre sort");
        for (Rectangle rectangle:rectangles) {
            System.out.println(rectangle);
        }
        Comparator rectangleComparator=new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);
        System.out.println("After sort");
        for (Rectangle rectangle:rectangles) {
            System.out.println(rectangle);
        }
    }
}
