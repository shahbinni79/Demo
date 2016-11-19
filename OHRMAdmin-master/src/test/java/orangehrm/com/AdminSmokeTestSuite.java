package orangehrm.com;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by User on 10/05/2015.
 */
public class AdminSmokeTestSuite extends BaseTest {
    //TestData
    String Adminusername="admin";
    String AdminPassword="Insoft12";
    String firstName="dipal",lastName="Tester";
   // String newUserName="TestUsername"+new Random().nextInt();
   // String usrname="username"+ new Date();
    String location="ASC_London";
    String sucessmessage="Successfully Saved";

    BusinessLibrary blib=new BusinessLibrary();

    @Test
    public void test()
    {
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        String usrname="username"+ format.format(new Date());
        System.out.print(usrname);
    }

    @Test
    public void verifyAdminCanAddAnEmployee()
    {

        blib.login(Adminusername,AdminPassword);
        Assert.assertTrue(Utils.isTextPresent("Welcome Admin"));
        blib.goToPIM();
        Assert.assertTrue(Utils.isTextPresent("Employee List"));
        blib.addEmployee(firstName, lastName, location);
        Assert.assertTrue(Utils.isTextPresent(sucessmessage));
        Assert.assertTrue(Utils.isTextPresent(firstName+" " +lastName));

    }





}
