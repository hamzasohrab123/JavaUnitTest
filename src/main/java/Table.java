
import java.util.*;

public class Table {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();

        for (int i=1; i<11; i++){

            int ans = num * i;
            System.out.println(""+ num +" * "+ i +" = " + ans);

        }

    }

}
