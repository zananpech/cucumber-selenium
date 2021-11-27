import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.Optional;
import static org.junit.Assert.fail;

public class CartStepDefs extends AbstractStepDefs{
    @And("the cart link is clicked")
    public void theCartLinkIsClicked() {
        homePage.clickCartLink();
    }

    @Then("the {string} error message is shown in cart")
    public void theErrorMessageIsShownInCart(String msg) {
        Optional<String> errorMessage = homePage.getCartWarningMsg();
        if (errorMessage.isPresent()){
            Assert.assertEquals(msg,errorMessage.get());
        }else fail();
    }


    @Given("the add to cart button is clicked")
    public void theAddToCartButtonIsClicked() {
        homePage.clickAddToCartButton();
    }

    @And("the proceed to checkout link is clicked")
    public void theProceedToCheckoutLinkIsClicked() {
        homePage.clickProceedToCheckOutLink();
    }

    @And("the proceed to checkout button{int} is clicked")
    public void theProceedToCheckoutButtonIsClicked(int num) {
        if (num == 1){homePage.clickProceedToCheckoutButton1();}
        else if(num == 2){homePage.clickProceedToCheckoutButton2();}
        else {homePage.clickProceedToCheckoutButton3();}
    }

    @And("the email field is filled with {string} in sign in form")
    public void theEmailFieldIsFilledWith(String val){
        homePage.fillField("email", val);
    }

    @And("the password field is filled with {string} in sign in form")
    public void thePasswordFieldIsFilledWith(String val) {
        homePage.fillField("passwd", val);
    }

    @And("the terms agreement is checked")
    public void theTermsAgreementIsChecked() {
        homePage.checkTermsAgreement();
    }

    @And("the pay by bank wire is clicked")
    public void thePayByBankWireIsClicked() {
        homePage.clickPayByBankWireLink();
    }

    @And("the confirm order button is clicked")
    public void theConfirmOrderButtonIsClicked() {
        homePage.clickConfirmOrder();
    }

    @Then("the {string} message is shown when bank transfer completed")
    public void theYourOrderOnMyStoreIsCompleteMessageIsShownWhenCompleted(String msg) {
        Optional<String> message = homePage.getOrderCompleteBank();
        if (message.isPresent()){
            Assert.assertEquals(msg,message.get());
        }else fail();
    }

    @And("the sign in button is clicked")
    public void theSignInButtonIsClicked() {
        homePage.clickSignInButton();
    }

    @And("the pay by check is clicked")
    public void thePayByCheckIsClicked() {
        homePage.clickPayByCheckLink();
    }

    @Then("the {string} message is shown when Check transfer completed")
    public void theYourOrderOnMyStoreIsCompleteMessageIsShownWhenCheckTransferCompleted(String msg) {
        Optional<String> message = homePage.getOrderCompleteCheck();
        if (message.isPresent()){
            Assert.assertEquals(msg,message.get());
        }else fail();
    }

    @And("the remove item link is clicked")
    public void theRemoveItemLinkIsClicked() {
        homePage.clickRemoveItemLink();
    }

    @Then("the {string} check is shown")
    public void theCheckIsShown(String msg) {
        Assert.assertEquals(msg, homePage.getAddToCartSuccessfully().trim());
    }
}
