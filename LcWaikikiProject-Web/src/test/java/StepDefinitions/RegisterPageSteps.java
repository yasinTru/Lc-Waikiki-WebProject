package StepDefinitions;
import Pages.RegisterPage;
import Framework.DriverSetup;
import io.cucumber.java.en.When;

public class RegisterPageSteps {

    RegisterPage registerPage= new RegisterPage(DriverSetup.getDriver());

    @When("User clicks Uye Ol button in login form")
    public void user_clicks_Uye_Ol_button(){
        registerPage.clickLoginButton();
    }

    @When("User enters {string} to email input")
    public void user_enters_email(String emailTxt) {
        registerPage.enterEmail(emailTxt);
    }

    @When("User enters {string} to password input")
    public void user_enters_password(String passwordTxt){
        registerPage.enterPassword(passwordTxt);
    }

    @When("User enters {string} to phone number input")
    public void user_enters_phone(String phoneTxt){
        registerPage.enterPhoneNumber(phoneTxt);
    }

    @When("User fills usage agreement")
    public void user_fills_usage_agreement(){
        registerPage.fillUsageAgreement();
    }

    @When("User clicks Uye Ol button in register form")
    public void user_clicks_uyeOl_in_register_form(){
        registerPage.loginInRegisterForm();
    }
}
