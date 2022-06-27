package Pages;

import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductPage {

    //WebDriver setups
    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements in product page
    By mediumSizeButton=  By.xpath("(//a[@href='javascript:;'][normalize-space()='M'])[2]");
    By addToBasketButton= By.id("pd_add_to_cart");
    By basketIcon= By.xpath("//span[normalize-space()='Sepetim']");
    By toolTip= By.id("evamToolTipTop");

    //product page constructor
    public ProductPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new Helper(driver);
    }

    //product page functions
    public void skipToolTip()
    {
        do {elementHelper.click(toolTip);}
        while (elementHelper.findElement(toolTip).isDisplayed());


    }

    public void clickSizeButton()
    {

        elementHelper.click(mediumSizeButton);
    }

    public void clickAddToBasket()
    {
        elementHelper.click(addToBasketButton);
    }

    public void clickBasketIcon()
    {
        elementHelper.click(basketIcon);
    }
}
