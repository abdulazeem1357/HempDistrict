package stepdefs;

import cucumber.test_context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.login_page;
import pageobjects.register_page;
import pageobjects.register_verification_page;

import static org.junit.Assert.assertEquals;

public class register_steps {
    register_page RegisterPage;
    register_verification_page RegisterVerificationPage;
    login_page LoginPage;
    test_context testContext;
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
    String expected_text = "Login";

    public register_steps(test_context Context) {
        testContext = Context;
        RegisterPage = testContext.getPageObjectManager().getRegisterPage();
        RegisterVerificationPage = testContext.getPageObjectManager().getRegisterVerificationPage();
        LoginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Given("^I am on the register page$")
    public void i_am_on_the_register_page() {
        RegisterPage.navigate_url();
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
        RegisterVerificationPage.enter_verification_code(verification_code);
        RegisterVerificationPage.verification_register_button();
    }

    @Then("^I should be able to register successfully$")
    public void i_should_be_able_to_register_successfully() {
        RegisterVerificationPage.go_to_login_button();
        String actualText = LoginPage.get_login_page_header();
        assertEquals(expected_text, actualText);
    }
}