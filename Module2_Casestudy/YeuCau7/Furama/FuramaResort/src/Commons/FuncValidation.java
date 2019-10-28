package Commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex="";
    private static Scanner sc;
    public static boolean checkNameServices(String str){
        regex="^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})((\\s)([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})){0,3}$";
        return str.matches(regex);
    }
    public static double checkValidNumberDouble(String content,String errmess){
        while (true){
            try {
                sc=new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            }catch (Exception ex){
                System.out.println(errmess);
            }
        }
    }
    public static Integer checkValidNumberInteger(String content,String errmess){
        while (true){
            try {
                sc=new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            }catch (Exception ex){
                System.out.println(errmess);
            }
        }
    }
    public static Float checkValidNumberFloat(String content,String errmess){
        while (true){
            try {
                sc=new Scanner(System.in);
                System.out.println(content);
                return sc.nextFloat();
            }catch (Exception ex){
                System.out.println(errmess);
            }
        }
    }
}
