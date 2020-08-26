package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utilis.Scroll;

import java.util.HashMap;
import java.util.Map;

public class ProfilePage {
    static AppiumDriver<MobileElement> driver;
    protected Scroll scroll;

    private By profileTitle = By.id("com.trycircle.android.qa:id/tvHomeLabel");
    private By circleSlogan = By.id("com.trycircle.android.qa:id/tvCircleSlogan");
    private By userNameTxt = By.id("com.trycircle.android.qa:id/tvUserName");


    public ProfilePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;

    }
    private void clickLink(String LinkID) {
        driver.findElement(By.id(LinkID)).click();
    }

    public String getProfileTitle() {
        return driver.findElement(profileTitle).getText();
}

    public String getCircleSlogan() {
        return driver.findElement(circleSlogan).getText();
    }

    public String getUserNameTx() { return driver.findElement(userNameTxt).getText();}


    public SignInOptions signInButton() {
        clickLink("com.trycircle.android.qa:id/tvUserNamePlaceHolder");
        return new SignInOptions(driver);
    }

    public DiscoveryPage logOutButton() {
        Scroll scroll = new Scroll(driver);
       scroll.swipeToElement("Log Out");
        return new DiscoveryPage(driver);
    }

/*
    public DiscoveryPage logOutButton() {
        MobileElement elementToClick = (MobileElement) driver
                .findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable("
                                + "new UiSelector().scrollable(true)).scrollIntoView("
                                + "new UiSelector().textContains(\"Log Out\"));"));
        elementToClick.click();

        return new DiscoveryPage(driver);
    }
*/

}
