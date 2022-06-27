package StepDefinitions;
import Framework.DriverSetup;
import Pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsPageSteps {
    ProductsPage productsPage = new ProductsPage(DriverSetup.getDriver());

    @Then("User should see {string} Hizli Filtre text visible")
    public void user_should_see_hizli_filtre_text_visible(String quickTxt) {
        productsPage.getQuickFilterTxt(quickTxt);
    }

    @Then("User should see product list visible")
    public void user_should_see_product_list_visible() {
        productsPage.checkProductList();
    }

    @When("User clicks Renk Ara search input")
    public void user_clicks_renk_ara_search_input() {

    }

    @When("User writes {string} color to search input")
    public void user_writes_color_to_search_input(String inputColor) {
        productsPage.setInputColor(inputColor);
    }

    @When("User clicks filtered color")
    public void user_clicks_filtered_color() {
        productsPage.setFilteredColor();
    }

    @Then("User should see {string} filtered color in container")
    public void user_should_see_filter_container_secili_filtreler_text_in_container(String filteredColor) {
        productsPage.getFilteredColorInContainer(filteredColor);
    }

    @When("User clicks 2th item of listed products")
    public void user_clicks_item_of_listed_products() {
        productsPage.clickListedProduct();
    }

}



