package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    //WebDriver setups
    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements in register page
    By loginButton= By.cssSelector(".login-form__link");
    By emailInput= By.cssSelector("[name=\"email\"]");
    By passwordInput= By.cssSelector("[name=\"password\"]");
    By phoneInmput= By.cssSelector("[name=\"phone\"]");
    By usageAgreementChexbox= By.cssSelector("[name=\"memberPrivacyApprove\"]");
    By loginButtonInRegister= By.cssSelector(".register__button.register__button--blue");

    //register page constructor
    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new Helper(driver);
    }

    //register page functions
    public void clickLoginButton()
    {
        elementHelper.click(loginButton);
    }

    public void enterEmail(String email)
    {
        elementHelper.sendKey(emailInput, email);
    }

    public void enterPassword(String password)
    {
        elementHelper.sendKey(passwordInput, password);
    }

    public void enterPhoneNumber(String phone)
    {
        elementHelper.sendKey(phoneInmput,phone);
    }

    public void fillUsageAgreement()
    {
        elementHelper.click(usageAgreementChexbox);
    }

    public void loginInRegisterForm()
    {
        elementHelper.click(loginButtonInRegister);
    }

}
