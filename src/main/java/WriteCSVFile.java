import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteCSVFile {
    public static void main(String[] args) throws IOException {

        BufferedWriter write = Files.newBufferedWriter(Paths.get("C:/Users/mosyx/JavaUnitTest/src/main/java/data.csv"));
        CSVPrinter csvPrinter = new CSVPrinter(write, CSVFormat.DEFAULT.withHeader("ID", "FirstName", "LastName", "ZipCode"));

        try {
            csvPrinter.printRecord("1", "Imran", "Khan", "0000");
            csvPrinter.printRecord("2", "Nawaz", "Sharif", "1111");
            csvPrinter.printRecord("3", "Asif Ali", "Zardari", "2222");
            csvPrinter.printRecord("4", "Bilawal", "Bhutto", "3333");
            csvPrinter.close();

        }
        catch (Exception error){
            System.out.println(error);
        }

    }
}
