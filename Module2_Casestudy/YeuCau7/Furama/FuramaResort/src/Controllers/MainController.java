package Controllers;

import Commons.FunctionWriteAndReadFileCSV;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    MainController mainController=new MainController();
    private static Services addNewService(Services services) {
        sc.nextLine();
        System.out.println("Enter Name Service");
        services.setServiceName(sc.nextLine());
        System.out.println("Enter Area Used ");
        services.setAreaUsed(sc.nextDouble());
        System.out.println("Enter Rentcost");
        services.setRentCost(sc.nextDouble());
        System.out.println("Enter Amount People");
        services.setAmountPeople(sc.nextInt());
        return services;
    }
    private static void backToMenu(){
        System.out.println("===========press any key to back to menu=============");
        sc.nextLine();
        displayMainMenu();
    }

    private static void addServiceVilla() {

        System.out.println("==============Villa===========");
        Services villa = new Villa();
        addNewService(villa);
        sc.nextLine();
        System.out.println("Enter room standard");
        ((Villa) villa).setStandardRoom(sc.nextLine());
        System.out.println("Enter Description");
        ((Villa) villa).setComfortDescription(sc.nextLine());
        System.out.println("Enter Amount Floors");
        ((Villa) villa).setAmountFloors(sc.nextLine());
        System.out.println("Enter Pool Area");
        ((Villa) villa).setPoolArea(sc.nextFloat());
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        listVilla.add((Villa) villa);
        FunctionWriteAndReadFileCSV.writeVillaToCSV(listVilla);
        System.out.println("\nAdd Villa: " + villa.getServiceName() + " Successfully");
        sc.nextLine();
        backToMenu();
    }

    private static void addServiceHouse() {
        System.out.println("==============House===========");
    }

    private static void addServiceRoom() {
        System.out.println("==============Room===========");
    }

    public static void displayMainMenu() {
        System.out.println("1.Add new service");
        System.out.println("2.Show service");
        System.out.println("3.Exit");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                addNewServices();
            case 2:
                showServices();
            case 3:
                break;
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
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
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
    private static void showAllVilla(){
        ArrayList<Villa> listVilla=FunctionWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa:listVilla) {
            System.out.println("\n=================");
            System.out.println(villa.showInfor());
            System.out.println("\n=================");
        }


    }
    private static void showAllHouse(){

    }
    private static void showAllRoom(){

    }
}
