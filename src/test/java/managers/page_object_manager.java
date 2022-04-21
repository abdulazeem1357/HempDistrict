package managers;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class page_object_manager {

    WebDriver driver;
    home_page HomePage;
    login_page LoginPage;
    register_page RegisterPage;
    register_verification_page RegisterVerificationPage;

    public page_object_manager(WebDriver driver) {
        this.driver = driver;
    }

    public home_page getHomePage() {
        return (HomePage == null) ? HomePage = new home_page(driver) : HomePage;
    }

    public login_page getLoginPage() {
        return (LoginPage == null) ? LoginPage = new login_page(driver) : LoginPage;
    }

    public register_page getRegisterPage() {
        return (RegisterPage == null) ? RegisterPage = new register_page(driver) : RegisterPage;
    }

    public register_verification_page getRegisterVerificationPage() {
        return (RegisterVerificationPage == null) ? RegisterVerificationPage =
                new register_verification_page(driver) : RegisterVerificationPage;
    }
}
