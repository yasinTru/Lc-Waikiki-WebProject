package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PaymentPage {

    //WebDriver setups
    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements in payment page
    By deliveryMethodText= By.cssSelector("div[class='text-left sectionTitleBottomMargin'] span[class='sectionTitle']");
    By orderSummary= By.cssSelector(".orderSummary");

    //payment page constructor
    public PaymentPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new Helper(driver);
    }

    //payment page functions
    public void getDeliveryMethodText(String deliveryMethodTxt)
    {
        elementHelper.isAssertTrue(deliveryMethodText,deliveryMethodTxt);
    }

    public void checkOrderSummary()
    {
        elementHelper.checkElementVisible(orderSummary);
    }

}
