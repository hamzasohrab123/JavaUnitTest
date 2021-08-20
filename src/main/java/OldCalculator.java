//OldCalculator --> PARENT CLASS ( MAIN CLASS )

public class OldCalculator {
    public void add() {
        System.out.println("I am old addition");
    }

    public void subtract() {
        System.out.println("I am old subtraction");
    }
}
    //NewCalculator --> CHILD CLASS ( SUB CLASS )

class NewCalculator extends OldCalculator {

    public void multiplication() {
        System.out.println("I am new multiplication");

    }

    public void division() {
        System.out.println("I am new division");
    }

    public static void main(String [] args)
    {
        NewCalculator cal = new NewCalculator();
        cal.add();
        cal.subtract();
        cal.division();
        cal.multiplication();
    }

}

