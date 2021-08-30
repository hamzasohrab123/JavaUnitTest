import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferReadCSV {

    public static void main(String[] args) throws IOException {

        BufferedReader read = Files.newBufferedReader(Paths.get("C:/Users/mosyx/JavaUnitTest/src/main/java/test.csv"));
        CSVParser csvParser = new CSVParser(read, CSVFormat.DEFAULT.withFirstRecordAsHeader());

        try {

            for (CSVRecord csvRecord : csvParser) {
                String firstname = csvRecord.get(0);
                String lastname = csvRecord.get(1);
                String zipcode = csvRecord.get(2);

                System.out.println("Employee" + csvRecord.getRecordNumber());
                System.out.println("firstname: " + firstname);
                System.out.println("lastname" + lastname);
                System.out.println("zipcode" + zipcode);
                System.out.println("\n");

            }
            System.out.println("\n");
        }
        catch (Exception error){
            System.out.println(error);
        }
    }
}


