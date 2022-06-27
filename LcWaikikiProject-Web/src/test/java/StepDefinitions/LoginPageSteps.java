package StepDefinitions;
import Framework.DriverSetup;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(DriverSetup.getDriver());

    @Given("User opens Lc Waikiki web page")
    public void user_opens_lc_waikiki_web_page() {
        loginPage.login_getUrl();
    }

    @When("User clicks Giris Yap avatar button")
    public void user_clicks_giris_yap_button() {
        loginPage.goToLoginPage();
    }

    @When("User enters {string} email")
    public void user_enters_email(String email) {
        loginPage.loginEnterEmail(email);
    }

    @When("User enters {string} password")
    public void user_enters_password(String password) {
        loginPage.loginEnterPassword(password);
    }

    @And("User clicks Giris Yap button")
    public void userClicksGirisYapButton() {
        loginPage.clickLoginButton();
    }
}
