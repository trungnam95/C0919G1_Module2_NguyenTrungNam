package Controllers;

import Commons.FuncValidation;
import Commons.FunctionWriteAndReadFileCSV;
import Models.*;
import com.sun.javafx.stage.FocusUngrabEvent;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    private static Queue<Customer> customerQueue = new LinkedList<Customer>();
    MainController mainController = new MainController();

    private static Services addNewService(Services services) {
        String content = "";
        String errMes = "";
        System.out.println("Enter Name Service");
        services.setServiceName(sc.nextLine());
        while (!FuncValidation.checkNameServices(services.getServiceName())) {
            System.out.println("Enter Name Service is valid please try again!");
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
        System.out.println("Enter Type Rent");
        services.setTypeRent(sc.nextLine());
        while (!FuncValidation.checkTypeRent(services.getTypeRent())) {
            System.out.println("Enter Type Rent is Day,Month or Year");
            services.setTypeRent(sc.nextLine());
        }
        services.setID(java.util.UUID.randomUUID().toString().replace("-", ""));
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
        while (!FuncValidation.checkNameServices(((Villa) villa).getStandardRoom())) {
            System.out.println("Room standard is invalid.Please try again !");
            System.out.println("Enter room standard:");
            ((Villa) villa).setStandardRoom(sc.nextLine());
        }
        System.out.println("Enter Description");
        ((Villa) villa).setComfortDescription(sc.nextLine());
        content = "Enter number of floor";
        errMes = "Number of floor is invalid (Number of floor >0 and must be a integer).please try again";
        ((Villa) villa).setAmountFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        while (((Villa) villa).getAmountFloors() <= 0) {
            System.out.println(errMes);
            ((Villa) villa).setAmountFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        }
//        System.out.println("Enter Amount Floors");
//        ((Villa) villa).setAmountFloors(sc.nextLine());
        content = "Enter area pool";
        errMes = "area poll is invalid (Area >30 and must be a float).please try again";
        ((Villa) villa).setPoolArea(FuncValidation.checkValidNumberFloat(content, errMes));
        while (((Villa) villa).getPoolArea() <= 30) {
            System.out.println(errMes);
            ((Villa) villa).setPoolArea(FuncValidation.checkValidNumberFloat(content, errMes));
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
        String content = "";
        String errMes = "";
        ArrayList<House> oldList = FunctionWriteAndReadFileCSV.getHouseFromCSV();
        Services house = new House();
        addNewService(house);
        System.out.println("Enter room standard");
        ((House) house).setStandardRoom(sc.nextLine());
        while (!FuncValidation.checkNameServices(((House) house).getStandardRoom())) {
            System.out.println("Room standard is invalid.Please try again !");
            System.out.println("Enter room standard:");
            ((House) house).setStandardRoom(sc.nextLine());
        }
        System.out.println("Enter Description");
        ((House) house).setComfortDescription(sc.nextLine());
        content = "Enter number of floor";
        errMes = "Number of floor is invalid (Number of floor >0 and must be a integer).please try again";
        ((House) house).setAmountFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        while (((House) house).getAmountFloors() <= 0) {
            System.out.println(errMes);
            ((House) house).setAmountFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        }
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
        System.out.println("Enter Service Free");
        ((Room) room).setServiceFree(sc.nextLine());
        while (!FuncValidation.checkServiceFree(((Room) room).getServiceFree())) {
            System.out.println("Service free is:Karaoke,Massage or Food.Please try again !");
            System.out.println("Enter room standard:");
            ((Room) room).setServiceFree(sc.nextLine());
        }
//        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        oldList.add((Room) room);
        FunctionWriteAndReadFileCSV.writeRoomToCSV(oldList);
        System.out.println("\nAdd Room: " + room.getServiceName() + " Successfully");
//        sc.nextLine();
        backToMenu();
    }

    public static void displayMainMenu() {
        System.out.println("1.Add new service");
        System.out.println("2.Show service");
        System.out.println("3.Add new customer");
        System.out.println("4.Show information customer");
        System.out.println("5.Add new booking resort");
        System.out.println("6.Show information employee");
        System.out.println("7.Add customer ticket");
        System.out.println("8.show customer ticket");
        System.out.println("9.search Employee");
        System.out.println("10.Exit");
        String input = sc.nextLine();
        switch (input) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomers();
                displayMainMenu();
                break;
            case "5":
                addNewBookingResort();
                break;
            case "6":
                showInforEmploy();
                displayMainMenu();
                break;
            case "7":
                addBookingTicket();
                break;
            case "8":
                displayBookTicket();
                displayMainMenu();
                break;
            case "9":
                searchEmployee();
                backToMenu();
                break;
            case "10":
                System.exit(0);
            default:
                System.out.println("false");
                backToMenu();
        }
    }

    private static void addNewServices() {
        System.out.println("1.Add new Villa");
        System.out.println("2.Add new House");
        System.out.println("3.Add new Room");
        System.out.println("4.Back to menu");
        System.out.println("5.Exit");
        String input = sc.nextLine();
        switch (input) {
            case "1":
                addServiceVilla();
                break;
            case "2":
                addServiceHouse();
                break;
            case "3":
                addServiceRoom();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
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
                "\n4.Show All Name Villa Not Duplicate" +
                "\n5.Show All Name House Not Duplicate" +
                "\n6.Show All Name Room Not Duplicate" +
                "\n7.Back to Menu." +
                "\n8.Exit.");
        switch (sc.nextLine()) {
            case "1":
                showAllVilla();
                displayMainMenu();
                break;
            case "2":
                showAllHouse();
                displayMainMenu();
                break;
            case "3":
                showAllRoom();
                displayMainMenu();
                break;
            case "4":
                showAllNameVillaNotDuplicate();
                displayMainMenu();
                break;
            case "5":
                showAllNameHouseNotDuplicate();
                displayMainMenu();
                break;
            case "6":
                showAllNameRoomNotDuplicate();
                displayMainMenu();
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
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

    private static void showInformationCustomers() {
        ArrayList<Customer> listCustomer = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
        //sap xep theo alpha B
        listCustomer.sort(new SortName());
        for (Customer customer : listCustomer) {
            System.out.println("\n=================");
            System.out.println(customer.showInfor());
            System.out.println("\n=================");
        }
    }

    private static void addNewCustomer() {
        System.out.println("==============Customer===========");
        ArrayList<Customer> oldList = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
        Customer customer = new Customer();
        customer.setIDCustomer(java.util.UUID.randomUUID().toString().replace("-", ""));
        System.out.println("Enter name customer");
        customer.setNameCustomer(sc.nextLine());
        while (!FuncValidation.checkNameServices(customer.getNameCustomer())) {
            System.out.println("Enter name customer is invalid please try again! ");
            customer.setNameCustomer(sc.nextLine());
        }
        System.out.println("Enter birthday customer");
        customer.setBirthday(sc.nextLine());
        while (!FuncValidation.checkBirthday(customer.getBirthday())) {
            System.out.println("Enter birthday customer follow dd/mm/yy please try again!");
            customer.setBirthday(sc.nextLine());
        }
        System.out.println("Enter gender customer Male/Female/Unknow");
        customer.setGender(sc.nextLine());
//        FuncValidation.checkType(customer.getGender());
        while (!FuncValidation.checkGender(customer.getGender())) {
            System.out.println("Enter gender customer Male/Female/Unknow please try again!");
            customer.setGender(sc.nextLine());
        }
        System.out.println("Enter id card customer");
        customer.setIdCard(sc.nextLine());
        while (!FuncValidation.checkIDCard(customer.getIdCard())) {
            System.out.println("Enter id card customer is have 9 digits please try again!");
            customer.setIdCard(sc.nextLine());
        }
        System.out.println("Enter phone number");
        customer.setPhoneNumber(sc.nextLine());
        while (!FuncValidation.checkPhoneNumber(customer.getPhoneNumber())) {
            System.out.println("Enter phone number is invalid please try again!");
            customer.setPhoneNumber(sc.nextLine());
        }
//        sc.nextLine() ;
        System.out.println("Enter email customer");
        customer.setEmailCustomer(sc.nextLine());
        while (!FuncValidation.checkEmail(customer.getEmailCustomer())) {
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

    private static void addNewBookingResort() {
        try {
            ArrayList<Customer> listCustomers = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
            //sap xep
            listCustomers.sort(new SortName());
            int i = 1;
            for (Customer cus : listCustomers) {
                System.out.println("\n========================");
                System.out.println("No " + i);
                System.out.println(cus.showInfor());
                System.out.println("\n========================");
                i++;
            }
            System.out.println("Choose customer booking");
            Customer customer= listCustomers.get(sc.nextInt() - 1);
        } catch (Exception ex) {
            System.out.println("Error");
            addNewBookingResort();
        }
        ArrayList<Customer> listCustomers = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
        Customer customer= listCustomers.get(sc.nextInt() - 1);
        System.out.println("\n1.Booking Villa");
        System.out.println("\n2.Booking House");
        System.out.println("\n3.Booking Room");
        System.out.println("\nChoose service booking");
        sc.nextLine();
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                int i = 1;
                ArrayList<Villa> listVillas = FunctionWriteAndReadFileCSV.getVillaFromCSV();
                for (Villa villa : listVillas) {
                    System.out.println("\n========================");
                    System.out.println("No " + i);
                    System.out.println(villa.showInfor());
                    System.out.println("\n========================");
                    i++;
                }
                System.out.println("Choose villa booking");
                Villa villa = listVillas.get(sc.nextInt() - 1);
                customer.setServices(villa);
                break;
            case "2":
                i = 1;
                ArrayList<House> listHouses = FunctionWriteAndReadFileCSV.getHouseFromCSV();
                for (House house : listHouses) {
                    System.out.println("\n========================");
                    System.out.println("No " + i);
                    System.out.println(house.showInfor());
                    System.out.println("\n========================");
                    i++;
                }
                System.out.println("Choose House booking");
                House house = listHouses.get(sc.nextInt() - 1);
                customer.setServices(house);
                break;
            case "3":
                i = 1;
                ArrayList<Room> listRooms = FunctionWriteAndReadFileCSV.getRoomFromCSV();
                for (Room room : listRooms) {
                    System.out.println("\n========================");
                    System.out.println("No " + i);
                    System.out.println(room.showInfor());
                    System.out.println("\n========================");
                    i++;
                }
                System.out.println("Choose Room booking");
                Room room = listRooms.get(sc.nextInt() - 1);
                customer.setServices(room);
                break;
            default:
                backToMenu();
                break;
        }
//        oldList.add(customer);
//        FunctionWriteAndReadFileCSV.writeCustomerToCSV(oldList);
        ArrayList<Customer> listBooking = FunctionWriteAndReadFileCSV.getBooking();
        listBooking.add(customer);
//        System.out.println(listBooking.get(0).getServices().getServiceName());
        FunctionWriteAndReadFileCSV.writeBookingToCSV(listBooking);
        System.out.println("\nAdd Booking for : " + customer.getNameCustomer() + " Successfully");
        sc.nextLine();
        backToMenu();
    }

    private static void showAllNameVillaNotDuplicate() {
        String pathVilla = "src/Data/Villa.csv";
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            System.out.println("File Villa does not exit");
        } else {
            TreeSet<String> listVillaTreeSet = FunctionWriteAndReadFileCSV.getAllNameServiceFromCSV(pathVilla);
            System.out.println("======List Villa Name Service Not Duplicate");
            for (String str : listVillaTreeSet) {
                System.out.println(str);
                System.out.println("\n===========");
            }
        }
        backToMenu();
    }

    private static void showAllNameHouseNotDuplicate() {
        String pathHouse = "src/Data/House.csv";
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            System.out.println("File House does not exit");
        } else {
            TreeSet<String> listHouseTreeSet = FunctionWriteAndReadFileCSV.getAllNameServiceFromCSV(pathHouse);
            System.out.println("======List House Name Service Not Duplicate");
            for (String str : listHouseTreeSet) {
                System.out.println(str);
                System.out.println("\n===========");
            }
        }
        backToMenu();
    }

    private static void showAllNameRoomNotDuplicate() {
        String pathRoom = "src/Data/Room.csv";
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            System.out.println("File Room does not exit");
        } else {
            TreeSet<String> listRoomTreeSet = FunctionWriteAndReadFileCSV.getAllNameServiceFromCSV(pathRoom);
            System.out.println("======List Room Name Service Not Duplicate");
            for (String str : listRoomTreeSet) {
                System.out.println(str);
                System.out.println("\n===========");
            }
        }
        backToMenu();
    }

    public static Map<Integer, Employee> creatListEmployeeToMap() {
        Employee employee = new Employee("nguyen van A", 25, "da nang", 1);
        Employee employee1 = new Employee("nguyen van B", 21, "HCM", 2);
        Employee employee2 = new Employee("nguyen van C", 25, "Hue", 3);
        Employee employee3 = new Employee("nguyen van D", 21, "Nghe an", 4);
        Employee employee4 = new Employee("nguyen van E", 25, "Yen bai", 5);
        Employee employee5 = new Employee("nguyen van F", 21, "Ha noi", 6);
        Employee employee6 = new Employee("nguyen van G", 25, "Thai binh", 7);
        Employee employee7 = new Employee("nguyen van H", 21, "Dong nai", 8);
        Employee employee8 = new Employee("nguyen van J", 25, "Da lat", 9);
        Employee employee9 = new Employee("nguyen van K", 21, "Quang nam", 10);
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(employee.getcodeEmployee(), employee);
        map.put(employee1.getcodeEmployee(), employee1);
        map.put(employee2.getcodeEmployee(), employee2);
        map.put(employee3.getcodeEmployee(), employee3);
        map.put(employee4.getcodeEmployee(), employee4);
        map.put(employee5.getcodeEmployee(), employee5);
        map.put(employee6.getcodeEmployee(), employee6);
        map.put(employee7.getcodeEmployee(), employee7);
        map.put(employee8.getcodeEmployee(), employee8);
        map.put(employee9.getcodeEmployee(), employee9);
        return map;
    }

    private static void showInforEmploy() {
        Map<Integer, Employee> map = creatListEmployeeToMap();
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(map.get(key));
        }
    }

    private static void addBookingTicket() {
        try {
            ArrayList<Customer> listCustomers = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
            //sap xep
            listCustomers.sort(new SortName());
            int i = 1;
            for (Customer cus : listCustomers) {
                System.out.println("\n========================");
                System.out.println("No " + i);
                System.out.println(cus.showInfor());
                System.out.println("\n========================");
                i++;
            }
            System.out.println("choose customer to book");
            Customer customer = listCustomers.get(sc.nextInt() - 1);
            customerQueue.add(customer);
            sc.nextLine();
            backToMenu();
        } catch (Exception ex) {
            System.out.println("Error!");
            sc.nextLine();
            addBookingTicket();
        }
    }

    private static void displayBookTicket() {
        for (Customer cus : customerQueue) {
            System.out.println(cus.showInfor());
        }
    }
    private static void searchEmployee(){
        Stack<Employee> stackEmployee = addTuHoSo();
        System.out.print("Enter name employee: ");
        String code = sc.nextLine();
        try {
            while (true) {
                if (!stackEmployee.peek().getNameEmployee().equals(code)) {
                    stackEmployee.pop();
                } else {
                    System.out.println(stackEmployee.peek().toString());
                    break;
                }
            }
        } catch (EmptyStackException ex) {
            System.out.print("false\n");
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
