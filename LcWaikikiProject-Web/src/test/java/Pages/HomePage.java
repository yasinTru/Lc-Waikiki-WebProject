package Pages;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    //WebDriver setups
    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements in home page
    By home_MarketplaceLanding= By.cssSelector(".header__middle .header__middle__right");
    By home_BluzProduct= By.xpath("//a[contains(@href,'/tr-TR/TR/kategori/kadin/bluz')]");

    //home page constructor
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new Helper(driver);
        // this.actions= new Actions(driver);
    }

    //home page functions
    public void getHomeMarketPlace()
    {
        System.out.println(home_MarketplaceLanding);
        elementHelper.checkElementVisible(home_MarketplaceLanding);
    }

    public void getWomenButton() throws InterruptedException
    {
        WebElement women= driver.findElement(By.xpath("//a[contains(@href, 'https://www.lcwaikiki.com/tr-TR/TR/lp/32-33-kadin')]"));
        Actions act= new Actions(driver);
        act.moveToElement(women).build().perform();
        Thread.sleep(1000);

    }

    public void getBluzProduct()
    {
          driver.navigate().to("https://www.lcwaikiki.com/tr-TR/TR/kategori/kadin/bluz");
    }





}




