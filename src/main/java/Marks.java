import java.util.*;

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        switch (marks/10){

            case 10:
                System.out.println("Your Grade is A*");
                break;

            case 9 :
                System.out.println("Your Grade is A");
                break;

            case 8:
                System.out.println("Your Grade is B");
                break;

            case 7:
                System.out.println("Your Grade is C");
                break;

            case 6:
                System.out.println("Your Grade is D");
                break;

            case 5:
                System.out.println("Your Grade is E");
                break;

            default:
                System.out.println("You Grade is F");

        }
        System.out.println("Thanks for using this program");
    }
}

