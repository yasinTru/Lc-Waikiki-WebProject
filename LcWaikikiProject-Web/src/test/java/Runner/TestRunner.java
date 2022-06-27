package Runner;
import Framework.DriverSetup;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(

        features = {"src/test/java/Features"},
        glue = {"StepDefinitions", "Framework"},
        tags ="@IntoRegisterPage or @UserEndToEnd",

        plugin = {

                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "json:Reports/CucumberReport/Report",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverSetup.getDriver();
}