package Commons;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FunctionWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static final String pathCustomer = "src/Data/Customer.csv";
    private static final String pathBooking = "src/Data/Booking.csv";
    private static String[] headerRecordVilla = new String[]{"serviceName", "areaUsed", "rentCost", "amountPeople",
            "standardRoom", "comfortDescription", "amountFloors", "poolArea"};
    private static String[] headerRecordHouse = new String[]{"serviceName", "areaUsed", "rentCost", "amountPeople",
            "standardRoom", "comfortDescription", "amountFloors"};
    private static String[] headerRecordRoom = new String[]{"serviceName", "areaUsed", "rentCost", "amountPeople",
            "serviceFree"};
    private static String[] headerRecordCustomer = new String[]{"IDCustomer", "nameCustomer", "birthday", "gender",
            "idCard", "phoneNumber", "emailCustomer", "typeCustomer", "address"};
    private static String[] headerRecordBooking = new String[]{"IDCustomer", "nameCustomer", "birthday", "gender",
            "idCard", "phoneNumber", "emailCustomer", "typeCustomer", "address","serviceName", "areaUsed", "rentCost",
            "amountPeople"};
    //the line number to skip for start reading
    private static final int NUM_OF_LINE_SKIP = 1;

    //function write to by CSV
    public static void writeVillaToCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getServiceName(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRentCost()),
                        String.valueOf(villa.getAmountPeople()),
                        villa.getStandardRoom(),
                        villa.getComfortDescription(),
                        String.valueOf(villa.getAmountFloors()),
                        String.valueOf(villa.getPoolArea()),
                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        //kiem tra file co ton tai ko neu ko thi tao 1 file trong
        if (!Files.exists(path)) {
            try {
                Writer write = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla)).withMappingStrategy(strategy).
                    withSeparator(DEFAULT_SEPARATOR).
                    withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }

    public static void writeHouseToCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getServiceName(),
                        String.valueOf(house.getAreaUsed()),
                        String.valueOf(house.getRentCost()),
                        String.valueOf(house.getAmountPeople()),
                        house.getStandardRoom(),
                        house.getComfortDescription(),
                        String.valueOf(house.getAmountFloors()),
                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<House> getHouseFromCSV() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer write = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse)).withMappingStrategy(strategy).
                    withSeparator(DEFAULT_SEPARATOR).
                    withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }

    public static void writeRoomToCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getServiceName(),
                        String.valueOf(room.getAreaUsed()),
                        String.valueOf(room.getRentCost()),
                        String.valueOf(room.getAmountPeople()),
                        String.valueOf(room.getServiceFree()),
                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Room> getRoomFromCSV() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer write = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom)).withMappingStrategy(strategy).
                    withSeparator(DEFAULT_SEPARATOR).
                    withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }

    public static void writeCustomerToCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getIDCustomer(),
                        customer.getNameCustomer(),
                        customer.getBirthday(),
                        customer.getGender(),
                        customer.getIdCard(),
                        customer.getPhoneNumber(),
                        customer.getEmailCustomer(),
                        customer.getTypeCustomer(),
                        customer.getAddress(),
                });
            }
//String IDCustomer, String nameCustomer, String birthday, String gender, int idCard,
//                    int phoneNumber, String emailCustomer, String typeCustomer, String address
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Customer> getCustomerFromCSV() {
        Path path = Paths.get(pathCustomer);
        //kiem tra file co ton tai ko neu ko thi tao 1 file trong
        if (!Files.exists(path)) {
            try {
                Writer write = new FileWriter(pathCustomer);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer)).withMappingStrategy(strategy).
                    withSeparator(DEFAULT_SEPARATOR).
                    withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }
    public static void writeBookingToCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathBooking);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordBooking);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getIDCustomer(),
                        customer.getNameCustomer(),
                        customer.getBirthday(),
                        customer.getGender(),
                        customer.getIdCard(),
                        customer.getPhoneNumber(),
                        customer.getEmailCustomer(),
                        customer.getTypeCustomer(),
                        customer.getAddress(),
                        customer.getServices().getServiceName(),
                        String.valueOf(customer.getServices().getAreaUsed()),
                        String.valueOf(customer.getServices().getRentCost()),
                        String.valueOf(customer.getServices().getAmountPeople()),

                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Customer> getBookingFromCSV() {
        Path path = Paths.get(pathBooking);
        //kiem tra file co ton tai ko neu ko thi tao 1 file trong
        if (!Files.exists(path)) {
            try {
                Writer write = new FileWriter(pathBooking);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordBooking);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer)).withMappingStrategy(strategy).
                    withSeparator(DEFAULT_SEPARATOR).
                    withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }
}
