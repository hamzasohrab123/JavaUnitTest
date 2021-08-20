import org.testng.annotations.Test;

public class AgeOperatorTest {

    @Test
    public void ageOperatorTest(){

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
