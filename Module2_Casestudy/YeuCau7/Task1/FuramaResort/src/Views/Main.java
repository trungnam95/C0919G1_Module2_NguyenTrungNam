package Views;
import Models.House;
import Models.Services;
import Models.Villa;
import com.opencsv.CSVIterator;
import com.opencsv.CSVReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("==============Villa===========");
        System.out.println("input name service: ");
        Scanner scanner=new Scanner(System.in);
        Villa villa=new Villa();
        villa.setServiceName(scanner.nextLine());
        System.out.println("input Area use:");
        villa.setAreaUsed(scanner.nextDouble());
        System.out.println("input Rent cost");
        villa.setRentCost(scanner.nextDouble());
        System.out.println("input amount people");
        villa.setAmountPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("input standard villa");
        villa.setStandardRoom(scanner.nextLine());
        System.out.println("input description ");
        villa.setComfortDescription(scanner.nextLine());
        System.out.println("input area pool");
        villa.setPoolArea(scanner.nextFloat());
        scanner.nextLine();
        System.out.println("input amount floor");
        villa.setAmountFloors(scanner.nextLine());
        System.out.println(villa);
        System.out.println("==============House=============");
        House house=new House();
        System.out.println("input name service: ");
        house.setServiceName(scanner.nextLine());
        System.out.println("input Area use:");
        house.setAreaUsed(scanner.nextDouble());
        System.out.println("input Rent cost");
        house.setRentCost(scanner.nextDouble());
        System.out.println("input amount people");
        house.setAmountPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("input standard house");
        house.setStandardRoom(scanner.nextLine());
        System.out.println("input description ");
        house.setComfortDescription(scanner.nextLine());
        scanner.nextLine();
        System.out.println("input amount floor");
        house.setAmountFloors(scanner.nextLine());
        System.out.println(house);
    }
}
