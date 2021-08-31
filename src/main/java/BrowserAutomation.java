import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserAutomation {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://54.172.98.170:443/");

        driver.findElement(By.id("exampleInputEmail")).sendKeys("admin");
        driver.findElement(By.id("exampleInputPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("body > div > div > div > div > div > div > div > div > form > button")).click();
        driver.findElement(By.cssSelector("#accordionSidebar_PIMS > a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/ul/li[2]/div[2]/a")).click();
        driver.findElement(By.id("employeeCode")).sendKeys("emp-101");
        driver.findElement(By.id("employeeType")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[2]/div[1]/div[3]/div/select/option[4]")).click();
        driver.findElement(By.id("nameEnglish")).sendKeys("Fiaz");
        driver.findElement(By.id("motherNameEnglish")).sendKeys("Rashida");
        driver.findElement(By.id("fatherNameEnglish")).sendKeys("Akbar");
        driver.findElement(By.id("nationality")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[6]/div[1]/div/div/select/option[1]")).click();
        driver.findElement(By.id("dateOfBirth")).sendKeys("10-10-1998");
        driver.findElement(By.id("birthPlace")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[8]/div[1]/div/div/select/option[15]")).click();
        driver.findElement(By.id("religion")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[9]/div[1]/div/div/select/option[2]")).click();
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[9]/div[2]/div/div/select/option[2]")).click();
        driver.findElement(By.id("emailAddress")).sendKeys("fiaz101@hotmail.com");
        driver.findElement(By.id("emailAddressPersonal")).sendKeys("fiaz101@hotmailoffice.com");
        driver.findElement(By.id("mobileNumberOffice")).sendKeys("03345698798");
        driver.findElement(By.id("mobileNumberPersonal")).sendKeys("03169878898");
        driver.findElement(By.id("joiningDateGovtService")).sendKeys("08-31-2021");
        driver.findElement(By.id("designation")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[19]/div[2]/div/div/select/option[6]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/button")).click();

    }
}

