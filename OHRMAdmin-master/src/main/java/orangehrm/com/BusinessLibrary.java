package orangehrm.com;

import org.openqa.selenium.By;

/**
 * Created by User on 10/05/2015.
 */
public class BusinessLibrary extends BaseClass{


    //Locators
    By usernameTextfield=By.id("txtUsername");
    By passwordTextfield=By.id("txtPassword");
    By loginButton=By.id("btnLogin");
    By welcomeMessageElement=By.id("welcome");
    By addEmpButton=By.id("btnAdd");
    By addEmployeeHeader=By.xpath("//div[@id='content']/div/div/h1");
    By empFirstname=By.id("firstName");
    By empLastName=By.id("lastName");
    By locationList=By.id("location");
    By saveButton=By.id("btnSave");

    public void enterText(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }


    //Method to add employee
    public void addEmployee(String firstName,String lastName,String location)
    {
     Utils.waitForElement(addEmpButton,10);
     click(addEmpButton);
     Utils.isElementpresent(addEmployeeHeader);
     this.enterText(empFirstname, firstName);
        this.enterText(empLastName,lastName);
        Utils.selectFromListByText(locationList, location);
        this.click(saveButton);

    }

   //method to login with the provided username and password
    public void login(String username,String password)
    {
        this.enterText(usernameTextfield,username);
        this.enterText(passwordTextfield, password);
        this.click(loginButton);
    }


    //mehtod to logout
    public void logout()
    {
        this.click(welcomeMessageElement);
        Utils.waitForElement(By.linkText("Logout"), 10);
        this.clickLink("Logout");
    }


    //navigate to PIM
    public void goToPIM()
    {
        this.clickLink("PIM");
    }
    //
    public void goToAdmin()
    {
        this.clickLink("Admin");
    }

       public void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).isDisplayed();
        driver.findElement(By.linkText(linkText)).click();
    }
    public void click(By by)
    {
        driver.findElement(by).click();
    }



}
