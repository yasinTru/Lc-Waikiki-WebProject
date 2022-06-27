package StepDefinitions;
import Framework.DriverSetup;
import Pages.ProductPage;
import io.cucumber.java.en.When;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage(DriverSetup.getDriver());

    @When("User clicks medium size of product")
    public void user_clicks_medium_size_of_product() {

       // productPage.skipToolTip();
        productPage.clickSizeButton();
    }

    @When("User clicks Sepete Ekle button")
    public void user_clicks_sepete_ekle_button() {
        productPage.clickAddToBasket();
    }

    @When("User clicks Sepetim button")
    public void user_clicks_sepetim_button() {
        productPage.clickBasketIcon();
    }


}
