package stepdefs;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.Login_page;

public class Login_steps {
    public WebDriver driver;
    public Login_page lp;

    @Given("^User is on Login Page$")
    public void user_is_on_Login_Page( ) {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sania.kareem\\Downloads\\chromedriver.exe");

        driver= new ChromeDriver();
        lp = new Login_page(driver);
        driver.get("https://dev124.onlinetestingserver.com/hemp-district/user/login.php");

    }

     @When("^User enters Email and Password$")
    public void user_enters_Email_and_Password(String email , String password) {
        lp.enter_email(email);
        lp.enter_password(password);

    }
    @And("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() {
        lp.click_submit();


    }
    @Then("^User Navigate to Home Page$")
    public void user_Navigate_to_Home_Page() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }



//
//
//
//
//
//    @When("^User Navigate to$")
//    public void user_Navigate_to() throws Exception {
//        // Write code here that turns the phrase above into concrete actions
//
//    }
//
//    @When("^User enter email and Password$")
//    public void user_enter_email_and_Password() throws Exception {
//        // Write code here that turns the phrase above into concrete actions
//
//    }
//
//    @Then("^Message displayed invalid email address$")
//    public void message_displayed_invalid_email_address() throws Exception {
//        // Write code here that turns the phrase above into concrete actions
//
//    }

}
