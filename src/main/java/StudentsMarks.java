import java.util.*;

public class StudentsMarks {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {

            int x;
            int y;
            int z;

            String name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of student " + i + ": ");
            name = sc.next();

            System.out.println("Enter number in Mathematics out of 100: ");
            x = sc.nextInt();

            System.out.println("Enter number in Chemistry out of 100: ");
            y = sc.nextInt();

            System.out.println("Enter number in Physics out of 100: ");
            z = sc.nextInt();

            System.out.println("Student = " + name + "");
            System.out.println("Mathematics = " + x + "");
            System.out.println("Chemistry = " + y + "");
            System.out.println("Physics = " + z + "");

        }
    }
}







