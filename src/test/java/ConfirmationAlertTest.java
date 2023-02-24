import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ConfirmationAlertTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(); //open browser
        driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Click alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        driver.close();
    }
}
