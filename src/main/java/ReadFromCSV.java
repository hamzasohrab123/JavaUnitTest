import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileReader;
import java.util.List;

public class ReadFromCSV {

    public static void main(String[] args) {

        readAll();
        read();

    }

    public static void readAll() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("C:/Users/mosyx/JavaUnitTest/src/main/java/test.csv"));
            List<String[]> list = csvReader.readAll();

            for (int i = 0; i < list.size(); i++) {
                String[] value = list.get(i);
                for (String str : value) {
                    System.out.println(str);
                }
                System.out.println("\n");
            }

        } catch (Exception error) {
            System.out.println(error);
        }
    }

    public static void read(){

     CSVParser csvParser = new CSVParserBuilder().withSeparator('|').build();
        try{

            CSVReader csvReader = new CSVReaderBuilder(new FileReader("C:/Users/mosyx/JavaUnitTest/src/main/java/test.csv"))
                    .withCSVParser(csvParser)
                    .withSkipLines(1)
                    .build();

            List<String[]> list = csvReader.readAll();

            for (int i=0; i< list.size(); i++){
                String[] str = list.get(i);

                for (String val : str) {
                    System.out.print(val);
                }
                System.out.println("\n");
            }
        }
        catch (Exception error){
            System.out.println(error);
        }
    }

}

