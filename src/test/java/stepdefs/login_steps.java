package stepdefs;

import cucumber.test_context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.home_page;
import pageobjects.login_page;

import static org.junit.Assert.assertEquals;

public class login_steps {
    login_page LoginPage;
    home_page HomePage;
    test_context testContext;
    String email = "charlestsmith888@gmail.com";
    String password = "admin123";
    String expected_text = "Let's Love Fashion";

    public login_steps(test_context Context) {
        testContext = Context;
        LoginPage = testContext.getPageObjectManager().getLoginPage();
        HomePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() {
        LoginPage.navigate_url();
    }

    @When("^I enter correct email and password$")
    public void i_enter_correct_email_and_password() {
        LoginPage.enter_email(email);
        LoginPage.enter_password(password);
        LoginPage.submit_form();
    }

    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully() {
        String bannerText = HomePage.get_banner_text();
        assertEquals(expected_text, bannerText);
    }
}