package cucumber;

import managers.page_object_manager;
import managers.web_driver_manager;

public class test_context {
    web_driver_manager webDriverManager;
    page_object_manager pageObjectManager;

    public test_context() {
        webDriverManager = new web_driver_manager();
        pageObjectManager = new page_object_manager(webDriverManager.getDriver());
    }

    public web_driver_manager getWebDriverManager() {
        return webDriverManager;
    }

    public page_object_manager getPageObjectManager() {
        return pageObjectManager;
    }
}
