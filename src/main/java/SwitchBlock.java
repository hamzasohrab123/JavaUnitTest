import java.util.*;

public class SwitchBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        String grade = sc.next();

        switch (grade){

            case "A":
                System.out.println("Your Marks are 90 or more than 90 Percent");
                break;
             case "a":
                System.out.println("Your Marks are above 90 or more than 90 Percent");
                break;

            case "B":
                System.out.println("Your Marks are above 80 or more than 80 Percent");
                break;
             case "b":
                System.out.println("Your Marks are 80 or more than 80 Percent");
                break;

            case "C":
                System.out.println("Your Marks are 70 or more than 70 Percent");
                break;
            case "c":
                System.out.println("Your Marks are 70 or more than 70 Percent");
                break;

            case "D":
                System.out.println("Your Marks are 60 or more than 60 Percent");
                break;
            case "d":
                System.out.println("Your Marks are 60 or more than 60 Percent");
                break;

            case "E":
                System.out.println("Your Marks are 50 or more than 50 Percent");
                break;
            case "e":
                System.out.println("Your Marks are 50 or more than 50 Percent");
                break;

            case "F":
                System.out.println("You have Failed");
                break;
            case "f":
                System.out.println("You have Failed");
                break;

            default:
                System.out.println("You have entered the wrong grade");

        }
        System.out.println("Thanks for using this program");
    }
}
