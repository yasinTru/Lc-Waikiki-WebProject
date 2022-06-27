package Pages;

import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ProductsPage {

    //WebDriver setups
    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements in products page
    By quickFilterText= By.cssSelector(".col-xs-12 .quick-filters__heading-text");
    By productList= By.cssSelector(".product-list-container .product-list");
    By filterSearchInput= By.cssSelector("input[placeholder='Renk Ara']");
    By filteredColor= By.cssSelector(".color-filter-option");
    By filteredColorInContainer= By.cssSelector(".applied-filters__applied-filter .applied-filters__value");
    By listedProduct= By.xpath("(//img[@class='product-image__image'])[1]");
    By skipPopUp= By.cssSelector("div[id='cookieseal-banner'] button:nth-child(2)");
    By confirmSkipPopUp= By.cssSelector("#cm-popup-save");

    //products page constructor
    public ProductsPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new Helper(driver);
    }

    //products page functions
    public void getQuickFilterTxt(String quickFilter)
    {
        String actualQuickFilter= elementHelper.getText(quickFilterText);
        Assert.assertEquals(actualQuickFilter,quickFilter);

    }
    public void checkProductList()
    {
        elementHelper.checkElementVisible(productList);
        elementHelper.click(skipPopUp);
        elementHelper.click(confirmSkipPopUp);
    }

    public void clickSearchInput()
    {
        elementHelper.click(filterSearchInput);
    }

    public void setInputColor(String InputColor)
    {
        elementHelper.sendKey(filterSearchInput, InputColor);
    }

    public void setFilteredColor()
    {
        elementHelper.click(filteredColor);
    }

    public void getFilteredColorInContainer(String filteredColor)
    {
        elementHelper.isAssertTrue(filteredColorInContainer,filteredColor);
    }

    public void clickListedProduct()
    {
        elementHelper.click(listedProduct);
    }

}

