package orangehrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 10/05/2015.
 */
public class Utils extends BaseClass {
    public static void selectFromListByText(By element,String text)
    {
        Select select=new Select(driver.findElement(element));
        select.selectByVisibleText(text);

    }

    public static void waitForElement(By by,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static boolean isTextPresent(String text)
    {
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }

    public static String gettext(By by)
    {
        return driver.findElement(by).getText();
    }

    public static boolean isElementpresent(By element)
    {
       return driver.findElement(element).isDisplayed();
    }
}
