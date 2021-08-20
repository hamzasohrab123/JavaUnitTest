import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTest {

    @Test
        public void additionTest()
        {
            int actualValue = Calculation.addition(4, 2);
            int expectedValue = 6;
            //ActualValue == ExpectedValue
            //Test Passed
            Assert.assertEquals(actualValue, expectedValue);

        }

    @Test
        public void divisionTest()
        {
            int actualValue = Calculation.division(4, 2);
            int expectedValue = 2;
            //ActualValue == ExpectedValue
            //Test Passed
            Assert.assertEquals(actualValue, expectedValue);

        }

    }
























