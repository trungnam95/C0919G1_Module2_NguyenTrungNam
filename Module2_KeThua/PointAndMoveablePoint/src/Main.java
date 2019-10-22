import Models.MoveablePoint;
import Models.Point;

public class Main {
    public static void main(String[] args) {
//        Point point=new Point(2,3);
//        System.out.println(point);
//        MoveablePoint moveablePoint=new MoveablePoint(3,4);
//        System.out.println(moveablePoint);
        Point point = new Point();
        point.setX(0);
        point.setY(3);
        System.out.println("Point:"+point.toString());
        point.setXY(0, 4);
        System.out.println("Point : " + point.toString());
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setX(point.getX());
        moveablePoint.setY(point.getY());
        moveablePoint.setxSpeed(3);
        moveablePoint.setySpeed(2);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
