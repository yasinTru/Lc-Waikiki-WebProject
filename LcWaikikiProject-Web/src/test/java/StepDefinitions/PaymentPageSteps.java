package StepDefinitions;
import Framework.DriverSetup;
import Pages.PaymentPage;
import io.cucumber.java.en.Then;

public class PaymentPageSteps {

    PaymentPage paymentPage= new PaymentPage(DriverSetup.getDriver());

    @Then("User should see {string} Teslimat yontemi text")
    public void user_should_see_teslimat_yontemi_text(String deliveryMethodTxt) {
        paymentPage.getDeliveryMethodText(deliveryMethodTxt);
    }

    @Then("User should see Siparis Ozeti container")
    public void user_should_see_siparis_ozeti_container() {
        paymentPage.checkOrderSummary();
    }

}
