package Controllers;

import Commons.FuncValidation;
import Commons.FunctionWriteAndReadFileCSV;
import Models.*;
import com.sun.javafx.stage.FocusUngrabEvent;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    MainController mainController = new MainController();

    private static Services addNewService(Services services) {
        sc.nextLine();
        String content = "";
        String errMes = "";
        System.out.println("Enter Name Service");
        services.setServiceName(sc.nextLine());
        while (!FuncValidation.checkNameServices(services.getServiceName())) {
            System.out.println("Enter Name Service");
            services.setServiceName(sc.nextLine());
        }
        //Enter Area Used
        content = "Enter Area Used";
        errMes = "Area used is invalid (Area >30 and Area must is a double).Please try again";
        services.setAreaUsed(FuncValidation.checkValidNumberDouble(content, errMes));
        while (services.getAreaUsed() <= 30) {
            System.out.println(errMes);
            services.setAreaUsed(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        //Enter rentCost
        content = "Enter Rent cost";
        errMes = "Rent cost is invalid (Cost >0 and cost must is a double).Please try again";
        services.setRentCost(FuncValidation.checkValidNumberDouble(content, errMes));
        while (services.getRentCost() <= 0) {
            System.out.println(errMes);
            services.setRentCost(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        //Enter amount people
        content = "Enter amount people";
        errMes = "Amount people is invalid (amount >0 and <20,amount must is a integer).Please try again";
        services.setAmountPeople(FuncValidation.checkValidNumberInteger(content, errMes));
        while (services.getAmountPeople() <= 0 || services.getAmountPeople() >= 20) {
            System.out.println(errMes);
            services.setAmountPeople(FuncValidation.checkValidNumberInteger(content, errMes));
        }

        return services;
    }

    private static void backToMenu() {
        System.out.println("===========press any key to back to menu=============");
        sc.nextLine();
        displayMainMenu();
    }

    private static void addServiceVilla() {
//        sc.nextLine();
        System.out.println("==============Villa===========");
        String content = "";
        String errMes = "";
        ArrayList<Villa> oldList = FunctionWriteAndReadFileCSV.getVillaFromCSV();
        Services villa = new Villa();
        addNewService(villa);
        System.out.println("Enter room standard");
        ((Villa) villa).setStandardRoom(sc.nextLine());
        while (!FuncValidation.checkNameServices(((Villa)villa).getStandardRoom())){
            System.out.println("Room standard is invalid.Please try again !");
            System.out.println("Enter room standard:");
            ((Villa)villa).setStandardRoom(sc.nextLine());
        }
        System.out.println("Enter Description");
        ((Villa) villa).setComfortDescription(sc.nextLine());
        content="Enter number of floor";
        errMes="Number of floor is invalid (Number of floor >0 and must be a integer).please try again";
        ((Villa)villa).setAmountFloors(FuncValidation.checkValidNumberInteger(content,errMes));
        while (((Villa)villa).getAmountFloors()<=0){
            System.out.println(errMes);
            ((Villa)villa).setAmountFloors(FuncValidation.checkValidNumberInteger(content,errMes));
        }
//        System.out.println("Enter Amount Floors");
//        ((Villa) villa).setAmountFloors(sc.nextLine());
        content="Enter area pool";
        errMes="area poll is invalid (Area >30 and must be a float).please try again";
        ((Villa)villa).setPoolArea(FuncValidation.checkValidNumberFloat(content,errMes));
        while (((Villa)villa).getPoolArea()<=30){
            System.out.println(errMes);
            ((Villa)villa).setPoolArea(FuncValidation.checkValidNumberFloat(content,errMes));
        }

//        System.out.println("Enter Pool Area");
//        ((Villa) villa).setPoolArea(sc.nextFloat());
//        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        oldList.add((Villa) villa);
        FunctionWriteAndReadFileCSV.writeVillaToCSV(oldList);
        System.out.println("\nAdd Villa: " + villa.getServiceName() + " Successfully");
        backToMenu();
    }

    private static void addServiceHouse() {
        System.out.println("==============House===========");
        ArrayList<House> oldList = FunctionWriteAndReadFileCSV.getHouseFromCSV();
        Services house = new House();
        addNewService(house);
        sc.nextLine();
        System.out.println("Enter room standard");
        ((House) house).setStandardRoom(sc.nextLine());
        System.out.println("Enter Description");
        ((House) house).setComfortDescription(sc.nextLine());
        System.out.println("Enter Amount Floors");
        ((House) house).setAmountFloors(sc.nextInt());
//        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        oldList.add((House) house);
        FunctionWriteAndReadFileCSV.writeHouseToCSV(oldList);
        System.out.println("\nAdd Villa: " + house.getServiceName() + " Successfully");
//        sc.nextLine();
        backToMenu();
    }

    private static void addServiceRoom() {
        System.out.println("==============Room===========");
        ArrayList<Room> oldList = FunctionWriteAndReadFileCSV.getRoomFromCSV();
        Services room = new Room();
        addNewService(room);
        sc.nextLine();
        System.out.println("Enter room standard");
        ((Room) room).setServiceFree(sc.nextLine());
//        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        oldList.add((Room) room);
        FunctionWriteAndReadFileCSV.writeRoomToCSV(oldList);
        System.out.println("\nAdd Villa: " + room.getServiceName() + " Successfully");
//        sc.nextLine();
        backToMenu();
    }

    public static void displayMainMenu() {
        System.out.println("1.Add new service");
        System.out.println("2.Show service");
        System.out.println("3.Add new customer");
        System.out.println("4.Show information customer");
        System.out.println("5.Exit");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:showInformationCustomers();
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("false");
                break;
        }
    }

    private static void addNewServices() {
        System.out.println("1.Add new Villa");
        System.out.println("2.Add new House");
        System.out.println("3.Add new Room");
        System.out.println("4.Back to menu");
        System.out.println("5.Exit");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                addServiceVilla();
                break;
            case 2:
                addServiceHouse();
                break;
            case 3:
                addServiceRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("false");
                backToMenu();
        }
    }

    private static void showServices() {
        System.out.println("\n==========ShowInfo==========" +
                "\n1.Show All Villa." +
                "\n2.Show All House." +
                "\n3.Show All Room." +
                "\n4.Back to Menu." +
                "\n5.Exit.");
        switch (sc.nextInt()) {
            case 1:
                showAllVilla();
                displayMainMenu();
                break;
            case 2:
                showAllHouse();
                displayMainMenu();
                break;
            case 3:
                showAllRoom();
                displayMainMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Error");
                backToMenu();
        }
    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FunctionWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n=================");
            System.out.println(villa.showInfor());
            System.out.println("\n=================");
        }


    }

    private static void showAllHouse() {
        ArrayList<House> listHouse = FunctionWriteAndReadFileCSV.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.println("\n=================");
            System.out.println(house.showInfor());
            System.out.println("\n=================");
        }
    }

    private static void showAllRoom() {
        ArrayList<Room> listRoom = FunctionWriteAndReadFileCSV.getRoomFromCSV();
        for (Room room : listRoom) {
            System.out.println("\n=================");
            System.out.println(room.showInfor());
            System.out.println("\n=================");
        }
    }
    private static void showInformationCustomers(){
        ArrayList<Customer> listCustomer = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
        for (Customer customer : listCustomer) {
            System.out.println("\n=================");
            System.out.println(customer.showInforCustomer());
            System.out.println("\n=================");
        }
    }
    private static void addNewCustomer(){
        sc.nextLine() ;
        System.out.println("==============Customer===========");
        ArrayList<Customer> oldList = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
        Customer customer = new Customer();
        customer.setIDCustomer(java.util.UUID.randomUUID().toString().replace("-", ""));
        System.out.println("Enter name customer");
        customer.setNameCustomer(sc.nextLine());
        while (!FuncValidation.checkNameServices(customer.getNameCustomer())){
            System.out.println("Enter name customer is invalid please try again! ");
            customer.setNameCustomer(sc.nextLine());
        }
        System.out.println("Enter birthday customer");
        customer.setBirthday(sc.nextLine());
        while (!FuncValidation.checkBirthday(customer.getBirthday())){
            System.out.println("Enter birthday customer is invalid please try again!");
            customer.setBirthday(sc.nextLine());
        }
        System.out.println("Enter gender customer");
        customer.setGender(sc.nextLine());
        System.out.println("Enter id card customer");
        customer.setIdCard(sc.nextLine());
        while (!FuncValidation.checkIDCard(customer.getIdCard())){
            System.out.println("Enter id card customer is invalid please try again!");
            customer.setIdCard(sc.nextLine());
        }
        System.out.println("Enter phone number");
        customer.setPhoneNumber(sc.nextLine());
        while(!FuncValidation.checkPhoneNumber(customer.getPhoneNumber())){
            System.out.println("Enter phone number is invalid please try again!");
            customer.setPhoneNumber(sc.nextLine());
        }
//        sc.nextLine() ;
        System.out.println("Enter email customer");
        customer.setEmailCustomer(sc.nextLine());
        while (!FuncValidation.checkEmail(customer.getEmailCustomer())){
            System.out.println("Enter email customer is invalid please try again!");
            customer.setEmailCustomer(sc.nextLine());
        }
        System.out.println("Enter type customer");
        customer.setTypeCustomer(sc.nextLine());
        System.out.println("Enter address customer");
        customer.setAddress(sc.nextLine());
        oldList.add(customer);
        FunctionWriteAndReadFileCSV.writeCustomerToCSV(oldList);
        System.out.println("\nAdd Customer: " + customer.getNameCustomer() + " Successfully");
//        sc.nextLine();
        backToMenu();

    }
}
