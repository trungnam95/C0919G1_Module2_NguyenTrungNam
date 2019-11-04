package Models;

import javax.crypto.spec.PSource;
import javax.xml.crypto.Data;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class TuHoSo {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Employee> stackEmployee = addTuHoSo();
        System.out.print("Enter code employee: ");
        int code = sc.nextInt();
        try {
            while (true) {
                if (stackEmployee.peek().getcodeEmployee()!= code) {
                    stackEmployee.pop();
                } else {
                    System.out.println(stackEmployee.peek().toString());
                    break;
                }
            }
        } catch (EmptyStackException ex) {
            System.out.print("false");
        }
    }
    public static Stack<Employee> addTuHoSo() {
        Employee employee = new Employee("nguyen van A", 25, "da nang", 1);
        Employee employee1 = new Employee("nguyen van B", 21, "HCM", 2);
        Employee employee2 = new Employee("nguyen van C", 25, "Hue", 3);
        Employee employee3 = new Employee("nguyen van D", 21, "Nghe an", 4);
        Employee employee4 = new Employee("nguyen van E", 25, "Yen bai", 5);
        Employee employee5 = new Employee("nguyen van F", 21, "Ha noi", 6);
        Employee employee6= new Employee("nguyen van G", 25, "Thai binh", 7);
        Employee employee7 = new Employee("nguyen van H", 21, "Dong nai", 8);
        Employee employee8= new Employee("nguyen van J", 25, "Da lat", 9);
        Employee employee9 = new Employee("nguyen van K", 21, "Quang nam", 10);

        Stack<Employee> employees = new Stack<Employee>();
        employees.push(employee);
        employees.push(employee1);
        employees.push(employee2);
        employees.push(employee3);
        employees.push(employee4);
        employees.push(employee5);
        employees.push(employee6);
        employees.push(employee7);
        employees.push(employee8);
        employees.push(employee9);
        return employees;
    }
}
