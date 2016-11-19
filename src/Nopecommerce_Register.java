import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 13/11/2016.
 */


public class Nopecommerce_Register {
    public static String randomdate () {
        DateFormat format = new SimpleDateFormat("ddMMMyyHHmmss");
        return format.format(new Date());
    }

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String email = "Binni+"+randomdate()+"@gmail.com";
        driver.get("http://demo.nopcommerce.com/");
        System.out.println("Webpage is open");
        driver.findElement(By.cssSelector("a.ico-register")).click();

        driver.findElement(By.cssSelector("input#gender-female")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Binni");
        driver.findElement(By.name("LastName")).sendKeys("Venepalli");

        driver.findElement(By.cssSelector("input[id=Email]")).sendKeys(email);
        System.out.println(email);
        driver.findElement(By.id("Password")).sendKeys("gopalvshah");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("gopalvshah");
        driver.findElement(By.id("register-button")).click();
        System.out.println("Regestration Completed");
        String ExpectedText = "Your registration completed";
        String ActualText = driver.findElement(By.cssSelector("div.result")).getText();
        if (ExpectedText.equals(ActualText)){
            System.out.println("You are registered");

        }
        driver.findElement(By.className("ico-logout")).click();
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys("gopalvshah");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        String actualtext= driver.findElement(By.xpath("//a[@href='/customer/info']")).getText();
        String expectedtext = email;
        Assert.assertEquals(expectedtext,actualtext);
        System.out.println("You are logged in");


       //driver.quit();


    }
}
