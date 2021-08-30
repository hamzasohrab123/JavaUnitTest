import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.nio.file.Paths;

public class WriteToExcel {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet();

        //creating Row-0
        XSSFRow row0 = sheet.createRow(0);
        XSSFCell row0cell0 = row0.createCell(0);
        row0cell0.setCellValue("Team ID");

        XSSFCell row0cell1 = row0.createCell(1);
        row0cell1.setCellValue("Team Members");

        XSSFCell row0cell2 = row0.createCell(2);
        row0cell2.setCellValue("Positions");

        XSSFCell row0cell3 = row0.createCell(3);
        row0cell3.setCellValue("Status");

        //Creating Row-1
        XSSFRow row1 = sheet.createRow(1);
        XSSFCell row1cell0 = row1.createCell(0);
        row1cell0.setCellValue("1");

        XSSFCell row1cell1 = row1.createCell(1);
        row1cell1.setCellValue("Ronaldo");

        XSSFCell row1cell2 = row1.createCell(2);
        row1cell2.setCellValue("Left Striker");

        XSSFCell row1cell3 = row1.createCell(3);
        row1cell3.setCellValue("Playing");

        //Creating Row-2
        XSSFRow row2 = sheet.createRow(2);
        XSSFCell row2cell0 = row2.createCell(0);
        row2cell0.setCellValue("2");

        XSSFCell row2cell1 = row2.createCell(1);
        row2cell1.setCellValue("Messi");

        XSSFCell row2cell2 = row2.createCell(2);
        row2cell2.setCellValue("Right Striker");

        XSSFCell row2cell3 = row2.createCell(3);
        row2cell3.setCellValue("Playing");

        //Creating Row-3
        XSSFRow row3 = sheet.createRow(3);
        XSSFCell row3cell0 = row3.createCell(0);
        row3cell0.setCellValue("3");

        XSSFCell row3cell1 = row3.createCell(1);
        row3cell1.setCellValue("Neymar");

        XSSFCell row3cell2 = row3.createCell(2);
        row3cell2.setCellValue("Mid-Fielder");

        XSSFCell row3cell3 = row3.createCell(3);
        row3cell3.setCellValue("Playing");

        //Creating Row-4
        XSSFRow row4 = sheet.createRow(4);
        XSSFCell row4cell0 = row4.createCell(0);
        row4cell0.setCellValue("4");

        XSSFCell row4cell1 = row4.createCell(1);
        row4cell1.setCellValue("Varane");

        XSSFCell row4cell2 = row4.createCell(2);
        row4cell2.setCellValue("Defender");

        XSSFCell row4cell3 = row4.createCell(3);
        row4cell3.setCellValue("Playing");

        //Creating Row-5
        XSSFRow row5 = sheet.createRow(5);
        XSSFCell row5cell0 = row5.createCell(0);
        row5cell0.setCellValue("5");

        XSSFCell row5cell1 = row5.createCell(1);
        row5cell1.setCellValue("Neuer");

        XSSFCell row5cell2 = row5.createCell(2);
        row5cell2.setCellValue("Goal-Keeper");

        XSSFCell row5cell3 = row5.createCell(3);
        row5cell3.setCellValue("Playing");

        FileOutputStream fos = new FileOutputStream(new File("info.xlsx"));
        workbook.write(fos);
        fos.close();

    }
}
