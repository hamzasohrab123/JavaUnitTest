import java.util.*;

public class TryCatch {
    //Instance Variables --> Those are inside the Class but outside the Method

    //Local Variable --> Those are inside the Method

    public static void divide(int n1, int n2){
        try {
            int ans = n1 / n2;
            System.out.println("Division: " + ans);
        }
        catch (Exception error){
            System.out.println("Failed to Execute, Reason: ");
            System.out.println(error);
        }
        System.out.println("End of Program");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter Value of y: ");
        int y = sc.nextInt();

        TryCatch tc = new TryCatch();
        tc.divide(x, y);


    }
}
