package admin_area.positive;


import core.BaseTest;
import org.testng.annotations.Test;
import pages.admin_area.DashBoardPage;
import pages.admin_area.LoginPage;

public class LogOutTest extends BaseTest {

    @Test
    public void logOutSuccessfully() {
        LoginPage.goTo();
        LoginPage.login("admin", "parola123!");
        DashBoardPage.clickLogOutButton();
        LoginPage.verifyUserIsLogOut("Please enter your login details.");
    }
}
