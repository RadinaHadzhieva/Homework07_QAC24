package frontend;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.YourStorePage;

public class YourStorePageTest extends BaseTest {

    @Test
    public void checkShoppingCartIsEmpty() {
        YourStorePage.goTo();
        YourStorePage.clickShoppingCartButton();
        YourStorePage.verifyMessageText("Your shopping cart is empty!");
        YourStorePage.clickContinueButton();
        YourStorePage.verifyMessageText("Featured");
    }
}
