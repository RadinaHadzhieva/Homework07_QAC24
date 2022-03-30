package pages.frontend;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;

public class YourStorePage extends BasePage {

    @FindBy(className = "fa-shopping-cart")
    private static WebElement shoppingCartButton;

    private static final By MESSAGE = By.id("content");

    @FindBy(className = "btn-primary")
    private static WebElement continueButton;

    static {
        PageFactory.initElements(Browser.driver, YourStorePage.class);
    }

    /**
     * This method redirects you to the 'YourStore' page.
     */
    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg");
    }

    /**
     * Clicks the 'ShoppingCart' button.
     */
    public static void clickShoppingCartButton() {
        shoppingCartButton.click();
    }

    /**
     * Verifies the visibleMessageText.
     *
     * @param expectedMessageText The expected text on the page.
     */
    public static void verifyMessageText(String expectedMessageText) {
        waitForElementVisibility(MESSAGE, 3);
        String actualValidationMessage = Browser.driver.findElement(MESSAGE).getText();
        Assert.assertTrue(actualValidationMessage.contains(expectedMessageText));
    }

    /**
     * Clicks the 'Continue' button.
     */
    public static void clickContinueButton() {
        continueButton.click();
    }


}
