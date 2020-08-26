package Base;

import Pages.*;
import org.testng.annotations.*;
import utilis.Scroll;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class ProfileTests extends BaseTests {


/*
    @Test

    public void ClickProfileLink() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        ProfilePage profilePage = discoveryPage.clickProfileLink();
        assertEquals(profilePage.getProfileTitle(), "Circle");
    }

    @Test
    public void SuccessfullLogin() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        ProfilePage profilePage = discoveryPage.clickProfileLink();
        profilePage.signInButton();
        LogInScreen logInScreen = signInOptions.clickLoginBtn();
        logInScreen.SetUserEmail("alaa.emadeldin@hotmail.com");
        logInScreen.SetPassword("Password123-");
        DiscoveryPage discoveryPage = logInScreen.clickLoginBtn();
        discoveryPage.clickProfileLink();

        assertEquals(profilePage.getUserNameTx(), "Hazem Emad");
    }

    @Test
    public void LogOut() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        ProfilePage profilePage = discoveryPage.clickProfileLink();
        profilePage.signInButton();
        LogInScreen logInScreen = signInOptions.clickLoginBtn();
        logInScreen.SetUserEmail("alaa.emadeldin@hotmail.com");
        logInScreen.SetPassword("Password123-");
        DiscoveryPage discoveryPage = logInScreen.clickLoginBtn();
        discoveryPage.clickProfileLink();

        profilePage.logOutButton();
        discoveryPage.clickProfileLink();
        assertEquals(profilePage.getUserNameTx(), "Access your cart & Favourite products from any of your devices.");

    }

    @Test
    public void UnSuccessfullLogin() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        ProfilePage profilePage = discoveryPage.clickProfileLink();
        profilePage.signInButton();
        LogInScreen logInScreen = signInOptions.clickLoginBtn();
        logInScreen.SetUserEmail("alaadfddf.emadeldin@hotmail.com");
        logInScreen.SetPassword("Password123-");
        DiscoveryPage discoveryPage = logInScreen.clickLoginBtn();
        discoveryPage.clickProfileLink();


        assertEquals(profilePage.getUserNameTx(), "Hazem Emad");

    }
*/
}