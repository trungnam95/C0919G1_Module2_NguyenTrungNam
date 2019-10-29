package Commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex="";
    private static Scanner sc;
    public static boolean checkNameServices(String str){
        regex="^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})((\\s)([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})){0,3}$";
        return str.matches(regex);
    }
    public static boolean checkBirthday(String str){
        regex="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
        return str.matches(regex);
    }
    public static boolean checkIDCard(String str){
        regex="^[\\d]{9}$";
        return str.matches(regex);
    }
    public static boolean checkEmail(String str){
        regex="^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        return str.matches(regex);
    }
    public static boolean checkPhoneNumber(String str){
        regex="(09|01[2|6|8|9])+([0-9]{8})\\b";
        return str.matches(regex);
    }
    public static boolean checkGender(String str){
        regex="Female\\b|Male\\b|Unknow\\b";
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
