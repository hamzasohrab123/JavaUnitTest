import java.util.*;

public class Calculator {

    public static void main(String[] args){
        Calculator calculate = new Calculator();
        calculate.calculator();
    }
    public void calculator(){
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one of them 1, 2, 3, 4: ");
        option = sc.nextInt();
        if (option == 1){
            System.out.println("You Choose Addition");
            addition();
        }
        else if (option == 2){
            System.out.println("You Choose Subtraction");
            subtraction();
        }
        else if (option == 3){
            System.out.println("You Choose Multiplication");
            multiplication();
        }
        else if (option == 4){
            System.out.println("You Choose Division");
            division();
        }
        else {
            System.out.println("You have entered the wrong option");
        }

    }

    public static void addition(){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        x = sc.nextInt();
        System.out.println("Enter value of y: ");
        y = sc.nextInt();
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        int add = x + y;
        System.out.println("Addition is " + add);

    }

    public static void subtraction(){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        x = sc.nextInt();
        System.out.println("Enter value of y: ");
        y = sc.nextInt();
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        int subtract = x - y;
        System.out.println("Subtraction is " + subtract);
    }
    public static void multiplication(){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        x = sc.nextInt();
        System.out.println("Enter value of y: ");
        y = sc.nextInt();
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        int multiply = x * y;
        System.out.println("Multiplication is " + multiply);
    }
    public static void division(){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        x = sc.nextInt();
        System.out.println("Enter value of y: ");
        y = sc.nextInt();
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        int divide = x / y;
        System.out.println("Division is " + divide);
    }

}