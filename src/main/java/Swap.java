import java.util.*;

public class Swap {
    public static void main(String[] args) {

        int temp = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter Number 2: ");
        int n2 = sc.nextInt();

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swapping the value of Number 1 is: " + n1);
        System.out.println("After Swapping the value of Number 2 is: " + n2);


    }
}
