public class AgeOperator
{
    public static void main(String[] args)
    {
        age_operator(18, "Danish");
    }

    public static void age_operator(int age, String name)
    {
        if (age < 18)
        {
            System.out.println(""+name+" is a Teenager");
        }
        else
        {
            System.out.println(""+name+" is an Adult");
        }
    }
}

//    // FOR LOOP PRACTICE
//    public class AgeOperator
//    {
//        public static void main(String[] args)
//        {
//            for (int i = 1; i <= 10; i++)
//            {
//                System.out.println("This is line number : " + i);
//                }
//        }
//    }













