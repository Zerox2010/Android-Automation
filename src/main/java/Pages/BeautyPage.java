package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BeautyPage {
    static AppiumDriver<MobileElement> driver;

    private By screenTitle = By.id("com.trycircle.android.qa:id/screenTitle");
    private By backbtn = By.id("com.trycircle.android.qa:id/btnBack");


    public BeautyPage (AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }
    private void clickLinkByID(String LinkID) {
        driver.findElement(By.id(LinkID)).click();
    }

    public String getBeautyTitle() {
        return driver.findElement(screenTitle).getText();
    }

    public DiscoveryPage backButton() {
        clickLinkByID("com.trycircle.android.qa:id/btnBack");
        return new DiscoveryPage(driver);
    }
}
