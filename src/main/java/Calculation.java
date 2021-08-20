import java.util.*;

public class Calculation
{
    public static void main(String args[])
    {
        addition(2, 2);
        subtraction(2, 2);
        multiplication(2, 2);
        division(2, 2);
    }

    public static int addition(int num1, int num2)
    {
        int answer = num1 + num2;
        return answer;
    }
    public static int subtraction(int num1, int num2)
    {
        int answer = num1 - num2;
        return answer;
    }
    public static int multiplication(int num1, int num2)
    {
        int answer = num1 * num2;
        return answer;
    }
    public static int division(int num1, int num2)
    {
        int answer = num1 / num2;
        return answer;
    }
}

/*
public class Calculation {
    public static void main (String [] args) {
        for (int x = 1; x<args.length; x++){
            System.out.println(args[x] + "");
        }
    }
}
*/
