import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by welcome on 12/11/2016.
 */
public class PracticeWebdriver {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.uk/");
        String expected = "Google";
        String actual = driver.getTitle();
        if(expected.equals(actual)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }
    }
}
