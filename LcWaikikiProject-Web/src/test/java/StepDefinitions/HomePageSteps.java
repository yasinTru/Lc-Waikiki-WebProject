package StepDefinitions;
import Framework.DriverSetup;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    HomePage homePage= new HomePage(DriverSetup.getDriver());

    @Then("User should see marketplace landing")
    public void should_see_marketplace_landing() {
        homePage.getHomeMarketPlace();
    }

    @When("User hovers mouse over Kadin products category")
    public void user_hovers_mouse_over_kadin_products_category() throws InterruptedException {
        homePage.getWomenButton();
    }

    @When("User clicks Bluz product")
    public void user_clicks_bluz_product(){
        homePage.getBluzProduct();
    }
}
