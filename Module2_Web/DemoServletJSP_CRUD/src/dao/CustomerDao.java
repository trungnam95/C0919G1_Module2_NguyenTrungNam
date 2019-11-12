package dao;

import Model.Customer;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer, Customer> listCustomer=new HashMap<Integer, Customer>();
    static {
        initCustomers();
    }
    private static void initCustomers(){
        Customer cus1=new Customer(1,"Nguyen Trung Nam","0898410495","nguyentrungnam100495@gmail.com");
        Customer cus2=new Customer(2,"Nguyen Ba Kien","0905194471","nguyenbakien@gmail.com");
        Customer cus3=new Customer(3,"Le Tam","0905917845","letam@gmail.com");
        Customer cus4=new Customer(4,"Ho Huong","0932547183","hohuong@gmail.com");

        listCustomer.put(cus1.getId(),cus1);
        listCustomer.put(cus2.getId(),cus2);
        listCustomer.put(cus3.getId(),cus3);
        listCustomer.put(cus4.getId(),cus4);
    }
    //phương thức lấy thông tin customer dựa theo ID
    public static Customer getCustomer(int customerId){
        return listCustomer.get(customerId);
    }
    //phương thức thêm mới 1 customer vào danh sách
    public static void addCustomer(Customer customer){
        listCustomer.put(customer.getId(),customer);
    }
    //phương thức update 1 customer
    public static Customer updateAndCreateCustomer(Customer customer){
        listCustomer.put(customer.getId(),customer);
        return customer;
    }
    //phương thức xóa 1 customer
    public static void deleteCustomer(int customerId){
        listCustomer.remove(customerId);
    }
    //phương thức lấy danh sách tất cả customer trong collection
    public static List<Customer> getAllCustomer(){
        Collection<Customer> c=listCustomer.values();
        List<Customer> list=new ArrayList<Customer>();
        list.addAll(c);
        return list;
    }
}
