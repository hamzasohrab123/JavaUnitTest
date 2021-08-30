import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.text.html.HTMLDocument;
import java.io.FileInputStream;
import java.util.Iterator;
import static java.sql.Types.NUMERIC;
import static org.codehaus.groovy.syntax.Types.STRING;

public class ReadExcelFile {
    public static void main(String[] args) {

        try {

            //obtaining bytes from the file
            FileInputStream fis = new FileInputStream("src/main/java/read.xlsx");

            //creating Workbook instance that refers to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            //creating a Sheet object to retrieve object
            XSSFSheet sheet = workbook.getSheetAt(0);

              //way to print certain data you want
//            String str = sheet.getRow(1).getCell(3).getStringCellValue();
//            System.out.println(str);


            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()){
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t\t");
                            break;

                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
                            break;

                        default:
                            System.out.println("Program Not Working");
                    }
                }
                System.out.println();
            }
        }
        catch(Exception error){
            System.out.println(error);
        }
    }
}

/*
public class ReadExcelFile {
    public static void main(String[] args) {

        try {
            //obtaining bytes from the file
            FileInputStream fis = new FileInputStream("src/main/java/read.xlsx");

            //creating Workbook instance that refers to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            //creating a Sheet object to retrieve object
            XSSFSheet sheet = workbook.getSheetAt(0);

            //iterating over excel file
            Iterator<Row> itr = sheet.iterator();
            while(itr.hasNext()){
                Row row = itr.next();

                //iterating over each column
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()){

                        //field that represents string cell type
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t\t");
                            break;

                        //field that represents number cell type
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
                            break;

                        default:
                            System.out.println("Fault in Program");
                    }
                }
                System.out.println("");
            }
        }
        catch (Exception error){
            System.out.println(error);
        }
    }
}
*/