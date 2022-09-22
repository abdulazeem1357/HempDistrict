package managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver_manager {
    WebDriver driver;

    public web_driver_manager() {
    }

    public WebDriver getDriver() {
        if (driver == null) driver = createDriver();
        return driver;
    }

    private WebDriver createDriver() {
        driver = createLocalDriver();
        return driver;
    }

    private WebDriver createLocalDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        if(file_reader_manager.getInstance().getConfigFileReader().getBrowserWindowSize()) driver.manage().window().maximize();
        return driver;
    }

    public void CloseDriver() {
        driver.close();
        driver.quit();
    }
}