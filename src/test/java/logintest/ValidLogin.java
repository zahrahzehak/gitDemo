package logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLogin {
    @Test
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
         WebDriver driver;
         driver= new ChromeDriver();
         driver.get("http://automationpractice.com/index.php");

    }
}
