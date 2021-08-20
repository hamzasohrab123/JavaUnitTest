import java.util.*;

public class Fibonacci {

    public static void fibonacci(){

        int a = 0;
        int b = 1;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series: ");
        System.out.println("" + a);
        System.out.println("" + b);

        for (int i=2; i<n; i++){
            c = a + b;
            System.out.println("" + c);
            a = b;
            b = c;

        }
    }

    public static void main(String[] args) {

        fibonacci();

    }


}
