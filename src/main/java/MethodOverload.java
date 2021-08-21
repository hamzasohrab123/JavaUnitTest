public class MethodOverload {

    public void sum(int num1, int num2){
        int answer=num1+num2;
        System.out.println("Sum of 2 number is: " +answer);
    }

    public void sum(int num1, int num2, int num3){
        int answer=num1+num2+num3;
        System.out.println("Sum of 3 number is: " +answer);
    }

    public static void main(String[] args) {
        MethodOverload overload = new MethodOverload();
        overload.sum(2, 4);
        overload.sum(2, 4, 6);
    }

}
