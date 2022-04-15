package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class login_page {
    WebDriver driver;

    public login_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By EMAIL_FIELD = By.id("signin__email");
    By PASSWORD_FIELD = By.id("signin__pass");
    By SUBMIT_BUTTON = By.id("signin__btn");

    public void enter_email(String email) {
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    public void enter_password(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    public void submit_form() {
        driver.findElement(SUBMIT_BUTTON).click();
    }
}
