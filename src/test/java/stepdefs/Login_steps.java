package stepdefs;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.Login_page;

public class Login_steps {
    public WebDriver driver;
    String email = "azeem@mailinator.com";
    String password = "sania";
    public Login_page lp;

    @Given("^User is on Login Page$")
    public void user_is_on_Login_Page() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sania.kareem\\Downloads\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://dev124.onlinetestingserver.com/hemp-district/user/login.php");

        WebElement scroll_to = driver.findElement(By.id("signin__btn"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll_to);

        lp = new Login_page(driver);
    }

    @Given("^User enters Email and Password$")
    public void user_enters_Password() {
        lp.enter_password(password);
        lp.enter_email(email);
    }

    @Then("^login must be successful\\.$")
    public void login_must_be_successful()  {
     lp.click_submit();
    }



}
