import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String []student ={"Nam","Hung","Tom"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("input name student");
        String name=scanner.nextLine();
        check(student,name);
//        boolean checkName=false;
//        for (int i = 0; i <student.length ; i++) {
//            if(student[i].equals(name)){
//                System.out.println("find in "+i);
//                checkName=true;
//                break;
//            }
//        }
//        if(!checkName){
//            System.out.println("not find");
//        }
    }
    private static void check(String []arr, String val){
        boolean isTrue=false;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals(val)){
                System.out.println("find in"+i);
                isTrue=true;
                break;
            }
        }
        if(!isTrue){
            System.out.println("not find");
        }
    }
}
