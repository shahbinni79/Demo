import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 12/11/2016.
 */
public class LogintoSugarSync {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        driver.get("https://www.sugarsync.com/en/");

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("username")).sendKeys("binni@greenlightpharmacy.com");
        driver.findElement(By.cssSelector("input#password") ).sendKeys("s31277");

        driver.findElement(By.className("field-label")).click();

        System.out.println("Ready");
        Thread.sleep(300);
        driver.findElement(By.className("submitButton")).click();


        String expectedText = "BINNI";
        String actualText = driver.findElement(By.id("user-display-name")).getText();
        if (expectedText.equals(actualText)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed ");
        }
        driver.quit();




    }
}
