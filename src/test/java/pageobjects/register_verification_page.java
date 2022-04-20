package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class register_verification_page {

    WebDriver driver;

    public register_verification_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By VERIFICATION_FIELD = By.id("signup__verification__code");
    By RESEND_VERIFICATION_BUTTON = By.id("signup__verification__resend__lnk");
//    By VERIFICATION_REGISTER_BUTTON = By.id("signup__verification__register__mdl__btn");
    By BACK_TO_REGISTER_BUTTON = By.id("signup__verification__back__lnk");
    By REGISTRATION_SUCCESS_BANNER = By.xpath("/html/body/div[1]/div/div/div[2]/h3");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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

        WebElement VERIFICATION_REGISTER_BUTTON = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup__verification__register__mdl__btn")));
        js.executeScript("arguments[0].click();", VERIFICATION_REGISTER_BUTTON);
//        driver.findElement(VERIFICATION_REGISTER_BUTTON).click();
    }

    public void back_to_register_button() {
        driver.findElement(BACK_TO_REGISTER_BUTTON).click();
    }

    public String get_registration_success_text() {
        return driver.findElement(REGISTRATION_SUCCESS_BANNER).getText();
    }

    public void go_to_login_button() {

        WebElement GO_TO_LOGIN_BUTTON = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signup__verification__mdl__lnk")));
//        WebElement GO_TO_LOGIN_BUTTON = driver.findElement(By.cssSelector("#signup__verification__mdl__lnk"));
        js.executeScript("arguments[0].click();", GO_TO_LOGIN_BUTTON);
    }
}
