package Models;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInteger = new MyList<Integer>();
        for (int i = 0; i <10 ; i++) {
            ListInteger.add(i);
        }
        ListInteger.hienThi();
        System.out.println("element 3 is: "+ListInteger.get(3));
        System.out.println("element 1 is: "+ListInteger.get(1));
        System.out.println("element 2 is: "+ListInteger.get(2));
        try{
            ListInteger.get(6);
            System.out.println("element 6 is: "+ListInteger.get(6));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("loi");
        }
        try {
            ListInteger.get(-1);
            System.out.println("element -1 is:  " + ListInteger.get(-1));
        }catch (ArrayIndexOutOfBoundsException o){
            System.out.println("loi");
        }
    }
}
