package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.AddressPage;
import utils.ManagerDriver;

public class DeleteEmail {

    private WebDriver driver;
    ManagerDriver managerDriver;
    AddressPage addressPage;


    @Before
    public void setup(){
        managerDriver = new ManagerDriver();
        driver = ManagerDriver.browser("edge");
        addressPage = new AddressPage(driver);
    }

    @Test
    public void deleteEmail(){
        driver.get("https://mail.google.com/mail/");
        addressPage.address();
    }

    @After
    public void end(){
        //driver.quit();
    }

}
