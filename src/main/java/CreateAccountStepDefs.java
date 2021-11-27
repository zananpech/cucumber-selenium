import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class CreateAccountStepDefs extends AbstractStepDefs{
    @And("create account button is clicked")
    public void createAccountButtonIsClicked() {
        homePage.clickCreateAccountButton();
    }

    @Given("create account email field is filled with {string}")
    public void createAccountEmailFieldIsFilledWithSGmailCom(String value) {
        homePage.fillField("email_create", value);
    }

    @Then("the {string} message is shown")
    public void theAnAccountUsingThisEmailAddressHasAlreadyBeenRegisteredPleaseEnterAValidPasswordOrRequestANewOneMessageIsShown(String msg) {
        Optional<String> message = homePage.getCreateAccountError();
        if (message.isPresent()){
            Assert.assertEquals(msg,message.get());
        }else fail();
    }

}
