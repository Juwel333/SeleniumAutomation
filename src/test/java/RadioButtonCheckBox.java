import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonCheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(); //open browser
        driver.get("http://demo.guru99.com/test/radio.html");
        Thread.sleep(3000);
        // Click radio button
        boolean selected =driver.findElement(By.id("vfb-7-1")).isSelected();
        System.out.println(selected);
        driver.findElement(By.cssSelector("input#vfb-6-0")).click();

        }

    }

