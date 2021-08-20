import org.testng.annotations.Test;

public class SwapTest {

    @Test
    public static void swapTesting() {

        int temp = 0;

        int n1 = 80;
        int n2 = 90;

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swapping the value of Number 1 is: " + n1);
        System.out.println("After Swapping the value of Number 2 is: " + n2);


    }
}
