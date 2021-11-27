import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Optional;

import static org.junit.Assert.fail;

public class ForgetPasswordStepDefs extends AbstractStepDefs{

    private static final By FORGET_PASSWORD_CONFIRMATION = By.xpath("//*[@id=\"center_column\"]/div/p");


    @Given("the forget email field is filled with {string}")
    public void theForgetEmailFieldIsFilledWith(String msg) {
        homePage.fillField("email", msg);
    }

    @When("the retrieve password button is clicked")
    public void theRetrievePasswordButtonIsClicked() {
        homePage.clickRetrievePasswordButton();
    }


    @Then("the {string} error message is shown in forget password form")
    public void theErrorMessageIsShownInForgetPasswordForm(String msg) {
        Optional<String> errorMessage = homePage.getForgetPasswordErrorMsg();
        if (errorMessage.isPresent()){
            Assert.assertEquals(msg, errorMessage.get());
        }else{
            fail();
        }
    }

    @Then("a confirmation message {string} is shown")
    public void aConfirmationMessageIsShown(String msg) {
        Optional<String> confirmMessage = homePage.getForgetPasswordConfirmationMsg();
        if (confirmMessage.isPresent()){
            Assert.assertEquals(msg, confirmMessage.get());
        }else{
            fail();
        }
        }


    @And("the forget password link is clicked")
    public void theForgetPasswordLinkIsClicked() {
        homePage.clickForgetPasswordLink();
    }

    @And("the sign in link is clicked")
    public void theSignInLinkIsClicked() {
        homePage.clickSignInLink();
    }
}
