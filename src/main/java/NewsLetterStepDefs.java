import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class NewsLetterStepDefs extends AbstractStepDefs{
    @Given("the email field is filled with {string}")
    public void theNewsLetterFieldIsFilledWith(String email) {
        homePage.fillField("newsletter-input", email);
    }

    @When("the submit news letter button is clicked")
    public void theSubmitNewsLetterButtonIsClicked() {
        homePage.clickSubScribeNewsLetterButton();
    }

    @Then("the {string} error message is shown")
    public void theMsgErrorMessageIsShown(String msg) {
        Optional<String> errorMessage = homePage.getSubscriptionErrorMsg();
        if (errorMessage.isPresent()){
            Assert.assertEquals(msg,errorMessage.get());
        }else fail();
    }
}
