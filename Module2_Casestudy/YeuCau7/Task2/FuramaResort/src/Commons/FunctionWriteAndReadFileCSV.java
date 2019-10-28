package Commons;

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
    private static String[] headerRecordVilla = new String[]{"serviceName", "areaUsed", "rentCost", "amountPeople",
            "standardRoom", "comfortDescription", "amountFloors", "poolArea"};
    //the line number to skip for start reading
    private static final int NUM_OF_LINE_SKIP=1;
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
    public static ArrayList<Villa> getVillaFromCSV(){
        Path path= Paths.get(pathVilla);
        if(!Files.exists(path)){
            try {
                Writer write=new FileWriter(pathVilla);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy=new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean=null;
        try {
            csvToBean=new CsvToBeanBuilder<Villa>(new FileReader(pathVilla)).withMappingStrategy(strategy).
                    withSeparator(DEFAULT_SEPARATOR).
                    withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }
}
