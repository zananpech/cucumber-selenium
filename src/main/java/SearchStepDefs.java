import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class SearchStepDefs extends AbstractStepDefs{
    @Then("the {string} warning message is shown")
    public void theWarningMessageIsShown(String msg) {
        Optional<String> errorMessage = homePage.getSearchWarning();
        if (errorMessage.isPresent()){
            Assert.assertEquals(msg,errorMessage.get());
        }else fail();
    }

    @And("the search button is clicked")
    public void theSearchButtonIsClicked() {
        homePage.clickSearchButton();
    }

    @Given("the search field is filled with {string}")
    public void theSearchFieldIsFilledWithParameter(String value) {
        homePage.fillField("search_query_top", value);
    }

    @Then("the {string} is listed")
    public void thePrintedSummerDressIsListed(String msg) {
            Assert.assertEquals(msg, homePage.getSummerDress());
    }
}
