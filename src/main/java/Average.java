import java.util.*;

public class Average {

    public static void calculate(int n1, int n2, int n3){

        int average = (n1 + n2 + n3) / 3;
        System.out.println("Average: " + average);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3: ");
        int num3 = sc.nextInt();

        calculate(num1, num2, num3);

    }
}
