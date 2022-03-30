package pages.admin_area;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;

public class DashBoardPage extends BasePage {

    @FindBy(xpath = "//*[@id='user-profile']/..")
    private static WebElement userInfo;

    @FindBy(className = "fa-sign-out")
    private static WebElement logOutButton;

    static {
        PageFactory.initElements(Browser.driver, DashBoardPage.class);
    }

    /**
     * Verifies that the firstname and the lastname of the user are as expected.
     *
     * @param expectedFirstNameAndLastNameOfTheUser The expected firstname and the lastname of the user.
     */
    public static void verifyUserInfoText(String expectedFirstNameAndLastNameOfTheUser) {
        Assert.assertEquals(userInfo.getText(), expectedFirstNameAndLastNameOfTheUser);
    }

    /**
     * Clicks the 'Logout' button.
     */
    public static void clickLogOutButton() {
        logOutButton.click();
    }
}
