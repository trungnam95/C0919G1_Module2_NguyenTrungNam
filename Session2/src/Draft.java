public class Draft {
    public static void main(String[] args) {
        class SimpleCircle{
            double radius;
            SimpleCircle(){
                radius=1;
            }
            SimpleCircle(double newRadius){
                radius=newRadius;
            }
            void setRadius(double newRadius){
                radius=newRadius;
            }
            double getArea(){
                return Math.pow(radius,2)*Math.PI;
            }
            double getPerimeter(){
                return 2*radius*Math.PI;
            }
        }
        SimpleCircle cir1=new SimpleCircle();
        System.out.println("the area is: "+ cir1.radius+" is"+cir1.getArea());
        SimpleCircle cir2=new SimpleCircle(25);
        System.out.println("the area is: "+ cir2.radius+" is"+cir2.getArea());
        cir2.radius=100;
        System.out.println("the area is: "+ cir2.radius+" is"+cir2.getArea());
    }
}
