package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

        driver.findElement(Email_FIELD).sendKeys("sania");
    }
    public void enter_password (String password){

        driver.findElement(Password_Field).sendKeys("123456");
    }
    public void click_submit(){

        driver.findElement(Submit_Button).click();
    }

}
