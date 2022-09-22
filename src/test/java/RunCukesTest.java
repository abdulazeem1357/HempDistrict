import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = "stepdefs",
        monochrome = true,
        plugin = {"pretty", "html:target/html-test-output.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml" }
)

public class RunCukesTest {
}
