package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class login_page {
    WebDriver driver;

    public login_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By EMAIL_FIELD = By.id("signin__email");
    By PASSWORD_FIELD = By.id("signin__pass");
    By LOGIN_PAGE_HEADER = By.cssSelector("#title__banner > div > div > div > div > h1");

    public void navigate_url() {
        driver.get("https://dev124.onlinetestingserver.com/hemp-district/user/login.php");
        WebElement id = driver.findElement(By.id("signin__btn"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", id);
    }

    public void enter_email(String email) {
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    public void enter_password(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    public void submit_form() {
        WebElement SUBMIT_BUTTON = driver.findElement(By.id("signin__btn"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", SUBMIT_BUTTON);
    }

    public String get_login_page_header() {
        return driver.findElement(LOGIN_PAGE_HEADER).getText();
    }
}
