import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Optional;

public class HomePage {

    private static final String PAGE_URL = "http://automationpractice.com/";

    private static final By LOGIN_ERROR = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
    private static final By CONTACT_ERROR = By.cssSelector("#center_column > div > ol > li");
    private static final By CART_ERROR = By.xpath("//*[@id='center_column']/p");
    private static final By SUBSCRIPTION_ERROR = By.xpath("//*[@id=\"columns\"]/p");
    private static final By FORGET_PASSWORD_ERROR = By.xpath("//*[@id=\"center_column\"]/div/div/ol/li");
    private static final By FORGET_PASSWORD_CONFIRMATION = By.xpath("//*[@id=\"center_column\"]/div/p");
    private static final By SEARCH_ERROR = By.xpath("//*[@id=\"center_column\"]/p\n");
    private static final By ORDER_COMPLETE_BANK = By.xpath("//*[@id=\"center_column\"]/div/p");
    private static final By ORDER_COMPLETE_CHECK = By.xpath("//*[@id=\"center_column\"]/p[1]\n");
    private static final By CREATE_ACCOUNT_ERROR = By.xpath("//*[@id=\"create_account_error\"]/ol/li\n");
    @FindBy(className = "login")
    private WebElement signInLink;

    @FindBy(id = "contact-link")
    private WebElement contactUsLink;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
    private WebElement subscribeNewsLetterButton;

    @FindBy(id = "1_1_0_487740")
    private WebElement removeItemLink;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    private WebElement createAccountButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    private WebElement cartLink;

    @FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button")
    private WebElement retrievePasswordButton;

    @FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    private WebElement forgetPasswordLink;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private  WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElement proceedToCheckoutLink;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    private WebElement proceedToCheckoutButton1;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    private WebElement proceedToCheckoutButton2;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    private WebElement proceedToCheckoutButton3;

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    private WebElement agreeTermsCheck;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    private WebElement payByBankWireLink;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    private WebElement payByCheckLink;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    private WebElement confirmOrder;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/h5/a")
    private WebElement dress;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
    private WebElement addToCartSuccessfully;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")
    private WebElement addToCartImg;

    private final WebDriver driver;
    private final Actions action;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);

    }

    public void hoverOnAddToCart(){
        this.action.moveToElement(addToCartImg).perform();
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void clickSubScribeNewsLetterButton(){subscribeNewsLetterButton.click();}

    public void clickRetrievePasswordButton(){retrievePasswordButton.click();}

    public void clickSearchButton(){searchButton.click();}

    public void clickProceedToCheckOutLink(){proceedToCheckoutLink.click();}

    public void clickProceedToCheckoutButton1(){proceedToCheckoutButton1.click();}

    public void clickProceedToCheckoutButton2(){proceedToCheckoutButton2.click();}

    public void clickProceedToCheckoutButton3(){proceedToCheckoutButton3.click();}

    public void clickPayByBankWireLink(){payByBankWireLink.click();}

    public void clickPayByCheckLink(){payByCheckLink.click();}

    public void checkTermsAgreement(){agreeTermsCheck.click();}

    public void clickConfirmOrder(){confirmOrder.click();}

    public void clickCreateAccountButton(){createAccountButton.click();}

    public void clickAddToCartButton(){addToCartButton.click();}

    public void clickRemoveItemLink(){removeItemLink.click();}

    public void clickForgetPasswordLink(){forgetPasswordLink.click();}

    public void clickSignInButton(){signInButton.click();}

    public Optional<String> getLoginError() {
        return getMessage(LOGIN_ERROR);
    }
    public Optional<String> getContactError() {
        return getMessage(CONTACT_ERROR);
    }
    public Optional<String> getSearchWarning() {
        return getMessage(SEARCH_ERROR);
    }
    public String getSummerDress() {
        return dress.getAttribute("innerText");
    }

    public String getAddToCartSuccessfully() {
        return addToCartSuccessfully.getAttribute("innerText");
    }
    public Optional<String> getOrderCompleteBank() {
        return getMessage(ORDER_COMPLETE_BANK);
    }
    public Optional<String> getOrderCompleteCheck() {
        return getMessage(ORDER_COMPLETE_CHECK);
    }
    public Optional<String> getCreateAccountError() {
        return getMessage(CREATE_ACCOUNT_ERROR);
    }


    public void fillField(String field, String value) {
        getField(By.id(field)).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public void clickCartLink(){
        cartLink.click();
    }

    public Optional<String> getCartWarningMsg(){
        return getMessage(CART_ERROR);
    }
    public Optional<String> getSubscriptionErrorMsg(){
        return getMessage(SUBSCRIPTION_ERROR);
    }
    public Optional<String> getForgetPasswordErrorMsg(){
        return getMessage(FORGET_PASSWORD_ERROR);
    }
    public Optional<String> getForgetPasswordConfirmationMsg(){
        return getMessage(FORGET_PASSWORD_CONFIRMATION);
    }


    private Optional<String> getMessage(By locator) {
        Optional<WebElement> error = getElement(locator);
        if (error.isPresent()) {
            WebElement errorElement = error.get();
            return Optional.of(errorElement.getText());
        } else {
            return Optional.empty();
        }
    }

    private Optional<WebElement> getElement(By locator) {
        List<WebElement> elements = driver.findElements(locator);
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        } else {
            return Optional.empty();
        }
    }
}