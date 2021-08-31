import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IzaanitAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://izaan.io/");

        driver.findElement(By.xpath("/html/body/app-root/app-common-layout/app-header/header")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-common-layout/app-header/header/div/div/nav/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-common-layout/app-signin/section/div/div/div[3]/div/button")).click();
        driver.findElement(By.id("email")).sendKeys("danish.bangash05");
        driver.findElement(By.id("password")).sendKeys("Izaan@danish.bangash05@123");
        driver.findElement(By.id("btnSignIn")).click();

    }
}


