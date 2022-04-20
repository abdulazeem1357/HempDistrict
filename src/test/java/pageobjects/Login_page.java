package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class Login_page {
    WebDriver driver;
    public Login_page (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    By Email_FIELD = By.id("signin__email");
    By Password_Field = By .id("signin__pass");
    By Submit_Button = By .id("signin__btn");


    public void enter_email(String Email){
        driver.findElement(Email_FIELD).sendKeys(Email);}

    public void enter_password (String Password){
        driver.findElement(Password_Field).sendKeys(Password);
    }
    public void click_submit(){
        WebElement Sigin_button = driver.findElement(Submit_Button);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", Sigin_button);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",Sigin_button);
    }

}
