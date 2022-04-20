package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.home_page;
import pageobjects.login_page;

import static org.junit.Assert.assertEquals;


public class login_steps {

    WebDriver driver;
    login_page LoginPage;
    String email = "charlestsmith888@gmail.com";
    String password = "admin123";
    String expected_text = "Let's Love Fashion";
    home_page HomePage;

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev124.onlinetestingserver.com/hemp-district/user/login.php");

        WebElement id = driver.findElement(By.id("signin__btn"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", id);

        LoginPage = new login_page(driver);
    }

    @When("^I enter correct email and password$")
    public void i_enter_correct_email_and_password() {
        LoginPage.enter_email(email);
        LoginPage.enter_password(password);
        LoginPage.submit_form();
    }

    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully() {
        HomePage = new home_page(driver);
        String bannerText = HomePage.get_banner_text();
        assertEquals(expected_text, bannerText);
    }

    @Then("^I close the browser$")
    public void i_close_the_browser() {
        driver.quit();
    }
}
