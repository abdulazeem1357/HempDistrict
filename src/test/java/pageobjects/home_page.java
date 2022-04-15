package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class home_page {

    WebDriver driver;

    public home_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By BANNER_TEXT = By.cssSelector("#user__home__pg > div > div > div.col-xl-6.mt-5.mt-xl-0 > h1");

    public String get_banner_text() {
        return driver.findElement(BANNER_TEXT).getText();
    }
}
