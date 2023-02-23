import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class LoginHrmLive {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(); //open browser
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        // Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button.oxd-button")).click();
        System.out.println("Login page title is: " + driver.getTitle());
        String expectedTitle=driver.getTitle();
        String actualTitle="OrangeHRM";
        if (expectedTitle.contentEquals(actualTitle)){
            System.out.println("passed");
        }else{
            System.out.println("Failed");
        }

    }
}
