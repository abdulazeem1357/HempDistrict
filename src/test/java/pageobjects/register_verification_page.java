package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class register_verification_page {

    WebDriver driver;

    public register_verification_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By VERIFICATION_FIELD = By.id("signup__verification__code");
    By RESEND_VERIFICATION_BUTTON = By.id("signup__verification__resend__lnk");
    By BACK_TO_REGISTER_BUTTON = By.id("signup__verification__back__lnk");

    public void enter_verification_code(String verification_code) {
        driver.findElement(VERIFICATION_FIELD).sendKeys(verification_code);
    }

    public void resend_verification_button() {
        driver.findElement(RESEND_VERIFICATION_BUTTON).click();
    }

    public void verification_register_button() {
        //Scrolling the button into the view
        WebElement scroll_to = driver.findElement(By.id("signup__verification__register__mdl__btn"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll_to);

        WebElement VERIFICATION_REGISTER_BUTTON = driver.findElement(By.id("signup__verification__register__mdl__btn"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();", VERIFICATION_REGISTER_BUTTON);
    }

    public void back_to_register_button() {
        driver.findElement(BACK_TO_REGISTER_BUTTON).click();
    }

    public String get_registration_success_text() {
        WebElement REGISTRATION_SUCCESS_BANNER = driver.findElement(By.cssSelector("#success > div > div > div.modal-body.text-center > h3"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return arguments[0].value", REGISTRATION_SUCCESS_BANNER);
    }

    public void go_to_login_button() {
        WebElement GO_TO_LOGIN_BUTTON = driver.findElement(By.cssSelector("#signup__verification__mdl__lnk"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", GO_TO_LOGIN_BUTTON);
    }
}
