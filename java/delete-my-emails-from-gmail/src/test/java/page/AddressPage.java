package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ActionSelenium;
import utils.UserInfos;

public class AddressPage extends ActionSelenium {

    private WebDriver driver;
    private WebElement webElement;


    public AddressPage(WebDriver driver){
        this.driver = driver;
    }

    public AddressPage(WebElement webElement){
        this.webElement = webElement;
    }

    //XPath = //tagname[@Attribute=’Value’]
    public static final By inputAddres1 = By.xpath("//input[@class='whsOnd zHQkBf']");
    public static final By inputAddres2 = By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']");


    public void address(){
        click(driver, inputAddres1, 5);
        sendData(driver, inputAddres1, UserInfos.email, 5 );
        click(driver, inputAddres2, 2);
    }
}
