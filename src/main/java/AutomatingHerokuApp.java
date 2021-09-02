import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AutomatingHerokuApp {

    static String url = "http://the-internet.herokuapp.com/";

    public static WebDriver setUp()     {

        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.get(url);

        return driver;

    }

    public static void contextMenuAlert(WebDriver driver) {

        WebElement context = driver.findElement(By.linkText("Context Menu"));
        context.click();

        Actions action = new Actions(driver);
        WebElement rightClick = driver.findElement(By.id("hot-spot"));
        action.contextClick(rightClick).perform();

    }

    public static void dragandDrop(WebDriver driver) {

        WebElement dad = driver.findElement(By.linkText("Drag and Drop"));
        dad.click();

//        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//        driver.switchTo().frame(frame);

        Actions action = new Actions(driver);
        WebElement boxa = driver.findElement(By.id("column-a"));
        WebElement boxb = driver.findElement(By.id("column-b"));
        action.clickAndHold(boxa).moveToElement(boxb).perform();
        action.clickAndHold(boxb).moveToElement(boxb).perform();

//        action.doubleClick(boxa).moveToElement(boxb);
//        action.moveToElement(driver.findElement(By.id("column-b")));

    }

    public static void jqueryUIMenus(WebDriver driver) {

        WebElement scrollList = driver.findElement(By.linkText("JQuery UI Menus"));
        scrollList.click();

        List<WebElement> menu = driver.findElements(By.id("ui-id-2"));
        menu.get(0).click();

        List<WebElement> list = driver.findElements(By.id("ui-id-4"));
        list.get(0).click();

        Actions action = new Actions(driver);
        List<WebElement> downloadlist = driver.findElements(By.id("ui-id-6"));
        action.doubleClick(downloadlist.get(0));

    }

    public static void horizontalSlide(WebDriver driver) {

        WebElement scroll = driver.findElement(By.linkText("Horizontal Slider"));
        scroll.click();

        Actions act = new Actions(driver);
        WebElement horizontalscroll = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
        act.clickAndHold(horizontalscroll).moveByOffset(20, 0).release().perform();

    }

    public static void hover(WebDriver driver) throws InterruptedException {

        WebElement scroll = driver.findElement(By.linkText("Hovers"));
        scroll.click();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]"));
        user.click();

        Thread.sleep(1000);
        WebElement profile = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/a"));
        profile.click();

    }

    public static void getText(WebDriver driver){

        WebElement blog = driver.findElement(By.linkText("Infinite Scroll"));
        blog.click();

        WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]"));
        String str = text.getText();
        System.out.println(str);

    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = setUp();

        //contextMenuAlert(driver);
        //dragandDrop(driver);
        //jqueryUIMenus(driver);
        //horizontalSlide(driver);
        //hover(driver);
        getText(driver);

    }
}

