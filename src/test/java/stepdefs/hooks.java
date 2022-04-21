package stepdefs;

import cucumber.test_context;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    test_context testContext;

    public hooks(test_context testContext) {
        this.testContext = testContext;
    }

    @Before
    public void BeforeSteps() {
        /*What all you can perform here
			Starting a WebDriver
			Setting up DB connections
			Setting up test data
			Setting up browser cookies
			Navigating to certain page
			or anything before the test
		*/
    }

    @After
    public void AfterSteps() {
        testContext.getWebDriverManager().CloseDriver();
    }
}
