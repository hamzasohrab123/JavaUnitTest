import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReading {
    //throws tells the user that there might be chance of an exception in the program
    public static void main(String[] args) throws FileNotFoundException{

        try {
            File myObj = new File("src/hi.txt");
            Scanner scan = new Scanner(myObj);
            while (scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        }
        catch (Exception error){
            System.out.println("Exception occured");
            System.out.println(error);
        }
        finally {
            System.out.println("Program Ended");
        }

    }
}
