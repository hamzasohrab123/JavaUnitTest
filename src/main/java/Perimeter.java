import java.util.*;

public class Perimeter {

    public static void perimeter(int n1, int n2){

        int per = 2 * (n1 + n2);
        System.out.println("Perimeter of coordinates ("+ n1 +", "+ n2 +"): " + per);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Coordinate 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Coordinate 2: ");
        int num2 = sc.nextInt();

        perimeter(num1, num2);

    }
}

