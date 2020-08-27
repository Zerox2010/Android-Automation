package Pages.BottomBar;

import Pages.Home.DiscoveryPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class DealsPage {
    static AppiumDriver<MobileElement> driver;

    private By screenTitle = By.id("com.trycircle.android.qa:id/screenTitle");
    @AndroidFindBy(tagName = "sadasdsadsadsadsad")
    private AndroidElement button;

    public DealsPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private void clickLink(String LinkID) {
        driver.findElement(By.id(LinkID)).click();
    }

    public String getPageTitle() {
        return driver.findElement(screenTitle).getText();
    }

    /*
        public DiscoveryPage backButton() {
        button.click();
        return new DiscoveryPage(driver);
        }
        */
    public DiscoveryPage backButton() {
        clickLink("com.trycircle.android.qa:id/btnBack");
        return new DiscoveryPage(driver);
    }

}