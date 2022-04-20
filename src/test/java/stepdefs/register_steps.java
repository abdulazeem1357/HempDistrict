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
import pageobjects.login_page;
import pageobjects.register_page;
import pageobjects.register_verification_page;

import static org.junit.Assert.assertEquals;

public class register_steps {

    WebDriver driver;
    register_page RegisterPage;
    register_verification_page RegisterVerificationPage;
    login_page LoginPage;
    String first_name = "Craig";
    String last_name = "Max";
    String email = "craig@mailinator.com";
    String phone = "123456789";
    String country = "USA";
    String state = "Texas";
    String zipcode = "10001";
    String password = "user123";
    String confirm_password = "user123";
    String verification_code = "123456";
    String expected_text = "Registration Successful";

    @Given("^I am on the register page$")
    public void i_am_on_the_register_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev124.onlinetestingserver.com/hemp-district/user/register.php");

        //Scrolling the form into the view
        WebElement scroll_to = driver.findElement(By.id("signup__first__name"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll_to);

        RegisterPage = new register_page(driver);
    }

    @When("^I enter correct first name, last name, email, phone, country, state, zipcode, password, and confirm password$")
    public void i_enter_correct_first_name_last_name_email_phone_country_state_zipcode_password_and_confirm_password() {
        RegisterPage.enter_first_name(first_name);
        RegisterPage.enter_last_name(last_name);
        RegisterPage.enter_email_address(email);
        RegisterPage.enter_phone_number(phone);
        RegisterPage.enter_country(country);
        RegisterPage.enter_state(state);
        RegisterPage.enter_zipcode(zipcode);
        RegisterPage.enter_password(password);
        RegisterPage.enter_confirm_password(confirm_password);
    }

    @When("^I click on the register button$")
    public void i_click_on_the_register_button() {
        RegisterPage.register_button();
        RegisterVerificationPage = new register_verification_page(driver);
        RegisterVerificationPage.enter_verification_code(verification_code);
        RegisterVerificationPage.verification_register_button();
    }

    @Then("^I should be able to register successfully$")
    public void i_should_be_able_to_register_successfully() {
//        String actualText = RegisterVerificationPage.get_registration_success_text();
//        assertEquals(expected_text, actualText);
        RegisterVerificationPage.go_to_login_button();
        LoginPage = new login_page(driver);
        String actualText = LoginPage.get_login_page_header();
        assertEquals(expected_text, actualText);
    }
}
