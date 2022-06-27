package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage {

    //WebDriver setups
    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements in basket page
    By productImage= By.cssSelector(".rd-cart-item-image");
    By productTitle= By.cssSelector(".rd-cart-item-title");
    By productSize= By.cssSelector("span[class='rd-cart-item-size'] strong");
    By productColor= By.cssSelector(".rd-cart-item-color");
    By productQuantity= By.cssSelector(".rd-cart-item-quantity-area");
    By goPaymentButton= By.cssSelector(".main-button.mb-10");

    //basket page constructor
    public BasketPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new Helper(driver);
    }

    //basket page functions
    public void checkProductImage()
    {
        elementHelper.checkElementVisible(productImage);
    }

    public void checkProductTitle()
    {
        elementHelper.checkElementVisible(productTitle);
    }

    public void checkProductSize(String productSizeTxt)
    {
        elementHelper.isAssertTrue(productSize,productSizeTxt);
    }

    public void checkProductColor()
    {
        elementHelper.checkElementVisible(productColor);
    }

    public void checkProductQuantity()
    {
        elementHelper.checkElementVisible(productQuantity);
    }

    public void clickPaymentButton()
    {
        elementHelper.click(goPaymentButton);
    }

}
