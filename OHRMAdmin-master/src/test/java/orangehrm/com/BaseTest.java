package orangehrm.com;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 10/05/2015.
 */
public class BaseTest extends BaseClass {

    @Before
    public void setUp()
    {
        driver=new FirefoxDriver();
        driver.get("http://insoftt.trial47.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown()
    {
    driver.quit();
    }
}
