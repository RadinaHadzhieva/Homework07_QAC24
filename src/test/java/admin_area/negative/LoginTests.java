package admin_area.negative;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.admin_area.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void loginUnSuccessfully() {
        LoginPage.goTo();
        LoginPage.login("admin", "parola123");
        LoginPage.alertMessage("password.");
    }
}
