package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import pageobjects.home_page;
import pageobjects.login_page;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class login_steps {

    WebDriver driver;
    login_page LoginPage;
    String email = "charlestsmith888@gmail.com";
    String password = "admin123";
    String expected_text = "Stylish Clothes  Stylish Life";
    home_page HomePage;

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://dev124.onlinetestingserver.com/hemp-district/user/login.php");

//        WebElement id = driver.findElement(By.id("signin__email"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", id);

    }

    @When("^I enter correct email and password$")
    public void i_enter_correct_email_and_password() throws Exception {
        LoginPage.enter_email(email);
        LoginPage.enter_password(password);
        LoginPage.submit_form();
    }

    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully() throws Exception {
        HomePage = new home_page(driver);
        String bannerText = HomePage.get_banner_text();
        assertEquals(bannerText, expected_text);
    }

    @Then("^I close the browser$")
    public void i_close_the_browser() throws Exception {
        driver.quit();
    }
}
