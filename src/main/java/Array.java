import java.util.*;

public class Array
{
    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0;i < 5; i++) {
            int x;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array[" + i + "] Element of Array: ");
            x = sc.nextInt();
            System.out.println("Array["+ i +"] = " + x);

        }
    }
}

/*
public class Array {

    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 12;
        a[1] = 24;
        a[2] = 36;
        a[3] = 48;
        a[4] = 60;
        a[5] = 72;
        a[6] = 84;
        a[7] = 96;
        a[8] = 108;
        a[9] = 120;
        for (int i=0; i<=9;i++){
            System.out.println("Array["+ i +"] = " + a[i]);

        }
    }
}
 */