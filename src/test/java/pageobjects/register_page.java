package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class register_page {

    WebDriver driver;

    public register_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By FIRST_NAME_FIELD = By.id("signup__first__name");
    By LAST_NAME_FIELD = By.id("signup__last__name");
    By EMAIL_ADDRESS_FIELD = By.id("signup__email");
    By PHONE_NUMBER_FIELD = By.id("signup__phone");
    By COUNTRY_FIELD = By.id("signup__country");
    By STATE_FIELD = By.id("signup__state");
    By ZIPCODE_FIELD = By.id("signup__zipcode");
    By PASSWORD_FIELD = By.id("signup__pass");
    By CONFIRM_PASSWORD_FIELD = By.id("signup__confirm__pass");
//    By REGISTER_BUTTON = By.id("signup__register__btn");
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void enter_first_name(String first_name) {
        driver.findElement(FIRST_NAME_FIELD).sendKeys(first_name);
    }

    public void enter_last_name(String last_name) {
        driver.findElement(LAST_NAME_FIELD).sendKeys(last_name);
    }

    public void enter_email_address(String email_address) {
        driver.findElement(EMAIL_ADDRESS_FIELD).sendKeys(email_address);
    }

    public void enter_phone_number(String phone_number) {
        driver.findElement(PHONE_NUMBER_FIELD).sendKeys(phone_number);
    }

    public void enter_country(String country) {
        driver.findElement(COUNTRY_FIELD).sendKeys(country);
    }

    public void enter_state(String state) {
        driver.findElement(STATE_FIELD).sendKeys(state);
    }

    public void enter_zipcode(String zipcode) {
        driver.findElement(ZIPCODE_FIELD).sendKeys(zipcode);
    }

    public void enter_password(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    public void enter_confirm_password(String confirm_password) {
        driver.findElement(CONFIRM_PASSWORD_FIELD).sendKeys(confirm_password);
    }

    public void register_button() {
//        driver.findElement(REGISTER_BUTTON).click();

        //Scrolling the submit button into the view
        WebElement scroll_to = driver.findElement(By.id("signup__confirm__pass"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll_to);

        WebElement REGISTER_BUTTON = driver.findElement(By.id("signup__register__btn"));
        js.executeScript("arguments[0].click();", REGISTER_BUTTON);
    }
}
