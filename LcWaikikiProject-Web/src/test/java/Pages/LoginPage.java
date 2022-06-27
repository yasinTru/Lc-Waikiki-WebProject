package Pages;

    import Framework.Helper;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import org.testng.Assert;

public class LoginPage {

    //WebDriver setups
    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements in basket page
    By loginAvatar= By.cssSelector("#user_1_");
    By login_EmailInput=By.cssSelector("[name=email]");
    By login_PasswordInput=By.cssSelector("[name=password]");
    By login_LoginButton= By.cssSelector("button[type='submit']");

    //login page constructor
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new Helper(driver);
    }

    //login page functions
    public void login_getUrl()
    {
        String homePageUrl="https://www.lcwaikiki.com/tr-TR/TR";
        String currentUrl= driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,homePageUrl);
    }

    public void goToLoginPage()
    {
        elementHelper.click(loginAvatar);
    }

    public void loginEnterEmail(String userEmail)
    {
        elementHelper.sendKey(login_EmailInput,userEmail);
    }

    public void loginEnterPassword(String userPassword)
    {
        elementHelper.sendKey(login_PasswordInput,userPassword);
    }

    public void clickLoginButton()
    {
        elementHelper.click(login_LoginButton);
    }

}
