package pages.admin_area;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;


public class LoginPage {

    @FindBy(id = "input-username")
    private static WebElement usernameInputField;

    @FindBy(id = "input-password")
    private static WebElement passwordInputField;

    @FindBy(className = "btn-primary")
    private static WebElement loginButton;

    @FindBy(className = "alert-danger")
    private static WebElement alertMessage;

    @FindBy(className = "panel-title")
    private static WebElement panelTitle;

    static {
        PageFactory.initElements(Browser.driver, LoginPage.class);
    }

    /**
     * This method redirects you to the 'Login' page.
     */
    public static void goTo() {
        Browser.driver.get("https://shop.pragmatic.bg/admin/");
    }

    /**
     * This method tries to log you in with the provided credentials.
     *
     * @param username The username that you want to log in with.
     * @param password The password that you want to log in with.
     */
    public static void login(String username, String password) {
        writeInTheUsernameInputField(username);
        writeInThePasswordInputField(password);
        clickLoginButton();
    }

    /**
     * Writes text in the 'Username' input field.
     *
     * @param username The username that you want to log in with.
     */
    private static void writeInTheUsernameInputField(String username) {
        usernameInputField.sendKeys(username);
    }

    /**
     * Writes text in the 'Password' input field.
     *
     * @param password The password that you want to log in with.
     */
    private static void writeInThePasswordInputField(String password) {
        passwordInputField.sendKeys(password);
    }

    /**
     * Clicks the 'Login' button.
     */
    private static void clickLoginButton() {
        loginButton.click();
    }

    /**
     * Asserts if the expected validation message is contained when trying to login
     * with wrong credentials
     *
     * @param expectedAlertMessageText the expected validation message
     */

    public static void alertMessage(String expectedAlertMessageText) {
        Assert.assertTrue(alertMessage.getText().contains(expectedAlertMessageText));
    }

    /**
     * Verifies that the user is log out.
     *
     * @param expectedMessageText The expected visible texh.
     */
    public static void verifyUserIsLogOut(String expectedMessageText) {
        Assert.assertEquals(panelTitle.getText(), expectedMessageText);
    }
}
